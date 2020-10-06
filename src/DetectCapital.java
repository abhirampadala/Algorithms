
public class DetectCapital {
	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static boolean logic() {
		
		String word = "FlaG";
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)<65 && word.charAt(i)>90) {
				break;
			}
			else {
				return true;
			}
		}
		
		return false;

		

	}
}
