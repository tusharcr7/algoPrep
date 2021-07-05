package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllPermutationOfAString {
	public static void main(String[] args) {
		
		//convertPostFixToInfix("ab*c+");
		find_permutation("ABC").forEach(System.out::println);;
	}
   public static List<String>  find_permutation(String S) {
	        List<String> obj=new ArrayList<String>();
	      for(int i=0;i<S.length();i++)
	      {
	          for(int j=i+1;j<=(S.length());j++)
	          {
	             obj.add(S.substring(i,j));
	          }
	          
	      }
	      return obj;
	    }
}
