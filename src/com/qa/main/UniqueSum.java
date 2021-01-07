package com.qa.main;

public class UniqueSum {
	
	public int uniqueSum(int x, int y, int z) {
		int sum=x;
		if (x!=y && x!=z && y!=z) {
			sum=sum+y+z;
		}
		else if (x!=y) {
			sum+=y;
		}
		else if (x!=z) {
			sum+=z;
		}
		System.out.println(sum);
		return sum;
	}
}
