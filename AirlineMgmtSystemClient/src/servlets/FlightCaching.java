package servlets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fdpackage.FlightDetailsBean;

public class FlightCaching {
	public static Map<String, FlightDetailsBean[]> journeyToFlightsMap = new HashMap<String, FlightDetailsBean[]>();

	public static void updateCache(String oldKey, String newKey, FlightDetailsBean updatedBean) {
		
		if(journeyToFlightsMap!=null && journeyToFlightsMap.size()>0) {
			if(journeyToFlightsMap.containsKey(oldKey) && journeyToFlightsMap.get(oldKey)!=null) {
				List<FlightDetailsBean> flightList = Arrays.asList(journeyToFlightsMap.get(oldKey));
				for(int i=0; i<flightList.size(); i++) {
					if(flightList.get(i).getFlightId()==updatedBean.getFlightId()) {
						if(newKey.equals(oldKey)) {
							flightList.add(i, updatedBean);
						} else {
							flightList.remove(i);
						}
					}
				}
				journeyToFlightsMap.put(oldKey, (FlightDetailsBean[])flightList.toArray());
			}
			if(!oldKey.equals(newKey)) {
				if(journeyToFlightsMap.containsKey(newKey) && journeyToFlightsMap.get(newKey)!=null) {
					List<FlightDetailsBean> flightList = Arrays.asList(journeyToFlightsMap.get(newKey));
					flightList.add(updatedBean);
					journeyToFlightsMap.put(newKey, (FlightDetailsBean[])flightList.toArray());
				}
			}
		}
		
	}
	
	public static FlightDetailsBean[] fetchDataFromCache(String key) {
		System.out.println("Fetching data from cache for key : "+key);
		if(journeyToFlightsMap!=null && journeyToFlightsMap.size()>0) {
			if(journeyToFlightsMap.containsKey(key)) {
				return journeyToFlightsMap.get(key);
			} else {
				return null;
			}
		} else
			return null;
	}
	
	public static void storeDataInCache(String key, FlightDetailsBean[] flightBeans) {
		System.out.println("Storing data from cache : "+key);
		journeyToFlightsMap.put(key, flightBeans);
	}
	
	public static Map<String, FlightDetailsBean[]> getJourneyToFlightsMap() {
		return journeyToFlightsMap;
	}

	public static void setJourneyToFlightsMap(
			Map<String, FlightDetailsBean[]> journeyToFlightsMap) {
		FlightCaching.journeyToFlightsMap = journeyToFlightsMap;
	}
	
}