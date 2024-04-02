package assignment1;

public class Q6 {
	public static void main(String[] args) {
		int space = 0;
		int rows = 6;
		int num = 6;
		for (int r = 1; r <= rows; r++) {
			for (int i = 1; i <= space; i++) {
				System.out.print("   ");

			}

			for (int j = 1; j <= num; j++) {
				System.out.print("  *   ");

			}
			System.out.println();
			space++;
			num--;
		}
	}
}
