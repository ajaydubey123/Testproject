package package1;

import java.util.Scanner;

public class SwapTwoNumber {
	
	public static void main(String[] args) {
		int x,y,temp;
		
		System.out.println("Enter the two numbers");
		
		Scanner scan= new Scanner(System.in);
		x=scan.nextInt();
		y= scan.nextInt();
		
		System.out.println("Before swapping, numbers are " +x+ " " +y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping numbers are " +x+ " "+y);
	
	}

}
