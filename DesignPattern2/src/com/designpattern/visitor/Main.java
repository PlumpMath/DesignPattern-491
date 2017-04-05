package com.designpattern.visitor;

public class Main {
public static void main(String[] args) {
	Shape square = new Square(4, 5);
	Shape circle =  new Circle(6);
	square.calc();
	circle.calc();
}
}
