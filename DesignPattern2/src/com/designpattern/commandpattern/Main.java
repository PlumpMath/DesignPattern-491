package com.designpattern.commandpattern;

public class Main {
	public static void main(String[] args) {
		PersonCommand personCommand = new PersonCommand();
		personCommand.addPerson(new Teacher());
		personCommand.addPerson(new Student());
		personCommand.addPerson(new Teacher());
		personCommand.addPerson(new Student());
		personCommand.execute();
	}
}
