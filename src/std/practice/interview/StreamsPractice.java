package std.practice.interview;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2, 56, 43, 111, 78, 1, 32,98, 102, 201, 13, 123, 45, 78, 59, 13);

        // Filter the elements greater than 50
        integerList.stream().filter(num -> num > 50).forEach(System.out::println);

        lineBreak();

        // Map the elements and multiply with 3
        integerList.stream().map(num -> num * 3).forEach(System.out::println);

        lineBreak();

        String input = "abaabccabccbbaacbabababccacabcbacbacba";

        Map<String, Long> inputMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(inputMap);

        lineBreak();

        integerList.stream().map(s -> s + "").filter(i -> i.startsWith("1")).forEach(System.out::println);

        integerList.stream().filter(i -> i > 200).findFirst().ifPresent(System.out::println);

        integerList.stream().max(Integer::compare).ifPresent(System.out::println);

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        Set<Integer> setOfIntegers = new HashSet<>();

        for(Integer i = 1; i <= 15; i++) {
            setOfIntegers.add(i);
        }

        Iterator<Integer> itr = setOfIntegers.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void lineBreak() {
        System.out.println("\n");
    }

}
