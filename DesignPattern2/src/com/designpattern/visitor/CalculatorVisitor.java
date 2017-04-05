package com.designpattern.visitor;

public class CalculatorVisitor {

	public void calc(Square square){
		System.out.println(String.format("Calc square %s x %s", square.getX(),square.getY()));
	}
	public void calc(Circle circle){
		
		System.out.println(String.format("Calc circle %s ", circle.getX()));

	}
	
	
}
