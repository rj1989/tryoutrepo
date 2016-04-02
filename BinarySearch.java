package search.programs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,search,valueArray[],mid,low,high;
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
		
		low=0;
		high=n-1;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(valueArray[mid]<search)
			{
				low=mid+1;
			}
			else if(valueArray[mid]==search)
			{
				System.out.println("Element found!!!");
				break;
			}
			else
			{
				high=mid-1;
			}
			
		}
		if ( low > high )
		      System.out.println(search + " is not present in the list.\n");
		}
		
		

	}


