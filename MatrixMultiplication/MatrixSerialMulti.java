public class MatrixSerialMulti{
    public static double[][] multiply (double[][] matrix1, double[][] matrix2) {
        int rows1=matrix1.length;
        int columns1=matrix1[0].length;
        int columns2=matrix2[0].length;
        double[][] result = MatrixGenerator.generate(rows1, columns2);
        
        for (int i=0; i<rows1; i++) {
            for (int j=0; j<columns2; j++) {
                result[i][j]=0;
                for (int k=0; k<columns1; k++) {
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        
        return result;
    }
}