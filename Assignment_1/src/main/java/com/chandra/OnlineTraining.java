package com.chandra;

import java.util.Scanner;

public class OnlineTraining {

	public static void main(String[] args) {
		FastTrackBatchStudent fbs = new FastTrackBatchStudent();
		CorporateBatchStudent cbs = new CorporateBatchStudent();
		WeekendBatchStudent wbs = new WeekendBatchStudent();
		CorporateWeekendBatchStudent cwbs = new CorporateWeekendBatchStudent();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("| ONLINE TRAINING MANAGEMENT SYSTEM|");
			System.out.println("------------------------------------");
			System.out.println("| 1. FAST TRACK BATCH              |");
			System.out.println("| 2. CORPORATE BATCH               |");
			System.out.println("| 3. WEEKEND BATCH                 |");
			System.out.println("| 4. CORPORATE WEEKEND BATCH       |");
			System.out.println("| 5. EXIT                          |");
			System.out.println("-------------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Student Id ?");
				fbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				fbs.setName(sc.next());
				System.out.println("Enter Student Mobile Number ?");
				fbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				fbs.setAddress(sc.next());
				System.out.println("Select Which Course  Do you want ? 1. Java 2. UI 3. Tools");
				int ch = sc.nextInt();
				if (ch == 1) {
					fbs.setCourse("java");
				} else if (ch == 2) {
					fbs.setCourse("ui");
				} else if (ch == 3) {
					fbs.setCourse("tools");
				}
				System.out.println("Student Id      :    " + fbs.getStudentId());
				System.out.println("Student Name    :    " + fbs.getName());
				System.out.println("Student MobileNo:    " + fbs.getMobileNo());
				System.out.println("Student Address :    " + fbs.getAddress());
				System.out.println("Course Fee      :    " + fbs.calcualteFee(fbs.getCourse()));
				break;
			case 2:
				System.out.println("Enter Student Id ?");
				cbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				cbs.setName(sc.next());
				System.out.println("Enter Student Mobile Number ?");
				cbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				cbs.setAddress(sc.next());
				System.out.println("Select Which Course  Do you want ? 1. Java 2. UI 3. Tools");
				int ch1 = sc.nextInt();
				if (ch1 == 1) {
					cbs.setCourse("java");
				} else if (ch1 == 2) {
					cbs.setCourse("ui");
				} else if (ch1 == 3) {
					cbs.setCourse("tools");
				}
				System.out.println("Student Id      :    " + cbs.getStudentId());
				System.out.println("Student Name    :    " + cbs.getName());
				System.out.println("Student MobileNo:    " + cbs.getMobileNo());
				System.out.println("Student Address :    " + cbs.getAddress());
				System.out.println("Course Fee      :    " + cbs.calcualteFee(cbs.getCourse()));
				break;
			case 3:
				System.out.println("Enter Student Id ?");
				wbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				wbs.setName(sc.next());
				System.out.println("Enter Student Mobile Number ?");
				wbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				wbs.setAddress(sc.next());
				System.out.println("Select Which Course  Do you want ? 1. Java 2. UI 3. Tools");
				int ch2 = sc.nextInt();
				if (ch2 == 1) {
					wbs.setCourse("java");
				} else if (ch2 == 2) {
					wbs.setCourse("ui");
				} else if (ch2 == 3) {
					wbs.setCourse("tools");
				}
				System.out.println("Student Id      :    " + wbs.getStudentId());
				System.out.println("Student Name    :    " + wbs.getName());
				System.out.println("Student MobileNo:    " + wbs.getMobileNo());
				System.out.println("Student Address :    " + wbs.getAddress());
				System.out.println("Course Fee      :    " + wbs.calcualteFee(wbs.getCourse()));
				break;
			case 4:
				System.out.println("Enter Student Id ?");
				cwbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				cwbs.setName(sc.next());
				System.out.println("Enter Student Mobile Number ?");
				cwbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				cwbs.setAddress(sc.next());
				System.out.println("Select Which Course  Do you want ? 1. Java 2. UI 3. Tools");
				int ch3 = sc.nextInt();
				if (ch3 == 1) {
					cwbs.setCourse("java");
				} else if (ch3 == 2) {
					cwbs.setCourse("ui");
				} else if (ch3 == 3) {
					cwbs.setCourse("tools");
				}
				System.out.println("Student Id      :    " + cwbs.getStudentId());
				System.out.println("Student Name    :    " + cwbs.getName());
				System.out.println("Student MobileNo:    " + cwbs.getMobileNo());
				System.out.println("Student Address :    " + cwbs.getAddress());
				System.out.println("Course Fee      :    " + cwbs.calcualteFee(cwbs.getCourse()));
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1-5 only");
			}
		}

	}

}
