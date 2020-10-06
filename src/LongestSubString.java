import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	
	 public static int lengthOfLongestSubstring() {
	        
		 	String s = "abcbcaabcd";
	        int n = s.length();
	        int ans = 0;
	        
	        //bruteforcemethod
//	        for(int i=0;i<n;i++){
//	            for(int j=i+1;j<=n;j++){
//	                if(unique(s,i,j)){
//	                    ans = Math.max(ans,j-i);
//	                }
//	            }
//	        }
//	        return ans;
	        
	        //hashmap 0(n)
	        
	        int maxLen = 0;
	        Set<Character> window = new HashSet<>(); 

	        int left = 0, right = 0;
	        while(right < s.length()) { 
	            if(!window.contains(s.charAt(right))) {
	            	window.add(s.charAt(right++)); 
		            maxLen = Math.max(window.size(), maxLen);  
	            }
	            else {
	            	window.remove(s.charAt(left++));
	            	
	            }
	            
	        }

	        return maxLen;
	    }
	 
	    
	    
	    public static boolean unique(String s,int start,int end){
	        Set<Character> set = new HashSet<>();
	        for(int i=start;i<end;i++){
	            Character ch = s.charAt(i);
	            if(set.contains(ch)){
	                return false;
	            }
	            set.add(ch);
	        }
	        return true;
	    }
	    
	    public static void main(String[] args) {
	    	int ans = lengthOfLongestSubstring();
	    	System.out.println(ans);
	    }

}
