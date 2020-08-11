//
//
//
import java.util.*;

public class ThreadTask implements Runnable{
    //private final double result;
    private final int number;
    //private final String description;
    //public ThreadTask(double result, int number,String description) {
    public ThreadTask(int number) {
        
        this.number = number;
        
    }
    
    @Override
    public void run() {
        System.out.println(number);   
    }
}