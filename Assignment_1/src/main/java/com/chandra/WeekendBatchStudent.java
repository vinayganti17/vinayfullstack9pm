package com.chandra;

public class WeekendBatchStudent extends Student {
	public double calcualteFee(String course) {
		double fee = 0;
		double weekEndFee = 8000;
		if (course.equals("java")) {
			fee = 18000;
		} else if (course.equals("ui")) {
			fee = 15000;
		} else if (course.equals("tools")) {
			fee = 10000;
		}
		return fee + weekEndFee;
	}
}
