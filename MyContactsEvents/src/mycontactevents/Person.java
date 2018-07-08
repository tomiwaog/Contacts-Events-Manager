package mycontactevents;

import java.util.ArrayList;
import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dob;
	ArrayList<Events> userEvents;

	public Person(String name, LocalDate dob) {
		this.name = name;
		this.dob = dob;
		this.userEvents = new ArrayList<>();
		if (dob != null) {
			userEvents.add(Birthday.setBirthday(dob));
		}
	}

	public Person(String name) {
		this(name, null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean setBirthDay(LocalDate dob) {
		if (this.dob == null) {
			this.dob = dob;
			userEvents.add(Birthday.setBirthday(dob));
			return true;
		}
		return false;
	}


	public void getUserEventDetails() {
		System.out.println("Events for "+getName()+": ");
		System.out.println("-----------------------------------");
		for (Events eachEvent : userEvents) {
			System.out.println(eachEvent.getEventDetails());
		}
	}

	public boolean newEvent(Events newEvent) {
		userEvents.add(newEvent);
		return true;
	}
}
