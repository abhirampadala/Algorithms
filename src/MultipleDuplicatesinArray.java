import java.util.ArrayList;
import java.util.List;

public class MultipleDuplicatesinArray {
	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static List<Integer> logic() {

		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> res = new ArrayList<Integer>();
		
		for(int n:nums) {
			n = Math.abs(n);
			if(nums[n-1]>0) {
				nums[n-1]*= -1;
			}
			else {
				res.add(n);
			}
			
		}
		
		return res;

	}

	
}
