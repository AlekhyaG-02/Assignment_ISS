package com.loop.decision_making;

public class SwitchStatement {

	public static void main(String[] args) {
		int dayOfWeek = 2;

		//Switch statement
		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		// ... other cases ...
		default:
			System.out.println("Invalid day");
		}
	}
}
