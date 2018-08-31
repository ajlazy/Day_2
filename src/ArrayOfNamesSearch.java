package com.capgemini.com.Day2;

public class ArrayOfNamesSearch {
	public static String arrayOfNamesSearchCheck(String find, String names[])
	{
		int i,count=0;
		for( i=0;i<names.length;i++)
		   {
		   if(names[i].equals(find))
		   count++;
		   }
		  if(count!=0)
		   return "The Number of occurance of the Name is " + count ;
		  else
		   return "Word not Found";
		
	}

}
