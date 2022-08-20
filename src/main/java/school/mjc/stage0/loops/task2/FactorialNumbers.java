package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
       int result = 1;
       
       
       
       while(i <= (printToInclusive + 1)){
           System.out.println(result);
           
           result = i * result;
           i++;
           
           
           
           
       }



    }
}
