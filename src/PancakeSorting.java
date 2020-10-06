import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PancakeSorting {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4, 1 };

		List<Integer> sol = new ArrayList<Integer>();

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if(arr[j] == i+1) {
					flip(arr,j);
					sol.add(j+1);
					break;
				}
				
			}
			flip(arr,i);
			sol.add(i+1);

		}
		System.out.println(sol.toString());

	}
	
	public static void flip(int[] arr,int num) {
		
		int i =0;
		while(i<num) {
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;
			i++;
			num--;
		}
		
	}

}
