package Pac2;
import java.sql.SQLOutput;
import Pac1.number;
import java.util.Scanner;
public class Division extends number {
//    public double Num1,Num2;




    public void Division(){
        Division div=new Division();

        Scanner sr=new Scanner(System.in);
        System.out.println("Enter the first Number :- ");
        Num1=sr.nextDouble();
        System.out.println("Enter the Second Number :- ");
        Num2=sr.nextDouble();
        System.out.println("The Division of two Number is = "+(Num1/Num2));

    }}




