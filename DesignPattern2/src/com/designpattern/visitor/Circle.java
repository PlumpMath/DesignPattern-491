package com.designpattern.visitor;

public class Circle implements Shape {
	CalculatorVisitor visitor;
	public Circle(int x) {
		super();
		this.x = x;
		visitor = new CalculatorVisitor();
		
	}

	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void calc() {
		this.visitor.calc(this);


	}
}
