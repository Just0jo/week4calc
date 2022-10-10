package ie.atu;
import java.util.Scanner;


import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
     add();
    }
    public static void add()
    {
        System.out.println("Please your first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();
        System.out.println("Please your second number");
        int secondNumber = inputs.nextInt();
        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);


    }


public class Calc
{

    public static void main(String[] args)
    {
     divide();
     subtract();
     add();
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







    public static void subtract()
    {
        System.out.println("Please enter your first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Please enter second Number");
        int SecondNumber = input.nextInt();
        int total = firstNumber - SecondNumber;
        System.out.println("The total is " + total);

    }





}
