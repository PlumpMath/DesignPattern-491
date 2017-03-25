
package com.designpattern.singleton;

import com.designpattern.model.SignletonModel;
import com.designpattern.model.Square;
import com.designpattern.model.inf.Shape;

public class SignlePattern {
	public static void main(String[] args) {
		SignletonModel.getInstance().draw();
		SignletonModel.getInstance().draw();
		SignletonModel.getInstance().draw();
	}
}
