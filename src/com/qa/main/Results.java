package com.qa.main;

import java.lang.Math;
public class Results {
	
	double maxMark= 450;
	double maxSubj=150;
	int physics;
	int chemistry;
	int biology;
	int total;
	double percentage;
	
	
	//setters for grades if needed
	public void setPhysics(int physicsMark) {
		this.physics= physicsMark;
	}
	
	public void setChemistry(int chemistryMark) {
		this.chemistry= chemistryMark;
	}
	
	public void setBiology(int biologyMark) {
		this.biology= biologyMark;
	}
	
	//method1
	public int reportCard() {
		int total= physics+chemistry+biology;
		this.total=total;
		System.out.println("- - Report Card - -");
		System.out.println((String)("Physics Mark: "+ physics + "/150"));
		System.out.println((String)("Chemistry Mark: " + chemistry + "/150"));
		System.out.println((String)("Biology Mark: " + biology + "/150"));
		System.out.println((String)("Total Mark: " + total + "/450"));
		return total;
		
	}
//	
//	public double percentage1() {
//		double percent= (double) (total/maxMark)*100;
//		System.out.println("Overall Percentage: "+ percent + "%");
//		if (percent>=60) {
//			System.out.println("COngratulations! You passed!");
//		}
//		else {
//			System.out.println("Sorry. You failed.");
//		}
//		return percent;
//	}
//	//fail if failed 1 subject at least
//	public double percentage2() {
//		double percent= (double) (total/maxMark)*100;
//		double percentPhysics= (double)(physics/150*100);
//		double percentChemistry= (double)(chemistry/150*100);
//		double percentBiology= (double)(biology/150*100);
//		boolean isAllPass= (percentBiology>60 && percentChemistry>60 && percentPhysics>60);
//		System.out.println("Overall Percentage: "+ percent + "%");
//		if (percent>=60 && isAllPass) {
//			System.out.println("COngratulations! You passed!");
//		}
//		else if (percent>=60 &&!isAllPass){
//			System.out.println("Sorry. You failed at least one subject.");
//		}
//		return percent;
//	}
	
	//display how many subjects failed
	int subjectsFailed = 0;
	public double percentage3() {
		double percent= (double) (total/maxMark)*100;
		double percentPhysics= (physics/maxSubj*100);
		double percentChemistry= (chemistry/maxSubj*100);
		double percentBiology= (biology/maxSubj*100);
		//counting passed
		if (percentBiology<60) {
			this.subjectsFailed++;
		}
		if (percentPhysics<60) {
			this.subjectsFailed++;
		}
		if (percentChemistry<60) {
			this.subjectsFailed++;
		}
		System.out.println("Overall Percentage: "+ percent + "%");
		
		if (percent>=60 && subjectsFailed==0) {
			System.out.println("COngratulations! You passed!");
		}
		else if (subjectsFailed==1){
			System.out.println("Sorry. You failed one subject.");
		}
		else if (subjectsFailed==2){
			System.out.println("Sorry. You failed two subjects.");
		}
		else if (subjectsFailed==3){
			System.out.println("Sorry. You failed all subjects.");
		}
		return percent;
	}
	
	
	
	//overall percentage rounded to the nearest integer
	public int percentageRounded() {
		double percent= (double) (total/maxMark)*100;
		int percentRounded= (int) Math.round(percent);
		System.out.println("Overall Rounded Percentage: "+ percentRounded + "%");
		return percentRounded;
	}

}
