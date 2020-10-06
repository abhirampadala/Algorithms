
public class PerfectSquares {

	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static int logic() {
		
		int n = 13;
		
		 int [] dp = new int[n+1];
	        dp[0]=0;
	        for(int i=1;i<=n;i++){
	            int min=Integer.MAX_VALUE;
	            for(int j=1;j<=Math.sqrt(i);j++){
	                min = Math.min(min,dp[i-(j*j)]+1);
	            }
	            dp[i]=min;
	        }
	        return dp[n];
	
	}
}
