import java.util.Scanner;

public class Determine_if_a_number_is_even_or_odd {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int UserNumber = input.nextInt();

        if(UserNumber % 2 == 0){
            System.out.println("Your Number is Even");
        }else {
            System.out.println("Your Number is Odd");
        }

        input.close();
    }
}
