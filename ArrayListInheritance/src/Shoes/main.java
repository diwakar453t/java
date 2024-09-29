package Shoes;

import java.util.LinkedList;
import java.util.Scanner;

 class main
{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        LinkedList<String> arr = new LinkedList<>();
        while (true) {

            while (true) {
                System.out.println(" What product do you want to add \n 1.shoes \n 2.jacket ");
                int n = sr.nextInt();
                switch (n) {
                    case 1:  shoes sh = new shoes();
                    sh.shoes();break;

                    case 2:jacket jc=new jacket();
                    jc.Jacket();
                        System.out.println("Hello ");break;
                }

                System.out.println("Do you want to continue? Enter 'yes' if you want to continue or any other key to exit:");
                String continueChoice = sr.next();
                if (!continueChoice.equals("yes")) {
                    System.out.println("Program has ended.");
                    break;
                }
            }
            break;
        }

    }
}