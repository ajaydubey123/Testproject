package package1;

import java.util.Scanner;

public class Pro1 {
	public static void main(String[] args) {
		
	  int i, n1=0,n2=1, n3,n;
	  
	  System.out.println(" Enter the number of series");
	  
	
	  Scanner scan= new Scanner(System.in);
	  n=scan.nextInt();
	  System.out.print(n1+" "+ n2 );
	  
	  for(i=0;i<=n;i++) {
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
		  System.out.print(" "+n3);
	  }
	  scan.close();
	}
}