import java.util.Scanner;

public class Find_the_sum_of_all_numbers_in_a_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of element : ");
        int size = input.nextInt();
        int sum =0;

        int[] numbers = new int[size];

        for (int i = 0; i < size ; i++) {

            numbers[i] = input.nextInt();

        }

        for (int i = 0; i <size ; i++) {

            sum += numbers[i];

        }

        System.out.println(sum);

        input.close();

    }
}
