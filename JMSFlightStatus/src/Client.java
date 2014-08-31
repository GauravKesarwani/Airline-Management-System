import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class Client {

	private Connection connection;
	private Session session;
	private MessageConsumer consumer, queueConsumer;
	private Queue StatusQueue, replyQueue;
	static String reply =null;
	
	public Client()
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
	
	
			connection.start();
		}
		catch(NamingException NE)
		{
			System.out.println("Naming Exception: "+NE);
		}
		catch(JMSException JMSE)
		{
			System.out.println("JMS Exception: "+JMSE);
		}
	}


	public void FlightInfo(int flightId) throws JMSException
	{
		System.out.println("inside clinet startrs");
		MessageProducer MP = session.createProducer(StatusQueue);
		TextMessage TM = session.createTextMessage("Status,"+flightId);
		replyQueue=session.createTemporaryQueue();
		consumer=session.createConsumer(replyQueue);
		TM.setJMSReplyTo(replyQueue);
		MP.send(TM);
		TextMessage Reply = (TextMessage)consumer.receive();
		reply=Reply.getText();
		System.out.println("and reply is "+reply);
		System.out.println("inside login clinet ends");
	}
	
	public static void main(String[] args) {
		Client cl=new Client();
		try {
			cl.FlightInfo(1);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
