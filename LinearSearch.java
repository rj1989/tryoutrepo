package search.programs;

import java.util.Scanner;

import com.documentum.dmcl.impl.NextHandler;

public class LinearSearch {

	public static void main(String[] args)
	{
		int i,n,search,valueArray[];
		System.out.println("Enter the number of elements");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		valueArray=new int[n];
	
		System.out.println("Enter the  elements now");
		for(i=0;i<n;i++)
		{
			valueArray[i]=in.nextInt();
		}
	
		System.out.println("Enter the  element to search");
		search=in.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(valueArray[i]==search)
			{
				System.out.println("element found!!! at position"+(i+1));
				break;
			}
			
		}
		if(i==n)
			System.out.println("element not found!!!");
		
	

	}

}
