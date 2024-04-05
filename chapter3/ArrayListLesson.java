package chapter3;


import java.lang.reflect.Array;
import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        // ArrayList list1 = new ArrayList<>();// {}
        // list1.add("Marco"); //{"Marco"}
        // list1.add("Yim"); //{"Marco","Yim"}
        // list1.add(25); //{"Marco","Yim", 25}
        // list1.add("Cubao, Quezon City"); //{Marco, Yim, 25, Cubao, Quezon City}
        List list1 = Arrays.asList("Marco","Yim", 25,"Cubao, Quezon City");
        System.out.println(list1.get(3)); //array[3]
        ArrayList<String> safer = new ArrayList<>(10);
        safer.add("sparrow");
        safer.add("Maya");
        safer.add(0,"crow");
        safer.add(2,"african love bird");
        // safer.add(Boolean.TRUE); //error
        System.out.println(safer);
        safer.remove("Maya");
        // safer.remove(3);
        safer.set(2, "love bird");
        int yy = 1;
        System.out.println(safer.get(2).length());
        System.out.println(safer.size());
        safer.clear();
        System.out.println(safer);
        Integer x = 10;
        // Integer y = new Integer(10);
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(10));
        System.out.println(x.compareTo(12));
        System.out.println("**********************");
        List numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(99);
        numbers2.add(5);
        numbers2.add(81);
        numbers2.add(45);
        numbers2.add(95);
        numbers2.add(17);
        Collections.sort(numbers2);
        System.out.println(numbers2);
        Collections.reverse(numbers2);
        System.out.println(numbers2);
        Collections.shuffle(numbers2);
        System.out.println(numbers2);
        
    }
}
