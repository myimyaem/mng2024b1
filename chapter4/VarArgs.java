package chapter4;

import java.util.*;


public class VarArgs {

    int sumOfAllInt(int... x){ //5,6,7,8
        int sum=0;
        for(int a:x)
            sum+=a;
        return sum;
    }
    String printAllArray(int y, boolean z,String... x){
        List<String> sb = new ArrayList<>();
        for(String a:x)
            sb.add(a);
        Collections.sort(sb);
        return sb.toString()+ " the number is:"+y+" the boolean value is: "+ z;
    }
    // String printAllArray(String x, String y)
    String printAllArray2(String[] x){
        List<String> sb = new ArrayList<>();
        for(String a:x)
            sb.add(a);
        Collections.sort(sb);
        return sb.toString();
    }   

    public static void main(String[] args) {
        VarArgs va = new VarArgs();
        System.out.println(va.printAllArray(32,true,"John","Marc","Mathew","Boy","Carl"));
        // System.out.println(va.printAllArray2(new String[]{"John","Marc","Mathew","Boy","Carl"}));
        System.out.println(va.sumOfAllInt(5,6,7,8));
        System.out.println(va.sumOfAllInt(new int[]{5,6,7,8}));
    }
    
}
