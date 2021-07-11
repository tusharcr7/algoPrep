class ConvertToInteger
{
    int atoi(String str)
    {
	      for(char c:str.toCharArray())
		     {
		    	 if(!Character.isDigit(c))
		    	 {   
		    	     if(c!='-')
		    	     {
		    		 return -1;
		    	     }
		    	         
		    	     }
		    	     
		    	 }
		     
		     return Integer.parseInt(str);
    }
}
