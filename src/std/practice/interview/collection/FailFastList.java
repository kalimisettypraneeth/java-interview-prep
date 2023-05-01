package std.practice.interview.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();

        lst.add(10);
        lst.add(20);
        lst.add(30);

        try {
            for (Integer i : lst) {
                System.out.println(i);
                lst.add(40);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        List<Integer> clst = new CopyOnWriteArrayList<>();

        clst.add(10);
        clst.add(20);
        clst.add(30);

        for (Integer i : clst) {
            System.out.println(i);
            clst.add(40);
        }
    }
}
