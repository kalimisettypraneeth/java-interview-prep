package std.practice.interview.collection;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        final List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list);

        list.remove("d");

        System.out.println(list);

        // When we define list as final, we can only add or remove or manipulate the list but we cannot assign it to a new list


    }
}
