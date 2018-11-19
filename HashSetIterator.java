import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("Quo Vadis");
        myHashSet.add("Geography of Bliss");
        myHashSet.add("The Count Of Monte Christo");
        myHashSet.add("Pride and Prejudice");
        Iterator<String> it = myHashSet.iterator();
            while(it.hasNext()){

                System.out.println(it.next());
            }
    }
}
