class CheckAllBitAre1{
    static int isBitSet(int N){
       if(N==1) return N;
      boolean stat=true;
       while(N!=1)
       {
           if(N%2==0)
           {
               stat=false;
               break;
           }
           N/=2;
           
       }
       return stat?1:0;
       
    }
}
