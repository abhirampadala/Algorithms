
public class LeadingZeroes {

	public static void main(String[] args) {

		String str = "0001346578392";
		int i = 0;
		while (i < str.length() && str.charAt(i) == '0') {
			i++;
		}
		
		StringBuffer sb = new StringBuffer(str);
		sb.replace(0, i, "");

		System.out.println(sb.toString());

	}

}
