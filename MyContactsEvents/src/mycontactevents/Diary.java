package mycontactevents;

import java.util.ArrayList;

public class Diary {
	private String diaryUser;
	private ArrayList<Person> myContacts;

	Diary() {
		this("Guest User");
	}

	Diary(String user) {
		diaryUser = user;
		myContacts = new ArrayList<>();
	}

	public String getDiaryUser() {
		return diaryUser;
	}

	public ArrayList<Person> getMyContacts() {
		return myContacts;
	}

	public boolean addContacts(Person person) {
		if (myContacts.contains(person)) {
			return false;
		}
		myContacts.add(person);
		return true;
	}
}
