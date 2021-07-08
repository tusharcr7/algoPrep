class FirstCharForEachWord {
    String firstAlphabet(String S) {
        int l=S.length();
        String st="";
        if(l==0)
        {
           return st;
        }
        else
        {
            if(S.charAt(0)==' ')
               st+= S.charAt(1);          
            else
               st+= S.charAt(0);            
        }
        for(int i=1;i<l;i++)
        {
            if(S.charAt(i)==' ')
            {
               if(i+1<=l-1)
               {
                   st+= S.charAt(i+1);
               }
            }
            
        }
        return st;
    }
}
