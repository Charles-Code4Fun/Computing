/*
Row-based Matrix Multiplication
with Thread coordination

Charles Z. Liu

This is the concurrent coordination 
based on the granularity programmed in RowMatMulThr
as the atomic threading functionality
*/

import java.util.*;

public class RowThrMatMul{
    public static void multiply(double[][] matrix1, double[][]matrix2, double[][] result) {
        List<Thread> threads = new ArrayList<>();
        int rows1 = matrix1.length;
        
        for (int i = 0; i < rows1; i++) {
            RowMatMulThr task = new RowMatMulThr(result,matrix1, matrix2, i);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
            
            if (threads.size() % 10 == 0) {
                waitForThreads(threads);
            }
        }
    }

    private static void waitForThreads(List<Thread> threads){
        for (Thread thread: threads) {
            try {
                thread.join();
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
            threads.clear();
    }


}