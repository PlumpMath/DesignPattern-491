package com.designpattern.visitor;

public class Square  implements Shape{
	int x, y;
	CalculatorVisitor visitor;

	public int getX() {
		return x;
	}

	public Square(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		visitor = new CalculatorVisitor();

	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void calc() {
		this.visitor.calc(this);
		
	}
}
