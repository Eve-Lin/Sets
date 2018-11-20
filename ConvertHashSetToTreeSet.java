import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {

    public static void main(String[] args) {

        //Create a HashSet

        HashSet <String> hset = new HashSet<String>();

        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        hset.add("Element4");
        hset.add("Element5");

        //Displaying HashSet elements

        System.out.println("HashSet contains: "+ hset);

        Set<String> tset = new TreeSet<String>(hset);

        //Displaying TreeSet of HashSet Elements

        System.out.println("Elements of the tree set: ");

        for(String str:tset){
            System.out.println(str);
        }
    }
}
