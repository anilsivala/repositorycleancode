package Interest;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle,time,rateOfInterest,timesInterest;
		sc = new Scanner(System.in);
		System.out.println("Interest\n1. Simple Interest\n2. Compound Interest\nEnter Choice: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Principle: ");
			principle = sc.nextDouble();
			System.out.println("Enter Time: ");
			time = sc.nextDouble();
			System.out.println("Enter Rate Of Interest: ");
			rateOfInterest = sc.nextDouble();
			simpleInterest SIObject = new simpleInterest(principle,time,rateOfInterest);
			System.out.println("Total Interest to be paid is "+SIObject.evaluateSimpleInterest());
			break;
		case 2:
			System.out.println("Enter Principle: ");
			principle = sc.nextDouble();
			System.out.println("Enter Time: ");
			time = sc.nextDouble();
			System.out.println("Enter Rate Of Interest: ");
			rateOfInterest = sc.nextDouble();
			System.out.println("Enter Times the Interest to be paid: ");
			timesInterest = sc.nextDouble();
			compoundInterest CIObject = new compoundInterest(principle,time,rateOfInterest,timesInterest);
			System.out.println("Total Interest to be paid is "+CIObject.evaluateCompoundInterest());
			break;
		}
	}
}
