package assignment1;

public class Q9 {

	public static void main(String[] args) {
	    int[] myArray = {1, 34, 23, 12, 6, 3};

	    int max = Integer.MIN_VALUE;
	    int total = 0;

	    for (int i = 0; i < myArray.length; i++) {	
	    if (myArray[i] > max) {max = myArray[i];}
	      total += myArray[i];
	    }

	    System.out.println("Max Value :"+max);
	    System.out.println("Average :"+total/myArray.length);
	  }

}
