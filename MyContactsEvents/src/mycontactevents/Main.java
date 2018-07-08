package mycontactevents;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Person david = new Person("David Olabode");
		david.setBirthDay(LocalDate.of(1991, Month.FEBRUARY, 03));
		david.newEvent(new General("House Party", LocalDate.of(2020, Month.DECEMBER, 25)));

		Person vanessa = new Person("Vanessa Van");
		vanessa.setBirthDay(LocalDate.of(1991, Month.MARCH, 04));

		Diary tomDiary = new Diary();
		tomDiary.addContacts(david);
		tomDiary.addContacts(vanessa);

		for (Person eachPerson : tomDiary.getMyContacts()) {
			eachPerson.getUserEventDetails();
		}
	}

}
