package com.study.ocp.day08_2;

public class EDog implements Dog {
//public class EDog extends ADog {

	@Override
	public void eat() {
		System.out.println("吃電");
	}

	@Override
	public void skill() {
		System.out.println("玩");
	}

}
