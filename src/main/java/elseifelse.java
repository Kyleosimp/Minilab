import java.util.Scanner;

public class elseifelse {
    public static void main(String[] args) {
        int myNum = 24;
        Scanner numInput = new Scanner(System.in);

        System.out.println("Let's compare numbers, pick a whole number. The number I pick is 24.");

        System.out.println("Please input a number: ");

        //int input
        int num = numInput.nextInt();
        if (myNum > num) {
            System.out.println("My number is bigger than yours.");
        }else if (myNum == num){
            System.out.println("You copied my number, pick a different number and try again.");
        }else{
            System.out.println("Your number is bigger than mine. Congratulations.");
        }
    }
}