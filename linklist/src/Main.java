import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;

class linlist
{
    public static void main(String[] args) {

        LinkedList k=new LinkedList();
        k.add(23);
        k.add(4735);
        k.add(23);
        k.add("goal");
        k.add("jocker");
        k.add(8594);
        System.out.println(k);

        ArrayList New=new ArrayList<>();
        New.add(7632);
        New.add(43);
        New.add("ds");
        New.addFirst("First");
        New.addLast("last");

        k.addAll(New);

        System.out.println(k);
    }
}
