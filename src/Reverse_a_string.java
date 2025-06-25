import java.util.Scanner;

public class Reverse_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Str : ");
        String str = input.nextLine();
        String ReverseStr = "";
        char ch;

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            ReverseStr = ch + ReverseStr;
        }
        System.out.println("ReverseStr : " + ReverseStr);
        input.close();

    }
}
