package package1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str,reverse="";
		System.out.println("Enter the String you want to reverse");
	    Scanner scan= new Scanner(System.in);
	    str=scan.nextLine();
	    
	    int rev = str.length();
	    
	    for(int i=rev-1;i>=0;i--) {
	    	reverse= reverse+ str.charAt(i);
	    	
	    }
	    System.out.println(reverse);
	}
}
