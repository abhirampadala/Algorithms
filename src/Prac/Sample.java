package Prac;

public class Sample {

	public static void main(String[] args) {
		
		int zerocount = 0;
		int[] val = {0,1,0,3,12};
		int find = 11;

		for (int i = 0; i < val.length; i++) {

			if (val[i]!= 0) {

				val[zerocount++] = val[i];

			}

		}
		
		while(zerocount<val.length) {
			
			val[zerocount++] = 0; 
		}
		
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}
		
	}

}
