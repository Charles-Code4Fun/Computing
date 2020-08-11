//**********************************
//
// Thread-based Matrix Multiplication 
// with batch-unit-thread Coordination
// Charles Z. Liu
// 
//**********************************

public class RowMatMulTest{
    public static double[][] rowMatMulTest(double[][]matrix1, double[][]matrix2){
        double resultSerial[][]= new double[matrix1.length][matrix2[0].length];
        double sNow = System.currentTimeMillis();
        RowThrMatMul.multiply(matrix1, matrix2, resultSerial);
        double sEnd = System.currentTimeMillis();

        System.out.println();
        System.out.print(sNow);
        System.out.println();

        System.out.print(sEnd);
        System.out.println();

        System.out.print(sEnd-sNow);
        System.out.println();
        return resultSerial;
    }
}