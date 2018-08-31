package com.capgemini.com.Day2;

public class ReverseWords {
	public static String ReverseWordsCheck(String input)
	{
		String sentence[]=input.split(" ");
		int i=0,j=0;
		String sol="";
		for(i=0;i<sentence.length;i++)
		{
			for(j=sentence[i].length()-1;j>=0;j--)
            {
            	sol=sol+sentence[i].charAt(j);
	        }
            sol=sol+" ";
            //System.out.print(sol);
           // sol="";
		}
        System.out.print(sol);

		
		

		return sol;
		
	} 

}
