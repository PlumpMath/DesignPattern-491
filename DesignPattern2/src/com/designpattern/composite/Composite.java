package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {
	private List<BaseComponent> leave = new ArrayList<>();

	private void add(BaseComponent baseComponent) {
		this.leave.add(baseComponent);
	}

	private void draw() {
		this.leave.forEach(item -> item.draw());

	}
	public static void main(String[] args) {
		Composite composite = new Composite();
		composite.add(new Leaf1());
		composite.add(new Leaf2());
		composite.add(new Leaf1());
		composite.add(new Leaf2());
		composite.draw();
	}
}
