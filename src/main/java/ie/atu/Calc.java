package ie.atu;
import java.util.Scanner;

public class Calc
{

    public static void main(String[] args)
    {
     divide();
    }
    public static void divide()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int firstNumber = input.nextInt();
        System.out.println("You entered : "+ firstNumber);
        System.out.println("Please enter a second number ");
        int secondNumber = input.nextInt();
        System.out.println("You entered : "+ secondNumber);
        int total = firstNumber / secondNumber;
        System.out.println("The two numbers divided is : "+ total);

    }
}
