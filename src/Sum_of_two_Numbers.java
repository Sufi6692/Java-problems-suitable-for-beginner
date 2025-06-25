import java.util.Scanner;

public class Sum_of_two_Numbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Num1 : ");
        int Num1 = input.nextInt();
        System.out.print("Enter your Num2 : ");
        int Num2 = input.nextInt();

        int Sum = Num1+Num2;
        System.out.println("Sum of Two numbers : "+Sum);
    }
}
