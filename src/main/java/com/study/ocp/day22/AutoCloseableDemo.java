package com.study.ocp.day22;

class Bar implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Close Bar");
	}
}

class Foo implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Close Foo");
	}
}

public class AutoCloseableDemo {
	public static void main(String[] args) {
		try(Bar bar = new  Bar();
			Foo foo = new  Foo();) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
