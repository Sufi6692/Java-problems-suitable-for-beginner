import java.util.Scanner;

public class Find_the_largest_of_three_numbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you first Num : ");
        int Num1 = input.nextInt();
        System.out.print("Enter you second Num : ");
        int Num2 = input.nextInt();
        System.out.print("Enter you third Num : ");
        int Num3 = input.nextInt();

        int max = Num1;
        if(Num1 < Num2){
            max = Num2;
        }
         if (Num3 > max) {
            max = Num3;
        }

        System.out.print("Largest Number of three Numbers : "+ max);
         input.close();
    }
}
