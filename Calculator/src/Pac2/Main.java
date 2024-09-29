
import java.util.Scanner;
import pac2.*;
import Pac1.*;
/*import Pac1.Substraction;
import Pac1.main;*/
public class Main extends main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Main main = new Main();
        boolean Loop = true;

        Division div = new Division();
        Multiplicitation mul = new Multiplicitation();
        Addition Add = new Addition();
        Substraction sub = new Substraction();
        while (true) {
            while (true) {
                System.out.println("Enter what you want to do in the calculator \n 1. Division \n 2. Multilpication \n 3. Addition \n 4. Substraction ");
                int i = sr.nextInt();
                switch (i) {

                    case 1:
                        div.Division();
                        break;
                    case 2:
                        mul.Multiplicitation();
                        break;
                    case 3:
                        Add.Add();
                    case 4:
                        sub.sub();
                }

                System.out.println("Do you want to continue Enter true if you want ");
                String Case = sr.nextLine();
                if (Case.equals("yes")) {
                    break;
                }
                System.out.println("Program is Endek/'u9ijbjj'