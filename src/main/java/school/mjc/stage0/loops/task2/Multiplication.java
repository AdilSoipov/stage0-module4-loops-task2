package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
     int i = 0;
     int x = 0;
     
    
     
     if (multiplyByAndToInclusive > 0){
     while(x <= multiplyByAndToInclusive){
         System.out.println(x * multiplyByAndToInclusive);
         x++;
         
     }
     }
     else{while(i <= -multiplyByAndToInclusive){
         System.out.println((i * multiplyByAndToInclusive));
         i++;
         
     }
         
         
     }
    }
}
