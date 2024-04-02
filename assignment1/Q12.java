package assignment1;

public class Q12 {
	public static void main(String[] args) {

		int a[] = { 4, 5, 2, 3, 7, 8 };
		int max = 0, total = 0;
		int start = 0, end = 5;
		System.out.println("Elements of array a before swapping ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=" + a[i] + "\t");
		}
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
			total = total + a[i];
		}
		System.out.println("\n\nElements of array a after swapping ");
		for (int i = 0; i < a.length; i++) {

			System.out.print("a[" + i + "]=" + a[i] + "\t");
		}
	}
}
