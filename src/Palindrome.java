package com.capgemini.com.Day2;

public class Palindrome {
     public static boolean palindromeCheck(int number)
     {
    	 int temp=number;
    	    int rev = 0,rem=0;
    	    
    	    while(temp>0)
    	    {
    	    	rem=temp%10;
    	    	rev=rev*10+rem;
    	    	temp/=10;
    	    }
    	    if(rev==number)
    	    	return true;
    	    else return false;     		
    	}
    	
    	  
     }

