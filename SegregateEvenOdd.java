/*package whatever //do not write package name here */

import java.io.*;

class SegregateEvenOdd {
	public static void main (String[] args) {
	    
		int arr[]={2,3,4,5,6,7,8,9,10,12};
		int l=0,r=arr.length-1;
		while(l<r)
		{
		    if(arr[l]%2!=0 && arr[r]%2==0)
		    {
		        int temp=arr[l];
		        arr[l]=arr[r];
		        arr[r]=temp;
		        l++;
		        r--;
		    }else if(arr[l]%2==0 && arr[r]%2==0)
		    {
		        l++;
		    }else
		    {
		        l++;
		        r--;
		    }
		    
		    
		}
		for(int a:arr)
		System.out.println(a);
	}
}
