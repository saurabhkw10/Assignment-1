package assignment1;

public class Q8 {

	public static void main(String[] args) {
		int row = 5, k = 0, count = 0, count1 = 0;
		int i;

		for (i = 1; i <= row; ++i) {
			for (int space = 1; space <= row - i; ++space) {
				System.out.print("  ");
				++count;
			}
			while (k != 2 * i - 1) {
				if (count <= row - 1) {
					System.out.print((i + k) + " ");
					++count;
				} else {
					++count1;
					System.out.print((i + k - 2 * count1) + " ");
				}
				++k;
			}
			count1 = count = k = 0;
			System.out.println();
		}
	}

}