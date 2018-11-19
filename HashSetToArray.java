import java.util.HashSet;

public class HashSetToArray {

    public static void main(String[] args) {


        HashSet<Integer> num = new HashSet<Integer>();
        num.add(1);
        num.add(1);
        num.add(7);
        num.add(3);
        num.add(5);

        System.out.println("The HashSet:"+num);

       Integer[] numArray = new Integer[num.size()];

       num.toArray(numArray);

        System.out.println("The array is:");
        for(Integer digit: numArray){
            System.out.println(digit);
        }
    }
}
