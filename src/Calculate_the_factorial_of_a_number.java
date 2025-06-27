import java.util.Scanner;

public class Calculate_the_factorial_of_a_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int UserInput = input.nextInt();

        if (UserInput < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // ✅ declare here so it is usable inside the else block

            for (int i = 1; i <= UserInput; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + UserInput + " is " + factorial);
        }

        input.close();
    }
}
