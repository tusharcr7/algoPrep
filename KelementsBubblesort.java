class KelementsBubblesort
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
       
       for(int i=0;i<k;i++)
       for(int j=0;j<n-i-1;j++)
       {
           if (arr[j] > arr[j+1])
                {
           int temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
                }
       }
       
      ArrayList<Integer> obj=new ArrayList<Integer>();
      for(int i=1;i<=k;i++)
      {
      obj.add(arr[n-i]);
      }
      
      return obj;
       
    
    }
}
