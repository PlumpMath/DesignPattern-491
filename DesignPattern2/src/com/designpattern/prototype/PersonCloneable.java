package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonCloneable implements Cloneable {
	private List<String> data;

	public PersonCloneable() {
		this.setData(new ArrayList<>());
	}

	public PersonCloneable(List<String> data) {
		this.setData(data);
	}

	private void loadData() {
		System.out.println("Load data");
		this.data.add("A");
		this.data.add("B");
		this.data.add("C");
		this.data.add("D");
		this.data.add("E");
	}

	@Override
	protected Object clone() {
		List<String> temp = new ArrayList<>();
		this.data.forEach(item -> temp.add(item));
		return new PersonCloneable(temp);
	}

	List<String> getData() {
		return data;
	}

	void setData(List<String> data) {
		this.data = data;
	}

	public static void main(String[] args) {
		PersonCloneable original = new PersonCloneable();
		original.loadData();
		PersonCloneable p1 = (PersonCloneable) original.clone();
		PersonCloneable p2 = (PersonCloneable) original.clone();
		p1.getData().remove(2);
		p2.getData().remove(3);

		System.out.println(original.getData());
		System.out.println(p1.getData());
		System.out.println(p2.getData());
		Arrays.asList(1,2,3);

	}

}
