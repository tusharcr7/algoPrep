class GenerateBinaryRange{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        ArrayList<String> obj=new ArrayList<String>();
       int i=1;  
       while(i<=N)
       {
           int temp=i++;
           String binary="";
           while(temp!=1)
           {
               binary=(temp%2)+binary;
               temp/=2;
               
           }
           obj.add(temp+binary);
           
           
           
       }
       return obj;
    }
    
}
