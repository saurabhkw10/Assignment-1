package assignment1;

public class Q2 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        int center = cols / 3;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols || j == center) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

