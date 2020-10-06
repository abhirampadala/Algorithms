
public class LeftRotate {
	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static int[] logic() {
		
		int[] arr = {1,2,3,4,5};
		int len = arr.length;
		
		int d = 2;
		
		for(int i = d-1;i>=0;i--) {
			
			int temp = arr[i];
			arr[i] = arr[len-1];
			arr[len-1] = temp;
			len--;
			
		}
		return arr;
		

	}
}
