package helperClasses;

import javax.jws.WebService;

import beanFiles.FlightDetailsBean;

@WebService
public class FlightDetailHelper {
	public FlightDetailsBean createNewFlight(FlightDetailsBean newFilght) {
		FlightDetailsBean flightDetail = new FlightDetailsBean();
		return flightDetail;
	}
	
	public FlightDetailsBean[] cancelFlight(int[] flightIds) {
		FlightDetailsBean[] flightDetail = new FlightDetailsBean[flightIds.length];
		return flightDetail;
	}
	
	public FlightDetailsBean[] updateFlights(FlightDetailsBean[] flights) {
		FlightDetailsBean[] flightDetail = new FlightDetailsBean[flights.length];
		return flightDetail;
	}
	
	public FlightDetailsBean[] getFlightByFlightIds(int flightIds[]) {
		FlightDetailsBean[] flight = new FlightDetailsBean[flightIds.length];
		return flight;
	}
	
	public FlightDetailsBean[] listAllFlights() {
		int size=0;
		return new FlightDetailsBean[size];
	}

}
