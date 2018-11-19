import java.util.HashSet;
import java.util.Set;

public class HashSetNoIterator {

    public static void main(String[] args) {
        Set<String> hset = new HashSet<String>();

        hset.add("Jogging");
        hset.add("Swimming");
        hset.add("Skiing");
        hset.add("Skiing");
        hset.add("Volleyball");

        for(String str: hset){
            System.out.println(str);
        }
    }
}
