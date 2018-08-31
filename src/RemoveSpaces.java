package com.capgemini.com.Day2;

public class RemoveSpaces {
	public static String RemoveSpacesCheck(String input,int pos,String delete)
	{
		String output=new String() ; 
		int i;
		String words[]=input.split(" +");
		int l=words.length;
		for(i=0;i<l;i++)
		{
			//result+=words[i]+" ";
		}
     	//System.out.println("WORD TO BE DELETED:");
		//System.out.println("WORD POSITION IS:");
		for(i=0;i<words.length;i++)
		{
			if((i+1!=pos)&&(!words[i].equals(delete)))
				output+=words[i]+" ";
		}
		return output;
		
	}
	}


