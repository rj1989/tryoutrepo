package pack.tryout;

import java.util.Scanner;

public class StairCaseProgram {

	public static void main(String[] args) 
	{
		System.out.println("enter the N value");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("#");
			}
			System.out.println();  
		}
	}

}
