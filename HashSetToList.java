import java.util.HashSet;
import java.util.LinkedList;

public class HashSetToList {

    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<String>();

        hset.add("Hi");
        hset.add("Hej");
        hset.add("Hallo");

        System.out.println("The elements in the HashSet are:");
        for(String str: hset){
            System.out.println(str);
        }

        System.out.println();
        LinkedList<String> list = new LinkedList<>(hset);


        System.out.println("The elements in the LinkedList are:");
        for (String str: list){
            System.out.println(str);
        }
    }
}
