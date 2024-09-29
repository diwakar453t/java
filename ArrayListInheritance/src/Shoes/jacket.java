package Shoes;

import java.util.Scanner;

public class jacket {
    public static void Jacket(){
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter the jacket \n 1.jacket \n 2.Jack");
        int n=sr.nextInt();
        if (n==1){
            System.out.println("jacket "+23);
        }
        else if (n==2){
            System.out.println("Jack "+43 );
        }
        else {
            System.out.println("Wrong Input ");
        }
    }
}
