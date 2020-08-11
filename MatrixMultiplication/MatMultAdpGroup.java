
import java.util.*;

public class MatMultAdpGroup{
    public static void multiply(double[][] matrix1, double[][] matrix2, double[][] result) {
        List<Thread> threads = new ArrayList<>();
        int rows1=matrix1.length;
        int numThreads=Runtime.getRuntime().availableProcessors();
        int step = rows1/numThreads;

        int startIndex=0;
        int endIndex=step;
        
        for (int i=0; i<numThreads;i++){
            MatMulAdaptiveThr task = new MatMulAdaptiveThr(result, matrix1, matrix2, startIndex, endIndex);
            Thread thread = new Thread(task);

            thread.start();
            threads.add(thread);
            
            //update the block start and end for indexing the rows
            startIndex=endIndex;
            endIndex = i==numThreads-2? rows1:endIndex+step;
        }

        for (Thread thread: threads){
            try{thread.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }

}