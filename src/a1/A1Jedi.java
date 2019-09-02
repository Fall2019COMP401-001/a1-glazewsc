package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numOfItems = scan.nextInt();
		String[] itemName = new String[numOfItems];
		double[] itemCost = new double[numOfItems];
		
		for (int i=0; i<numOfItems; i++) {
			itemName[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		
		int numOfPeople = scan.nextInt();
		String[] nameItemsForEach = new String[numOfPeople];
		
		for (int x=0; x<numOfPeople; x++) {
			String ignoreFirstName = scan.next();
			String ignoreLastName = scan.next();
			int numOfPurchased = scan.nextInt();
			int[] totalItems = new int[numOfPurchased];
			
			for (int j=0; j<numOfPurchased; j++) {
				int quantityOfItems = scan.nextInt();
				nameItemsForEach[j] = scan.next();
				for (int a=0; a<numOfItems; a++) {
					if (nameItemsForEach[j].equals(itemName[a])) {
						totalItems[a] = totalItems[a] + quantityOfItems;
					}
				}
			}
			
		}
		
		
		
		
		

	}
}