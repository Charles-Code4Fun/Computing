

public class MatMulAptTest{
    public static double[][] matMulAptTest(double[][]matrix1, double[][]matrix2){
        double result[][]= new double[matrix1.length][matrix2[0].length];
        double sNow = System.currentTimeMillis();
        MatMultAdpGroup.multiply(matrix1, matrix2, result);
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