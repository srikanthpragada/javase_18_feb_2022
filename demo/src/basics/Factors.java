package basics;

public class Factors {

	public static void main(String[] args) {

	  if (args.length < 1) {
		  System.out.println("Number is missing!");
		  return;
	  }
	  
      int num = Integer.parseInt(args[0]);  // String to int 
      
      for(int i = 2; i <= num/2 ; i ++) {
    	  if (num % i == 0)
    		  System.out.println(i);
      }
      
	}

}
