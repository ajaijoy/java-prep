package com.mycompany.strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharactersInString {

	public static void usingMaps() {
		String s = "ardfgjdfkgjldf";

		char[] charArray = s.toCharArray();

		Map<Character, Integer> charMap = new HashMap<>();

		for (char c : charArray) {

			Integer count = charMap.get(c);

			if (count == null) {
				charMap.put(c, 1);
			} else {
				charMap.put(c, count + 1);
			}
		}
		
		/**
		 * loop over map
		 */
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
			if(entry.getValue() > 1)
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}
	
	public static void usingOnlyStrings(){
		// TODO Auto-generated method stub
	       String s = "ardfgjdfkgjldf";
	       
	       char[] charArray = s.toCharArray();
	       
	       for(int i=0; i<charArray.length; i++){
	    	   for(int j = 0; j<charArray.length; j++){
	    		   
	    		   /**
	    		    * skip when the index matches both i & j it is the same character
	    		    * and cannot be marked as dupe.
	    		    */
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
	
	
	public static void main(String[] args) {
	
		usingMaps();
	//	usingOnlyStrings();
       
	}

}
