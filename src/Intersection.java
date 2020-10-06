

public class Intersection {

	public static void main(String[] args) {

		int[] a = { 3, 8, 10, 10 };
		int[] b = { 2, 8, 8, 9, 10, 15,15 };

		int i = 0;
		int j = 0;

		while (i < a.length && j < b.length) {

			if (i > 0 && a[i] == a[i - 1]) {

				i++;
				continue;

			}

			if (j > 0 && b[j] == b[j - 1]) {

				j++;
				continue;

			}

			if (a[i] > b[j]) {
				System.out.println(b[j]);
				j++;
			}
			if (a[i] == b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			} else {
				System.out.println(a[i]);
				i++;
			}
		}
		while (i < a.length) {
			System.out.println(a[i++]);

		}
		while (j < b.length) {
			if (j > 0 && b[j] == b[j - 1]) {

				j++;
				continue;

			}
			else {
			System.out.println(b[j++]);
			}

		}

	}

	private static void elseif() {
		// TODO Auto-generated method stub

	}

}
