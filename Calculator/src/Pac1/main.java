package Pac1;
import com.sun.tools.javac.Main;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
     Scanner sr=new Scanner(System.in);

       Addition Add=new Addition();
     Substraction sub=new Substraction();
        System.out.println("Enter What you want to doo :- ");
        int i=sr.nextInt();
        switch(i){
            case 3: Add.Add();break;
            case 4: sub.sub();break;

        }


        }
    }


