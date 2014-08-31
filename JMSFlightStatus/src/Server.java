import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class Server implements MessageListener 
{
	private Connection connection;
	private Session session;
	private MessageConsumer consumer;
	private Queue StatusQueue; 
	private FlightStatus status=new FlightStatus();
	

	public void sendReply(Message request, String returnData)
	{
		System.out.println("Inside send reply");
		try
		{
			MessageProducer MP = session.createProducer(null);
			Destination reply = request.getJMSReplyTo();
			TextMessage TM = session.createTextMessage();
			TM.setText(""+returnData);
			MP.send(reply, TM);
			
		}
		catch(JMSException JMSE)
		{
			System.out.println("JMS Exception: "+JMSE);
		}
	}

	
	public static void main(String args[])
	{
		new Server();
	}
	@Override
	public void onMessage(Message message) {
		TextMessage TM = (TextMessage)message;
		String reply = null;
		String[] input = null;
		try
		{
			if( TM.getText().startsWith("Status"))
			{
				System.out.println("inside  server");
				input = TM.getText().split(",");
				reply=status.getInfo(Integer.parseInt(input[1]));
				System.out.println("reply in server "+reply);
				sendReply(message, reply);
			}
			
		}
		catch(JMSException JMSE)
		{
			System.out.println("JMS Exception: "+JMSE);
		}

		
	}
	
	
	public Server()
	{
		try
		{
			Properties properties = new Properties();
		    properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		    properties.put(Context.URL_PKG_PREFIXES, "org.jnp.interfaces");
		    properties.put(Context.PROVIDER_URL, "localhost");
		    
		   	InitialContext jndi = new InitialContext(properties);
			ConnectionFactory conFactory = (ConnectionFactory)jndi.lookup("XAConnectionFactory");
			connection = conFactory.createConnection();
			session = connection.createSession( false, Session.AUTO_ACKNOWLEDGE );
		
			StatusQueue = (Queue)jndi.lookup("queue/StatusQueue");
			
			if(null==StatusQueue)
			{
				StatusQueue = session.createQueue("StatusQueue");
				jndi.bind("StatusQueue", StatusQueue);

			}
			consumer=session.createConsumer(StatusQueue);
			consumer.setMessageListener(this);

			System.out.println("Server started and waiting for client requests");
			connection.start();
		}
		catch(NamingException NE)
		{
			System.out.println("Naming Exception: "+NE);
		}
		catch(JMSException JMSE)
		{
			System.out.println("JMS Exception: "+JMSE);
			JMSE.printStackTrace();
		}
	}
	

}
