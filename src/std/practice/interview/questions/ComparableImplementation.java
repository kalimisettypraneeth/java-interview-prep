package std.practice.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableImplementation implements Comparable<ComparableImplementation> {

    private final int num;

    ComparableImplementation(int num) {
        this.num = num;
    }

    public static void main(String[] args) {

        List<ComparableImplementation> customObjList = Arrays.asList(new ComparableImplementation(23), new ComparableImplementation(45), new ComparableImplementation(66), new ComparableImplementation(89), new ComparableImplementation(48), new ComparableImplementation(23), new ComparableImplementation(75), new ComparableImplementation(84));

        System.out.println(customObjList);

        Collections.sort(customObjList);

        System.out.println(customObjList);
    }

    @Override
    public int compareTo(ComparableImplementation o) {
        return this.num - o.num;
    }

    @Override
    public String toString() {
        return "ComparableImplementation{" +
                "num=" + num +
                '}';
    }

}
