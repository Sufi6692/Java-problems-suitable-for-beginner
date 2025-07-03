import java.sql.SQLOutput;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // All practice are written in specific java files with Answers


//      Question 1: Sum of Two Numbers.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Number 1 : ");
//        int Number1 = input.nextInt();
//        System.out.print("Enter your Number 2 : ");
//        int Number2 = input.nextInt();
//
//        int sum = Number1+Number2;
//
//        System.out.println("Sum is "+  sum);
//        input.close();

//           Question 2: Even or Odd Check
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Number : ");
//        int Number = input.nextInt();
//
//        if(Number % 2 == 0){
//            System.out.println("your Number is EVEN");
//        }else {
//            System.out.println("your Number is ODD");
//        }
//        input.close();


        //Question 3: Find the Largest of Three Numbers

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Number1");
//        int Number1 = input.nextInt();
//        System.out.print("Enter your Number2");
//        int Number2 = input.nextInt();
//        System.out.print("Enter your Number3");
//        int Number3 = input.nextInt();
//
//        int Max = Number1;
//
//        if (Number2 > Max) {
//            Max = Number2;
//        }
//        if (Number3 > Max) {
//            Max = Number3;
//        }
//
//        System.out.println("MAX Number is "+ Max);
//
//        input.close();


      //  Question 4: Reverse a String?

//     Scanner input = new Scanner(System.in);
//        System.out.print("Enter your String : ");
//     String str = input.next();
//     String reverse = "";
//     for (int i = 0; i <str.length(); i++){
//         reverse = str.charAt(i) + reverse;
//     }
//        System.out.println("your String is "+ str +" fReverse is "+reverse);
//     input.close();


     // Question 5: Palindrome Check

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter you Str : ");
//        String Str = input.nextLine();
//        String Reverse = "";
//
//        for (int i = 0; i < Str.length() ; i++) {
//            Reverse = Str.charAt(i) + Reverse;
//        }
//
//        if(Str.equalsIgnoreCase(Reverse)){
//            System.out.println("You Entered "+ Str+ " and This your Reverse String "+ Reverse);
//            System.out.println("Hence your String is Palindrome");
//        }else {
//            System.out.println("You Entered "+ Str+ " and This your Reverse String "+ Reverse);
//            System.out.println("Hence your String is Not Palindrome");
//        }
//
//        input.close();



        // Question 6 : Calculate the factorial of a number

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Non-negative Number X : ");
//        int n = input.nextInt();
//
//        if(n < 0){
//            System.out.println("Please try again Non-negative ");
//        }else {
//            long factorial = 1;
//            for (int i = 1; i <=n ; i++) {
//                factorial = factorial * i;
//            }
//
//            System.out.println("Your Number "+n+" Factorial Number "+ factorial);
//
//        }
//
//
//        input.close();


        //Question 7: Calculate the sum of N user-entered numbers


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter how many Number : ");
//        int n = input.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <=n ; i++) {
//            System.out.print("Enter your Number "+ i + " :");
//            int X = input.nextInt();
//            sum += X;
//
//        }
//
//        System.out.println("Your Sum is : "+ sum);


        // Question 8 : Count the number of vowels in a string.

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your String : ");
//
//        String UserWord = input.nextLine();
//
//        int VowelCount = 0;
//
//        String Word = UserWord.toLowerCase();
//
//        for(int i = 0; i< Word.length(); i++) {
//            if (Word.charAt(i) == 'a' || Word.charAt(i) == 'i' || Word.charAt(i) == 'o' || Word.charAt(i) == 'u'|| Word.charAt(i) == 'e') {
//                VowelCount++;
//            }
//        }
//
//        System.out.println("In this word " +Word + " you have VowelCount " + VowelCount);
//
//        input.close();

        // 9. Word reversal: Reverse the words in a string but keep the letters in the original order.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String UserWord = input.nextLine();
           String[] Word = UserWord.split(" ");

        for(int i = Word.length-1; i>=0 ; i--) {
            System.out.print(Word[i]+" ");
        }

        input.close();
    }
}