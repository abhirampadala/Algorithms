
public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int i = -123;
		int b;
		int rev=0;
		
		while(i!=0) {
			
			b = i%10;
			rev = rev*10+b;
			i = i/10;
			
		}
		
		System.out.println(rev);
		
	}

}
