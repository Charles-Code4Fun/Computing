//**********************************
//
// Thread-based Matrix Multiplication 
// with batch-unit-thread Coordination
// Charles Z. Liu
// 
//**********************************

public class ThrMatMul{
    public static double[][] thrMatMul(double[][]matrix1, double[][]matrix2){
        double result[][]= new double[matrix1.length][matrix2[0].length];
        double sNow = System.currentTimeMillis();
        ParallelIndividualMultiplier.multiply(matrix1, matrix2, result);
        double sEnd = System.currentTimeMillis();

        System.out.println();
        System.out.print(sNow);
        System.out.println();

        System.out.print(sEnd);
        System.out.println();

        System.out.print(sEnd-sNow);
        System.out.println();
        return result;
    }
}