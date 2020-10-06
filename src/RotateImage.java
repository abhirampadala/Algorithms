
public class RotateImage {

	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static int[][] logic() {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int row = matrix.length;
		
		for(int i=0;i<row;i++) {
			for(int j=i;j<row;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<(row/2);j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][row-1-j];
				matrix[i][row-1-j] = temp;
			}
		}

		return matrix;
	}

}
