
public class UniquePaths {
	public static void main(String[] args) {
		System.out.println(logic());
	}
	static int m = 7;
	static int n = 3;
	static int paths = 0;
	public static int logic() {
		
		
		dfs(1,1,m,n);
		
		return paths;
	}
	
	public static void dfs(int rows,int cols,int m,int n) {
		
		if(rows<0 || cols < 0 || cols > m || rows > n) {
			return;
		}
		
		if(rows==n && cols==m) {
			paths++;
			return;
		}
		
		if(rows<n && cols<=m) {
			dfs(rows+1,cols,m,n);
		}
		
		if(rows<=n && cols<m) {
			dfs(rows,cols+1,m,n);
		}
		
	}
}