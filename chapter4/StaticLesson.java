package chapter4;
import static java.util.Arrays.asList;

import java.util.*;

public class StaticLesson {
    int count = 0;
    static int sCount = 0;
    static int minCounter(){
        return 0;
    }
    public static void main(String[] args) {
        StaticLesson sl = new StaticLesson();
        StaticLesson sl2 = new StaticLesson();
        System.out.println(sl.count);
        
        System.out.println(sCount);
        System.out.println(minCounter());
        sCount = 10;
        sl.sCount=20;
        System.out.println(sCount+"***"+sl.sCount);
        // Arrays.sort();
        List list = asList(1,2,3,4,5);
    }
}
