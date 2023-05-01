package std.practice.interview.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<StudentComparableImpl> {

    @Override
    public int compare(StudentComparableImpl o1, StudentComparableImpl o2) {
        return o2.getId() - o1.getId();
    }
}
