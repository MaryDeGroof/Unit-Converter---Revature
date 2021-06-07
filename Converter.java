package main;
import java.util.*;

public class Converter {
	public static void main(String[] args) {
		int menuSelection;
		float input = 0;
		System.out.println("Enter menu:");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		Scanner scan = new Scanner(System.in);
		
		menuSelection = scan.nextInt();
		
		while(menuSelection != 4) {
			switch(menuSelection) {
			case 1:
				System.out.println("Enter number of Cups.");
				input = scan.nextFloat();
				System.out.println(convertC(input));
				break;
			case 2:
				System.out.println("Enter number of Miles.");
				input = scan.nextFloat();
				System.out.println(convertM(input));
				break;
			case 3:
				System.out.println("Enter number of US Gallons.");
				input = scan.nextFloat();
				System.out.println(convertG(input));
				break;
			case 4:
				break;
			default:
				System.out.println("Unkown menu, enter 1, 2, 3, or 4.");
				break;
			}
			System.out.println("Enter next menu.");
			menuSelection = scan.nextInt();
		}
		System.out.println("Quitting...");
		scan.close();
	}
	public static float convertC(float input){
		float res = input * 48.00f;
		return res;
	}
	
	public static float convertM(float input){
		float res = input * 1.60934f;
		return res;
	}
	public static float convertG(float input){
		float res = input * 0.832674f;
		return res;
	}
}
