package com.designpattern.model;

import com.designpattern.model.inf.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square draw");
	}

}
