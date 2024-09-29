package HELLO;

import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();


        while (true) {
            System.out.println("What do you want to do in Array list \n 1.Add \n 2.Replace \n 3.Delete ");
            int i = sr.nextInt();
            switch (i) {
                case 1:
                    System.out.println("How many words do you want to add ");
                    int num = sr.nextInt();

                    for (int o = 0; o < num; o++) {
                        System.out.println("Enter word " + (o + 1) + ":");
                        String Add = sr.next();

                        ar.add(Add);

                    }
                    System.out.println("Current ArrayList: " + ar);
                    break;
                case 2:
                    System.out.println("Enter the index to replace:");
                    int index = sr.nextInt();

                    if (index >= 0 && index < ar.size()) {
                        System.out.println("Enter the new word:");
                        String newWord = sr.next();
                        ar.set(index, newWord);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    System.out.println("Current ArrayList: " + ar);
                    break;
                case 3:
                    System.out.println("Enter the index to delete:");
                    int delIndex = sr.nextInt();

                    if (delIndex >= 0 && delIndex < ar.size()) {
                        ar.remove(delIndex);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    System.out.println("Current ArrayList: " + ar);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to continue? Enter 'yes' if you want to continue or any other key to exit:");
            String continueChoice = sr.next();
            if (!continueChoice.equals("yes")) {
                System.out.println("Program has ended.");
                break;
            }
        }


}
}
