import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet <String> tset  = new TreeSet<String>();

        tset.add("Peter");
        tset.add("Susan");
        tset.add("Tom");
        tset.add("Sonya");

        System.out.println(tset); //Prints in Ascending Order


        TreeSet<Integer>numSet = new TreeSet<Integer>(){
            {
         add(1);
         add(6);
         add(3);
         add(2);
         add(9);

        }};

        System.out.println(numSet);

    }
}
