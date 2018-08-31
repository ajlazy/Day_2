package com.capgemini.com.Day2;

public class Reverse {
	public static String ReverseCheck(String abc)
	{
		//String abc;
		//abc=sc.nextLine();
		String sentence[]=abc.split(" +");
		int i=0,j=0;
		String sol="";
		//String sol1="";
		System.out.println(sentence.length);
		for(i=0;i<sentence.length;i++)
		{
			for(j=sentence[i].length()-1;j>=0;j--)
            {
            	sol=sol+sentence[i].charAt(j);
	        }
            if(i!=sentence.length-1)sol+=" ";
            //System.out.print(sol1);
            //sol="";
            //sol1="";
		}
		return sol;
		
	}

}
