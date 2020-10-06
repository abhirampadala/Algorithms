import java.util.HashSet;
import java.util.Set;

public class RodCutting {
	
	public static void main(String[] args) {
        int n = 5;
        int a = 4, b = 2, c = 3;
        System.out.println(rodCutting(n, a, b, c));
        
    }


	 static int rodCutting(int n, int a, int b, int c)
	    {
	        if(n== 0)
	          return 0;
	        if(n < 0)
	          return -1;
	          
	        int res = Math.max(Math.max(rodCutting(n-a, a, b, c), 
	                rodCutting(n-b, a, b, c)),rodCutting(n-c, a, b,c));
	                
	        if(res == -1)
	          return -1;
	        return 1+res;
	    }
	

}
