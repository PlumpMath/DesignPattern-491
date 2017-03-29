package com.designpattern.decorator;

public class Car1 extends CarDecorator {
	public Car1(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Car1 run");
	}
}
