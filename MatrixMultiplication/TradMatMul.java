//**********************************
//
// Traditional Matrix Multiplication 
// without Threading Coordination
// Charles Z. Liu
// 
//**********************************
public class TradMatMul{
    public static double[][] tradMatMul(double[][] matrix1, double[][] matrix2){
        
        double sNow = System.currentTimeMillis();
        double[][] ret=MatrixSerialMulti.multiply(matrix1,matrix2);
        double sEnd = System.currentTimeMillis();
        
        System.out.print(sNow);
        System.out.println();

        System.out.print(sEnd);
        System.out.println();

        System.out.print(sEnd-sNow);
        System.out.println();

        return ret;
    }
}