package com.designpattern.model;

import java.util.Date;

public class SignletonModel {
	private static SignletonModel instance = new SignletonModel();
	private Date date = new Date();
	private SignletonModel(){}
	public void draw(){
		System.err.println(date.getTime()+"");
		
		
	}
	
	public static SignletonModel getInstance() {
		return instance;
	}
	
}
