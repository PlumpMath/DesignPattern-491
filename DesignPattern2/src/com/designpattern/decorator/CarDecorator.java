package com.designpattern.decorator;

public class CarDecorator implements Car {
	Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		this.car.run();
	}

}
