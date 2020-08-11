/*
Performance Test        
*/


import java.util.*;


public class mainTest {
	public static void main(String[] args){

        List<Double> traditionTime = new ArrayList<>();
        List<Double> unitTime = new ArrayList<>();
        List<Double> rowTime = new ArrayList<>();
        List<Double> adptTime = new ArrayList<>();
        double sNow = System.currentTimeMillis();
        double eNow = System.currentTimeMillis();

        for (int i=1; i<1200; i=i+10){
                double matrix1[][] = MatrixGenerator.generate(i, i);
                double matrix2[][] = MatrixGenerator.generate(i, i);
                
                
                //Traditional Matrix Multiplication
                System.out.println("Traditional Method of Matrix Multiply");
                sNow = System.currentTimeMillis();
                double[][] ret =TradMatMul.tradMatMul(matrix1,matrix2);
                eNow = System.currentTimeMillis();
                System.out.println();
                traditionTime.add((double)(eNow-sNow));

                /*

                //Unit-based Threading Matrix Multiplication
                System.out.println("Threading-Unit-Method of Matrix Multiply");
                sNow = System.currentTimeMillis();
                ret=ThrMatMul.thrMatMul(matrix1,matrix2);
                eNow = System.currentTimeMillis();
                System.out.println();
                unitTime.add((double)(eNow-sNow));
                */

                //Row-based Threading Matrix Multiplication
                System.out.println("Threading-Row-Method of Matrix Multiply");
                sNow = System.currentTimeMillis();
                ret=RowMatMulTest.rowMatMulTest(matrix1,matrix2);
                eNow = System.currentTimeMillis();
                System.out.println();
                rowTime.add((double)(eNow-sNow));

                
                //Threading Coordination Based on Group(Block) Adaptive to the available cores with JVM coordination
                System.out.println("Threading-Adpative-Method of Matrix Multiply");
                sNow = System.currentTimeMillis();
                ret=MatMulAptTest.matMulAptTest(matrix1,matrix2);
                eNow = System.currentTimeMillis();
                System.out.println();

                adptTime.add((double)(eNow-sNow));


        }

        System.out.println("Traditional Matrx Operation Time:");
        System.out.print(traditionTime);
        System.out.println();

        System.out.println("Unit-Threading Matrx Operation Time:");
        System.out.print(unitTime);
        System.out.println();
        
        System.out.println("Row-Threading Matrx Operation Time:");
        System.out.print(rowTime);
        System.out.println();

        System.out.println("Adpative Threading Matrx Operation Time:");
        System.out.print(adptTime);
        System.out.println();

    }
}