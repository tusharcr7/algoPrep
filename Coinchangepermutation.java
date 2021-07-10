public class Coinchangepermutation {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4}; int sum=8;
		
		int dp[]=new int[sum+1];
		dp[0]=1;
		for(int i=0;i<dp.length;i++)
			{
			    for(int x:arr)
			    {
			    	if(i-x>=0)
			    	dp[i]+=dp[i-x];	
			    }
				
						
						
			}
		
		System.out.println(dp[sum]);
		
	}
	
}
