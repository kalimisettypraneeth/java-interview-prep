package std.practice.interview.pojo;

import java.util.Objects;

public class Money {

    private int money;
    private String currencyCode;

    public Money(int money, String currencyCode) {
        this.money = money;
        this.currencyCode = currencyCode;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return this.getMoney() == money1.getMoney() &&
                Objects.equals(this.getCurrencyCode(), money1.getCurrencyCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.money, this.currencyCode);
    }
}
