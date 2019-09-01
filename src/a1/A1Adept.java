package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numOfItems = scan.nextInt();
		double[] itemCost = new double[numOfItems];
		String[] item = new String[numOfItems];
		
		for (int i=0; i<numOfItems; i++) {
			item[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		
		int numCustomers = scan.nextInt();
		double[] totalPrice = new double[numCustomers];
		String[] customer = new String[numCustomers];
		
		
		
		
	}
}
