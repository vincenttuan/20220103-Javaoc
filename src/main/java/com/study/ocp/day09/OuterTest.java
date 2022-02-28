package com.study.ocp.day09;

import com.study.ocp.day09.Outer.SInner;
import com.study.ocp.day09.Outer.SInner.Foo;

public class OuterTest {

	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.callMe();
		ou.foo();
		//-----------------------------------
		Outer.SInner os = new Outer.SInner();
		os.printMe();
		os.printMe2();
		SInner.printMe();
		Foo.bar();
	}

}
