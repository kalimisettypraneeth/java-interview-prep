package std.practice.interview.programs;

import std.practice.interview.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;

public class FindNumberOfOccurrences {

    public static void main(String[] args) {

        // Frequency/Occurrences in the input string
        final String input = "abacabcbacsdbbvsbsabsdcsabsd";

        Map<String, Long> countMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);

        List<Employee> employeeList = Stream.of(
                new Employee(1, "Sai", "DEV", 60000),
                new Employee(2, "Praneeth", "DEV", 80000),
                new Employee(3, "Phani", "QA", 50000),
                new Employee(4, "Teja", "DEVOPS", 70000),
                new Employee(5, "Hemanth", "QA", 60000)
        ).collect(Collectors.toList());

        Map<String, Optional<Employee>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));

        System.out.println(employeeMap);

        Map<String, Employee> employeeMapOnSalary = employeeList.stream().
                collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.collectingAndThen(
                                maxBy(
                                        Comparator.comparingDouble(
                                                Employee::getSalary)), Optional::get)));

        System.out.println(employeeMapOnSalary);

        for(String dept : employeeMapOnSalary.keySet()) {
            System.out.println(dept + " | " + employeeMapOnSalary.get(dept));
        }

        List<String> names = Arrays.asList("Sai", "Praneeth", "Sai", "Teja", "Rahul", "Sai", "Teja");

        Map<String, Long> namesMap = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        System.out.println(namesMap);

//        names.forEach(System.out::println);

        namesMap.forEach((name, count) -> System.out.println(name));
    }
}
