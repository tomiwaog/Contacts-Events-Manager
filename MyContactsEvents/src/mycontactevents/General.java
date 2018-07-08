package mycontactevents;

import java.time.LocalDate;

public class General extends Events {
	General(String name){
		this(name,null);
	}
	
	General(String name, LocalDate date){
		eventName = name;
		eventDate = date;
		details = "";
	}

	@Override
	void setDetail(String details) {
		this.details = details;
		
	}
}
