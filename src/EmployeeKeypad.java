
public class EmployeeKeypad {

	static int starti = 0;
	static int startj = 0;
	static int result = 0;

	public static void main(String[] args) {

		String keypad = "932541689";
		String input = "482373784";
		int index = 0;

		char[][] matrix = new char[3][3];

		// Keypad as matrix representation
		// and saving the index values for start of the input
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = keypad.charAt(index);
				index++;
				if (matrix[i][j] == input.charAt(0)) {
					starti = i;
					startj = j;
				}
			}
		}

		// starting from second number as to select the first number time is 0 and we
		// already saved the index values
		for (int i = 1; i < input.length(); i++) {

			findnumber(matrix, starti, startj, input.charAt(i));
		}

		System.out.println(result);

	}

	public static void findnumber(char[][] matrix, int i, int j, char find) {

		// to check all the adjacent values and calculate the time
		// if it is adjacent increment the time by 1 and save the index values
		if (i + 1 < 3 && j < 3 && i + 1 >= 0 && j >= 0 && matrix[i + 1][j] == find) {
			starti = i + 1;
			startj = j;
			result += 1;
			return;
		}

		if (i - 1 < 3 && j < 3 && i - 1 >= 0 && j >= 0 && matrix[i - 1][j] == find) {
			starti = i - 1;
			startj = j;
			result += 1;
			return;
		}
		if (i < 3 && j + 1 < 3 && i >= 0 && j + 1 >= 0 && matrix[i][j + 1] == find) {
			starti = i;
			startj = j + 1;
			result += 1;
			return;
		}

		if (i < 3 && j - 1 < 3 && i >= 0 && j - 1 >= 0 && matrix[i][j - 1] == find) {
			starti = i;
			startj = j - 1;
			result += 1;
			return;
		}

		if (i + 1 < 3 && j + 1 < 3 && i + 1 >= 0 && j + 1 >= 0 && matrix[i + 1][j + 1] == find) {
			starti = i + 1;
			startj = j + 1;
			result += 1;
			return;
		}

		if (i - 1 < 3 && j - 1 < 3 && i - 1 >= 0 && j - 1 >= 0 && matrix[i - 1][j - 1] == find) {
			starti = i - 1;
			startj = j - 1;
			result += 1;
			return;
		}

		if (i + 1 < 3 && j - 1 < 3 && i + 1 >= 0 && j - 1 >= 0 && matrix[i + 1][j - 1] == find) {
			starti = i + 1;
			startj = j - 1;
			result += 1;
			return;
		}

		if (i - 1 < 3 && j + 1 < 3 && i - 1 >= 0 && j + 1 >= 0 && matrix[i - 1][j + 1] == find) {
			starti = i - 1;
			startj = j + 1;
			result += 1;
			return;
		}

		// if the value is not in adjacent it will be in adjacent to adjacent as it is
		// 3X3
		// so incrementing the time to +2 and saving the index values of the find
		else {
			for (int k = 0; k < 3; k++) {
				for (int l = 0; l < 3; l++) {
					if (matrix[k][l] == find) {
						starti = k;
						startj = l;
						result += 2;
						return;
					}
				}
			}
		}

	}

}
