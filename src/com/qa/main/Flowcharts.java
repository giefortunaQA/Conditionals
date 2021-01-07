package com.qa.main;

public class Flowcharts {

	//1.
	public int opIf(int num1, int num2, boolean opCondition) {
		if (opCondition==true) {
			int sum=num1+num2;
			return sum;
		}
		else {
			int prod=num1*num2;
			return prod;
		}
	}
	
	//2.
	int A;
	public int setA(int A) {
		this.A=A;
		return A;
	}
	
	public String bigFlow(int A) {
		if (A>2000) {
			System.out.println("A");
			if (A>6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if (A>4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if (A>100) {
				System.out.println("3");
				if (A>600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if (A>500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
		return null;
	}
}
