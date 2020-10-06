
public class ZeroOnes {
	
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,0,1,1,0,0,0,1,1};
		
		int j = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < 1) {
				j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
