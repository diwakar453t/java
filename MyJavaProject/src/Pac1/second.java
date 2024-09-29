package Pac1;
import java.sql.SQLOutput;
import java.util.Scanner;
import pac2.demo;

import javax.sound.midi.Soundbank;

public class second extends demo{
    public void setDemo() {
        Scanner sr=new Scanner(System.in);
        second Second=new second();
        System.out.println("enter the name ");

     Second.name=sr.nextLine();
        System.out.println("Enter the Heigt ");
     Second.hi=sr.nextLine();
        System.out.println(Second.name+"\n"+Second.hi);
    }

}
