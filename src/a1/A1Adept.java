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
		
		double itemPrice;
		int itemsBought;
		String product;
		
		for (int i=0; i<numCustomers; i++) {
			double tempTotal = 0;
			customer[i] = scan.next() + " " + scan.next();
			itemsBought = scan.nextInt();
			
			for (int x=0; x<itemsBought; x++) {
				itemPrice = scan.nextDouble();
				product = scan.next();
				
				for (int j=0; j<numOfItems; j++) {
					if (product.equals(item[j])) {
						tempTotal += (itemPrice * itemCost[j]);
					}
				}
			}
			
			totalPrice[i] = tempTotal;
			
		}
		
		double smallestTotal = totalPrice[0];
		double biggestTotal = totalPrice[0];
		String smallestCustomer = customer[0];
		String biggestCustomer = customer[0];
		double allTotals = 0;
		
		for (int i=0; i<totalPrice.length; i++) {
			if (totalPrice[i] > biggestTotal) {
				biggestCustomer = customer[i];
				biggestTotal = totalPrice[i];
			}
		}
		
		for (int i=0; i<totalPrice.length; i++) {
			if (totalPrice[i] < smallestTotal) {
				smallestCustomer = customer[i];
				smallestTotal = totalPrice[i];
			}
		}
		
		for (int i=0; i<totalPrice.length; i++) {
			allTotals += totalPrice[i];
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
