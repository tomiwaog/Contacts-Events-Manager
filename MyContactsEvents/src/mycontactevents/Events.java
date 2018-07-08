package mycontactevents;

import java.time.LocalDate;

abstract class Events {
	String eventName = getClass().getSimpleName();
	LocalDate eventDate;
	String details;

	public String getEventName() {
		return eventName.toString();
	}

	abstract void setDetail(String details);
	
	String getEventDetails() {
		String result = details = "Event Name: " + eventName + "\nDate: "
				+ eventDate + "\n" + "more info: " + details + "\n";
		return result;
	}
}
