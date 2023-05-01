package std.practice.interview.collection;

import java.util.*;

public class StudentComparableImpl implements Comparable<StudentComparableImpl> {

    private int id;
    private String name;

    public StudentComparableImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        StudentComparableImpl that = (StudentComparableImpl) o;
//        return id == that.id &&
//                Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

    @Override
    public int compareTo(StudentComparableImpl o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "StudentComparableImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        StudentComparableImpl stud1 = new StudentComparableImpl(101, "Sai");
        StudentComparableImpl stud2 = new StudentComparableImpl(121, "Praneeth");
        StudentComparableImpl stud3 = new StudentComparableImpl(115, "Kalimisetty");

        List<StudentComparableImpl> lst = new ArrayList<>();

        lst.add(stud1);
        lst.add(stud2);
        lst.add(stud3);

        System.out.println(":::::::Before Sorting::::::::");
        System.out.println(lst);

        Collections.sort(lst);

        System.out.println(":::::::After Sorting::::::::");
        System.out.println(lst);

        Collections.sort(lst, new IdComparator());
        System.out.println(lst);

        System.out.println(Collections.max(lst));

//        System.out.println(Collections.min(lst));

        System.out.println(Collections.min(lst, new IdComparator()));

    }
}
