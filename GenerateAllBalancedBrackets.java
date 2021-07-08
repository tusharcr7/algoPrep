class GenerateAllBalancedBrackets {
    
    public List<String> AllParenthesis(int n) 
    {
      List<String> obj=new ArrayList<String>();
      char[] c=new char[2*n];
      generateAll(c,0,0,n,obj,0);
      return obj;
    }
    public void generateAll(char[] c,int countO,int countC,int n,List<String> arr ,int i)
    {
        if(countC==n)
        {
            arr.add(String.valueOf(c));
            return;
        }
        else
        {
        if(countO>countC)
        {
            c[i]=')';
            generateAll(c,countO,countC+1,n,arr,i+1);
        }
        if(countO<n)
        {
            c[i]='(';
            generateAll(c,countO+1,countC,n,arr,i+1);
        }
        }
        
        
    }
}
