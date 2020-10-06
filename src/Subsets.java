import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {
	 static List<List<Integer>> list = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		  List<Integer> curr = new ArrayList<Integer>();
	        dfs(nums, curr,0);
	        System.out.println(list);
    }


	 static void dfs(int[] nums,List<Integer> curr,int index){
	        
	        if(index == nums.length){
	            list.add(curr);
	            return;
	        }
	        int n = curr.size();
	        dfs(nums,curr,index+1);
	        curr.add(nums[index]);
	        dfs(nums,curr,index+1);
	        curr.remove(n);
	    }

}
