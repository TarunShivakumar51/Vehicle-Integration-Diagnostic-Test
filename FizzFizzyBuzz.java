/*
 * This program prints the numbers from 1 to 250 with the following rules:
 * - If a number is divisible by 3, print "Fizz".
 * - If a number is divisible by 5, print "Fizzy".
 * - If a number is divisible by 7, print "Buzz".
 * - If a number is divisible by more than one of the above, print all applicable words in the order: "Fizz", "Fizzy", "Buzz".
 */

public class FizzFizzyBuzz {
    public static void main(String[] args) {
        // Loop from 1 to 250
        for (int i = 1; i <= 250; i++) {
            String output = "";

            // Check divisibility and append appropriate words
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Fizzy";
            }
            if (i % 7 == 0) {
                output += "Buzz";
            }

            // If the output is empty (not divisible by 3, 5, or 7), print the number
            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }
}
