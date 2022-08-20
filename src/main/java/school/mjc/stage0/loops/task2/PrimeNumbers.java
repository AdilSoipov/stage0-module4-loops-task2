package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
      int i =0;
      int num =0;
      int printTo = printToInclusive;
  
      for (i = 1; i <= printTo; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {

	    System.out.println(i);
	 }	
      }	
    }
}
