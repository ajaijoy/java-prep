package com.mycompany.strings;

public class LoopOverALongString {

	public static void main(String []args){
		String s = "arakdsjfslklndmvlsdnflsdnglksdnglsnaglnsdgl";
	       /**
	        * For a long string, doing a s.toCharArray is the most efficient way vs for a 
	        * small string doing s.CharAt(i) in  a loop is more efficient.
	        */
	       char[] charArray = s.toCharArray();
	       
	       for(int i=0; i<charArray.length; i++){
	    	   System.out.println(charArray[i]);
	       }
	}
}
