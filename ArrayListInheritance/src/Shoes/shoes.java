package Shoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class shoes {
    public String Shoes;
    public void shoes(){
        Scanner sr=new Scanner(System.in);
        ArrayList<String>shoes=new ArrayList<>();
        shoes.add("Addidas");
        shoes.add("Puma");
        shoes.add("Nike");
        shoes.add("Red Chief");
        shoes.add("Bata");
        System.out.println(shoes);
        System.out.println("Enter the shoes you want to Purchase ");
        int n=sr.nextInt();
        n=n+1;
        if (shoes.indexOf(n)==1) {
            System.out.println("Enter the Number of shoes do you want to Purchase \n 1. 8USD \n 2. 9USD \n 3. 10USD");
            int num = sr.nextInt();
            if (num == 1) {
                System.out.println("The Amount of the of the number is :- " + 85 * num);
            } else if (num==2) {
                System.out.println("The Amount of the of the number is :- " + 94 * num);
            }
            else if (num==3) {
                System.out.println("The Amount of the of the number is :- " + 99 * num);
            }
            else {
                System.out.println("You have entered the wrong number ");
            }
        }
            else if(shoes.indexOf(n)==2) {

            System.out.println("Enter the Number of shoes do you want to Purchase \n 1. 8USD \n 2. 9USD \n 3. 10USD");
            int num = sr.nextInt();
            if (num == 1) {
                System.out.println("The Amount of the of the number is :- " + 77 * num);
            } else if (num==2) {
                System.out.println("The Amount of the of the number is :- " + 88 * num);
            }
            else if (num==3) {
                System.out.println("The Amount of the of the number is :- " + 99 * num);
            }
            else {
                System.out.println("You have entered the wrong number ");
            }}


            else if (shoes.indexOf(3)==3) {

            System.out.println("Enter the Number of shoes do you want to Purchase \n 1. 8USD \n 2. 9USD \n 3. 10USD");
            int num = sr.nextInt();
            if (num == 1) {
                System.out.println("The Amount of the of the number is :- " + 78 * num);
            } else if (num==2) {
                System.out.println("The Amount of the of the number is :- " + 97 * num);
            }
            else if (num==3) {
                System.out.println("The Amount of the of the number is :- " + 100 * num);
            }
            else {
                System.out.println("You have entered the wrong number ");
            }
        }

            else if (shoes.indexOf(4)==4) {
            System.out.println("Enter the Number of shoes do you want to Purchase \n 1. 8USD \n 2. 9USD \n 3. 10USD");
            int num = sr.nextInt();
            if (num == 1) {
                System.out.println("The Amount of the of the number is :- " + 78 * num);
            } else if (num==2) {
                System.out.println("The Amount of the of the number is :- " + 85 * num);
            }
            else if (num==3) {
                System.out.println("The Amount of the of the number is :- " + 99 * num);
            }
            else {
                System.out.println("You have entered the wrong number ");
            }
        }


    }


}
