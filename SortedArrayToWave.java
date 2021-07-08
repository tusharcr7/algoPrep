class SortedArrayToWave{

    
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void convertToWave(int arr[], int n){
      if(arr.length==1)
      return;
      if(arr.length==2)
      {
          int temp=arr[0];
          arr[0]=arr[1];
          arr[1]=temp;
          return;
      }
      
      int first=0,second=1,len=arr.length;
      while(second<len)
      {
         int temp=arr[first];
          arr[first]=arr[second];
          arr[second]=temp;
         first+=2;
         second+=2;
      }
        
    }
    
}
