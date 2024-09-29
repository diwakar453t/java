package pac2;

import java.util.Scanner;
import pac4.number;
public class Multiplication extends number {


        public void  Multiplicitation(){
            Scanner sr=new Scanner(System.in);
            Multiplication Mul=new Multiplication();
            System.out.println("Enter the first Number :- ");
            Num1=sr.nextDouble();
            System.out.println("Enter the Second Number :- ");
            Num2=sr.nextDouble();
            System.out.println("The Multiplicitation of two Number is = "+(Num1*Num2));

        }

    }
