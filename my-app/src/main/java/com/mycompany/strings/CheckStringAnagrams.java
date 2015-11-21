package com.mycompany.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Two strings are anagrams if they are written using the same exact letters, 
 * ignoring space, punctuation and capitalization. Each letter should have the 
 * same count in both strings. For example, Army and Mary are anagram of each other.


 * 
 *
 */
public class CheckStringAnagrams {

	public static void main(String []args){
		
		boolean isAnagram = true;
		String s1 = "Army";
		String s2 = "Maary";
		
		if(s1.length() != s2.length()){
		    isAnagram = false;
			System.out.println("not an anagram");
		}
		
		Map<Character, Integer> s1Map = new HashMap<>();
		
		char[] s1CharArray = s1.toLowerCase().toCharArray();
		char[] s2CharArray = s2.toLowerCase().toCharArray();
		
		for(char c : s1CharArray){
			
			Integer count = s1Map.get(c);
			if (count == null) {
				s1Map.put(c, 1);
			}else{
				s1Map.put(c, count+1);
			}
		}
		
		for(char c : s2CharArray){
			
			Integer i = s1Map.get(c);
			
			if(i == null){
				System.out.println("Not an anagram");
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram)
		System.out.println(s1+"  "+s2+" are anagrams");
	}
}
