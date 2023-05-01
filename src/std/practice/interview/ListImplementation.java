package std.practice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListImplementation {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(12);
        integerList.add(21);
        integerList.add(51);
        integerList.add(134);
        integerList.add(671);
        integerList.add(24);
        integerList.add(48);
        integerList.add(69);

        System.out.println("list contains 34 -> " + integerList.contains(34));


        System.out.println("list remove element -> " + integerList.removeIf(i -> i > 10));

        System.out.println(integerList);

        List<String> strList = Arrays.asList("sai", "praneeth");
        strList.replaceAll(String::toUpperCase);

    }
}

//class Sorting implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2.compareTo(o1);
//    }
//}
