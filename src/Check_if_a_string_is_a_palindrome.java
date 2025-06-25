import java.util.Scanner;

public class Check_if_a_string_is_a_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Input :");
        String UserInput = input.nextLine();
        String Reverse = "";

        for(int i = 0; i < UserInput.length(); i++){
            Reverse = UserInput.charAt(i) + Reverse;
        }

        if(UserInput.equals(Reverse)){
            System.out.println("Your Input is : " + UserInput);
            System.out.println("If you reverse this Input : " + Reverse);
            System.out.println("Hence your input is a Palindrome.");

        }else {
            System.out.println("Your Input is : " + UserInput);
            System.out.println("If you reverse this Input : " + Reverse);
            System.out.println(" Hence Your Input is Not Palindrome");
            System.out.println("Hence your input is a Palindrome.");
        }

            input.close();

    }
}
