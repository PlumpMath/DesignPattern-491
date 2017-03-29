package com.designpattern.decorator;

public class Main {
public static void main(String[] args) {
	Car car  = new Car1(new Car2(new BasicCar()));
	car.run();
}
}
