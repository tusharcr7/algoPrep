class MaxAdjacentMoney {
    static int maximizeMoney(int N , int K) {
       int sum=0;
       int b=1;
       while(b<=N)
       {
           
           sum+=K;
           b+=2;
           
       }
       return sum;
    }
}
