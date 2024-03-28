package com.promineotech;

public class TestDemo {
	public int addPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else throw new IllegalArgumentException();
	}
	public int multPositive(int a, int b) {
		if (a > 0 && b > 0)
			return a * b;
		else throw new IllegalArgumentException();
	}
	public int randomNumberSquared() {
		return (int)Math.pow((int)(Math.random()*10+1),2);
	}
}
