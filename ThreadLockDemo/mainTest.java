
import java.util.*;

public class mainTest{
    public static void main(String[] args){

        List<Integer> l = new ArrayList<>();

        for (int i=0;i<10;i++){
            l.add(i);
        }

        System.out.print(l);
        System.out.println();

        int getOne;

        for (int i=0;i<l.size();i++){
            getOne = l.get(i);
            ThreadTask testTask = new ThreadTask(getOne);
            Thread thread = new Thread(testTask);
            thread.start();
        }

        
          
    }



}