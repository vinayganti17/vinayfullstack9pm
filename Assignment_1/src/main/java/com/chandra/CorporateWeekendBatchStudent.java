package com.chandra;

public class CorporateWeekendBatchStudent extends Student {
	public double calcualteFee(String course) {
		double fee = 0;
		double corporateWeekEndFee = 18000;
		if (course.equals("java")) {
			fee = 18000;
		} else if (course.equals("ui")) {
			fee = 15000;
		} else if (course.equals("tools")) {
			fee = 10000;
		}
		return fee + corporateWeekEndFee;
	}
}
