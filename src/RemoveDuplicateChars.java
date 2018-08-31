package com.capgemini.com.Day2;

public class RemoveDuplicateChars {
	public static String RemoveDuplicates(String input) {
		int l=input.length();
		int i,j;
		char a;
		String output=new String();
		for(i=0;i<l;i++)
		{
			a=input.charAt(i);
			for(j=i+1;j<l;j++)
			{
				if(input.charAt(j)==a)
				{
					char[]my=input.toCharArray();
					my[j]=' ';
					input=String.valueOf(my);
				}
			}
		}
		for(i=0;i<l;i++)
		{
			if((input.charAt(i))!=' ')
				output+=input.charAt(i);
		}
		return output;	
		
	
		
		
		
		
		
	}
	}


