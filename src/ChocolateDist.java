import java.util.TreeSet;

public class ChocolateDist {

	public static void main(String[] args) {
		
		 int[] arr = {40,6,40,20};
	        int moves = 0;
	        TreeSet<Integer> set = new TreeSet<Integer>();
	        for(int i =0;i<arr.length;i++){
	            set.add(arr[i]);
	        }

	        while(set.size()!=0){
	            int m = set.last();
	            if(m % 2 != 0){
	                set.add(m/2);
	                moves++;
	            }
	            set.remove(m);
	        }

	        System.out.println(moves);
		
		
	}
	
}
