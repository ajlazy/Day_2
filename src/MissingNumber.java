package com.capgemini.com.Day2;

public class MissingNumber {
	    public static String missingNumberCheck(int numberOfInputs,int numbers[])
	    {
	    	int i,count=0,sum=0,asum=0,j,temp=0;
	    	for(i=0;i<numberOfInputs;i++)
			  {
	    		temp=0;
				for(j=0;j<numberOfInputs;j++)
				{
					if(numbers[j]==i)
					{
						temp =1;
						
					}
					
				}
				if(temp==0)
					count++;
					
			  }
	    	 if(count>1)
	    		return "Invalid Input";
				
				for(i=0;i<numberOfInputs;i++)
			  {
				
				if(numbers[i]<numberOfInputs)
				{
					sum+=numbers[i];
					//System.out.println(j +"Not found");
				}
				
			  }
			for(i=0;i<numberOfInputs;i++)
			  {
				
					asum+=i;
					//System.out.println(j +"Not found");
				
				
			  }
			  return "Missing value is " +(asum-sum); 
	    }  } 
	    


