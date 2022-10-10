package ie.atu;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        multiply();
    }



    public static void multiply() {
        System.out.println("Please enter your first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Please enter second Number");
        int SecondNumber = input.nextInt();
        int total = firstNumber * SecondNumber;
        System.out.println("The total is " + total);
    }


}
