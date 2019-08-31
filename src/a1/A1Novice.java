package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		String[] output = new String[times];
		
		for (int i=0; i<times; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int item = scan.nextInt();
			double totalAll = 0;
			
			for (int x=0; x<item; x++) {
				double numOfItems = scan.nextDouble();
				String itemName = scan.next();
				double cost = scan.nextDouble();
				
				totalAll += cost * numOfItems;	
			}
			
			
			output[i] = firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", totalAll);
			
		}
		
		for (int j=0; j<times; j++) {
			System.out.println(output[j]);
		}
		
	}
	
}
