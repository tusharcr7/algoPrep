class SolutionO12Sort
{
    public static void sort012(int a[], int n)
    {
       int arr[]=new int[3];
    for(int x:a)
    {
        arr[x]+=1;
    }
    int k=0;
    for(int i=0;i<3;i++)
    {
        int count=arr[i];
        for(int j=0;j<count;j++)
       a[k++]=i;
    }
    }
}
