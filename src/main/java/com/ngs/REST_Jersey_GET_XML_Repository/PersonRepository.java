package com.ngs.REST_Jersey_GET_XML_Repository;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

	List<Person> persons;

	public PersonRepository() {
		
		persons=new ArrayList<Person>();

		Person p1 = new Person();
		p1.setPid(1);
		p1.setPname("Dhruv");

		persons.add(p1);
	}

	public List<Person> getPersons() {
		return persons;

	}
	
	public Person getPerson(int id) {
		for (Person p : persons) {
			if (p.getPid() == id)
				return p;
		}
		return null;
	}
}
