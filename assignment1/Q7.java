package assignment1;

public class Q7 {
	public static void main(String[] args) {
		int r;
		int px=6;
		int py=6;
		
		for (r = 1; r <= 6; r++) {
            for (int c = 1; c <= 11; c++) {
                if(r==6 || c==px || c==py )
                {
                	System.out.print(" * ");
                }
                else
                {
                	System.out.print("   ");
                }
                	
            }
            px--;
            py++;
            System.out.println();
        }

	}
}
