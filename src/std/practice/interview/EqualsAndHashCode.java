package std.practice.interview;

import std.practice.interview.pojo.Money;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCode {
    public static void main(String[] args) {

        Money money = new Money(55, "USD");
        Money expenses = new Money(55, "USD");

        System.out.print("money.equals(expenses) : ");
        System.out.println(money.equals(expenses));

        Set<Money> moneySet = new HashSet<>();
        moneySet.add(money);
        moneySet.add(expenses);

        System.out.println(moneySet.size());
    }
}
