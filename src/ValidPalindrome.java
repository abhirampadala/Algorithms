
public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(logic());
		String i = ".";
		String m = i.substring(1);
	}
	
	public static boolean logic() {
		int i = 0;
		String s = "race a car";
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int len = s.length()-1;
		while(i<len) {
			if(s.charAt(i)!=s.charAt(len)) {
				return false;
			}
			i++;
			len--;
		}
		return true;
		
		
	}
}
