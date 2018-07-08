package mycontactevents;

import java.time.LocalDate;

public class Birthday extends Events {

	private Birthday(LocalDate dob) {
		this.eventDate = dob;
		setDetail("Dont forget to say happy birthday!");
	}

	public static Birthday setBirthday(LocalDate dob) {
		return new Birthday(dob);
	}

	@Override
	public String toString() {
		return "Birthday is on the " + this.eventDate.toString();
	}

	@Override
	void setDetail(String details) {
		this.details = details;
	}
}
