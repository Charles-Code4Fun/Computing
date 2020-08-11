public class printMatrix{
	public static void printMatrix(double[][] matrix){
		//int rows=10;
		//int columns=10;
		int rows= matrix.length;
		int columns=matrix[0].length;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                System.out.print(matrix[i][j]+" ");	
                }
			System.out.println();	//
            }
		//return 0;
	}
}