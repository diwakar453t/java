package Pac1;
import java.util.Scanner;

public class Substraction extends number{
    public void sub(){

        Scanner sr=new Scanner(System.in);
        System.out.println("Enter the First Number :- ");
        Num1=sr.nextDouble();
        System.out.println("Enter the Second Number :- ");
        Num2=sr.nextDouble();
        System.out.println("The Addition of the two Number is :- "+(Num1-Num2));
    }

}
