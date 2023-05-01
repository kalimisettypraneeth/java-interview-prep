package std.practice.interview.collection;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)) {
            return true;
        }
        else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList clist = new CustomArrayList();

        clist.add(1);
        clist.add(1);
        clist.add(2);
        clist.add(1);
        clist.add(2);

        System.out.println(clist);
    }
}
