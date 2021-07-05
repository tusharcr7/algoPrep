class Solution012SortByDtchFlagAlgo
{
    public static void sort012(int a[], int n)
	    {
		 int l=a.length;
		 int i=0,j=0,k=l-1;
		 while(i<=k)
		 {
			 if(a[i]==1)
			 {
				 i++;
			 }else if(a[i]==0)
			 {
				 swap(a, i, j);
				 i++;j++;
			 }
			 else
			 {
				 swap(a, i, k);
				 k--;
			 }
			 
		 }
	    }
	 public static void swap(int a[], int f,int s)
	 {
		int temp=a[f];
		a[f]=a[s];
		a[s]=temp;
		 
	 }
}
