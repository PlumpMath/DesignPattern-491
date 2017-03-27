
package com.designpattern.singleton;

import com.designpattern.model.SignletonModel;

public class SignlePattern {
	public static void main(String[] args) {
		SignletonModel.getInstance().draw();
		SignletonModel.getInstance().draw();
		SignletonModel.getInstance().draw();
	}
}
