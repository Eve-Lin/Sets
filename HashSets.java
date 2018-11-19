import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {

        //HashSet declaration

        HashSet<String> myHashhy = new HashSet<String>();

        myHashhy.add("Dolphin");
        myHashhy.add("Horse");
        myHashhy.add("Eagle");
        myHashhy.add("Lion");
        myHashhy.add("Lion"); //adding a duplicate element
        myHashhy.add(null);
        myHashhy.add(null);

        System.out.println(myHashhy);
    }
}
