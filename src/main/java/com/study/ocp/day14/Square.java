package com.study.ocp.day14;

public class Square {
	private int w, h;
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public int getArea() {
		int result = w * h;
		return result;
	} 
	
}
