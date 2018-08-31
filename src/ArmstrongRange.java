package com.capgemini.com.Day2;

public class ArmstrongRange {
	public static int[] armstrongRangeCheck(int range)
	{
		int i,digit,sum=0,temp,j=0;
		int intArray[]=new int[4];
		for(i=100;i<=range;i++)
		{
			temp=i;
			sum=0;
			while(temp>0)
			{
				digit=temp%10;
				sum+=Math.pow(digit, 3);
				temp/=10;
			}	
			if(sum==i)
				intArray[j++]=i;
				//System.out.println(i);
				
			
		}
		//System.out.println(intArray[0]);
		return intArray;
		
	}

}
