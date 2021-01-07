package com.qa.main;

public class Calculator{
	
	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	
	public double mult(double num1, double num2) {
		double product= num1*num2;
		return product;
	}
	
	public double sub(double num1, double num2) {
		double difference=num1-num2;
		return difference;
	}
	
		
	//cant perform if num1<num2
	public double div(double num1, double num2) {
		double quotient= num1/num2;
		if (num1<num2){
			System.out.println("Division cannot be performed.");
		}
		else {
			System.out.println(quotient);
		}
		return quotient;
	}

}

	

