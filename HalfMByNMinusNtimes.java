class HalfMByNMinusNtimes{
    static int mthHalf(int N, int M){
        for(int i=0;i<M-1;i++)
        {
            N=N/2;
            if(N==0)
            return 0;
        }
         return N;
    }
}
