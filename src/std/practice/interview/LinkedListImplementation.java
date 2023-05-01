package std.practice.interview;

import java.util.LinkedList;

public class LinkedListImplementation {

    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>();

        integerList.add(12);
        integerList.add(21);
        integerList.add(51);
        integerList.add(134);
        integerList.add(671);
        integerList.add(24);
        integerList.add(134);
        integerList.add(48);
        integerList.add(134);
        integerList.add(69);

        System.out.println(integerList);

        integerList.addFirst(1);

        System.out.println(integerList);

        integerList.addLast(1000);

        System.out.println(integerList);

        System.out.println(integerList.removeFirstOccurrence(134));

        System.out.println(integerList);

        System.out.println(integerList.removeLastOccurrence(134));

        System.out.println(integerList);

        System.out.println(integerList.removeLastOccurrence(1001));

        System.out.println(integerList);

        System.out.println("removeFirst :: " + integerList.removeFirst());

        System.out.println(integerList);

        System.out.println("removeLast :: " + integerList.removeLast());

        System.out.println(integerList);

        System.out.println("poll :: " + integerList.poll());

        System.out.println(integerList);

        System.out.println("pollFirst :: " + integerList.pollFirst());

        System.out.println(integerList);

        System.out.println("pollLast :: " + integerList.pollLast());

        System.out.println(integerList);

        System.out.println("If there are no elements in the list; remove, removeFirst, removeLast methods will throw noSuchElementException");
        System.out.println("If there are no elements in the list; poll, pollFirst, pollLast methods will result null");
        integerList.clear();

        System.out.println("poll :: " + integerList.poll());
        System.out.println("pollFirst :: " + integerList.pollFirst());
        System.out.println("pollLast :: " + integerList.pollLast());

        integerList.push(10);
        integerList.push(100);
        integerList.push(1000);
        integerList.push(10000);

        System.out.println(integerList);

        System.out.println(integerList.peek());

        System.out.println(integerList.peekFirst());

        System.out.println(integerList.peekLast());

        System.out.println(integerList);
    }
}
