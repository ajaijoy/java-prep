package com.mycompany.strings;

public class PrintDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "ara";
       
       char[] charArray = s.toCharArray();
       
       for(int i=0; i<charArray.length; i++){
    	   for(int j = 0; j<charArray.length; j++){
    		   
    		   if(i == j)
    			   continue;
    		   
    		   /**
    		    * cant compare chars, so do String.valueOf
    		    */
    		   if(String.valueOf(charArray[i]).equals(String.valueOf(charArray[j])))
    			   System.out.println("The duplicate character is "+charArray[i]);
    	   }
       }
       
	}

}
