package com.qa.main;

public class Blackjack {
	
	int winner;
	public int play(int num1, int num2) {
		int diff1=21-num1;
		int diff2=21-num2;
		if (num1<=0 || num2<=0) {
			System.out.println("Values have to be greater than zero.");
		}
		else {
			if (num1>=21 && num2>=21) {
		
				System.out.println(0);
			}
			else if (diff2>=diff1 &&diff1>=0) {
				System.out.println(num1);
				this.winner=num1;
			}

			else {
				System.out.println(num2);
				this.winner=num2;
			}
		}	
		
		
		return winner;
	}
}
