
public class CoinChangeProblemCombination {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4}; int sum=8;
		
		int dp[]=new int[sum+1];
		dp[0]=1;
		for(int x:arr)
		{
			for(int i=x;i<dp.length;i++)
			{
				dp[i]+=dp[i-x];
						
						
			}
		}
		System.out.println(dp[sum]);
		
	}
	
}
