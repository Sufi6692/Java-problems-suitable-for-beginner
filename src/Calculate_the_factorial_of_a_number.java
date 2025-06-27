import java.util.Scanner;

public class Calculate_the_factorial_of_a_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int UserInput = input.nextInt();

        int factorial = 1;

        for (int i = 0; i <= UserInput ; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + UserInput + " is " + UserInput);
        input.close();
    }
}
