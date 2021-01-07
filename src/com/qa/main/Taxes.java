package com.qa.main;

public class Taxes {

	//method 1
	public double taxPercent(int salary) {
		if (salary<15000) {
			System.out.println("0% tax");
			return 0.0;
		}
		else if (salary<20000) {
			System.out.println("10% tax");
			return 0.1;
		}
		else if (salary <30000) {
			System.out.println("15% tax");
			return 0.15;
		}
		else if (salary<45000) {
			System.out.println("20% tax");
			return 0.2;
		}
		else {
			System.out.println("25% tax");
			return 0.25;
		}
	}
	
	//method 2
	double tax;
	public double taxAmount(int salary) {
		if (salary<15000) {
			this.tax=salary*0;
			System.out.println(tax);
		}
		else if (salary<20000) {
			this.tax=salary*0.1;
			System.out.println(tax);
		}
		else if (salary <30000) {
			this.tax=salary*0.15;
			System.out.println(tax);
		}
		else if (salary<45000) {
			this.tax=salary*0.2;
			System.out.println(tax);
		}
		else {
			this.tax=salary*0.25;
			System.out.println(tax);
		}
		return tax;
	}
	
	//combined
	public double taxAmount1(int salary) {
		double tax=salary*taxPercent(salary);
		return tax;
	}
}
