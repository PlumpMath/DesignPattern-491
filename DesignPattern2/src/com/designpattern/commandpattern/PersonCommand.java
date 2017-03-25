package com.designpattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class PersonCommand {
	List<Person> persons =new ArrayList<>();
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		this.persons.add(person);

	}
	public void execute(){
		this.persons.forEach(item -> item.go());
		
	}
}
