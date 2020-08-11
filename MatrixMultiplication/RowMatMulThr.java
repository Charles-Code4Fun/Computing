/*
Row-based Matrix Multiplication
with Thread modeling

Charles Z. Liu

This is the granularity as the atomic threading functionality
for concurrent coordination 
*/

public class RowMatMulThr implements Runnable {
    private final double[][] result;
    private final double[][] matrix1;
    private final double[][] matrix2;
    private final int row;

    // Thread I/O from the interface parameters to the "this" thread parameters    
    public RowMatMulThr(double[][] result, double[][] matrix1, double[][] matrix2, int i) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = i;
    }

    @Override
    // Overide run function with the main functional operation block
    public void run() {
        for (int j = 0; j < matrix2[0].length; j++) {
            result[row][j] = 0;
            for (int k = 0; k < matrix1[row].length; k++) {
                result[row][j] += matrix1[row][k] * matrix2[k][j];
            }
        }
    }

}