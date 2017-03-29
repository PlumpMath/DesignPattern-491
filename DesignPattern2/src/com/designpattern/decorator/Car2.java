package com.designpattern.decorator;

public class Car2 extends CarDecorator {

	public Car2(Car car) {
		super(car);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("car 2 run");
	}

}
