
package com.capgemini.com.Day2;


public class ArrayDifference {

	public static  boolean ArrayDifferenceCheck(int n,int intArray[],int key) {
		int i,j;
		//Scanner scan=new Scanner(System.in);
	    //a=scan.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if((intArray[i]==intArray[j]) && (Math.abs(i-j)<=key))
				
					return true;
					
				
				
				
			}
			//System.out.println("no");
			
		}
		return false;
		
		
	}

}
