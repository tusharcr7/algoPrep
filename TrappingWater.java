class TrappingWater{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        
        int lr[]=new int[n];
        int rl[]=new int[n];
        int maxlr=arr[0];
        
        for(int i=1;i<n;i++)
        {
                if(arr[i]>maxlr)
                {
                    maxlr=arr[i];
                    lr[i]=maxlr-arr[i];
                }
                else
                lr[i]=maxlr-arr[i];;
               
        
            
        }
         int maxrl=arr[n-1];
          for(int i=n-2;i>=0;i--)
        {
                if(arr[i]>maxrl)
                {
                    maxrl=arr[i];
                    rl[i]=maxrl-arr[i];
                }
                else
                rl[i]=maxrl-arr[i];;
               
        
            
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(lr[i],rl[i]);
        }
        return sum;
        
    } 
}
