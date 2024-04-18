/* Q.7 Write a program to split a string containing two words using StringTokenizer without using hasMoreTokens() method and call nextToken()
method three times.Add an exception handling block if necessary. */

import java.util.StringTokenizer;
public class SpringToken {
    public static void main(String[] args) {
        String input = "Hello Rushikesh";
        StringTokenizer tokenizer = new StringTokenizer(input);
        try {
            System.out.println(tokenizer.nextToken());
            System.out.println(tokenizer.nextToken());
            System.out.println(tokenizer.nextToken());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
