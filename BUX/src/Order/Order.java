package Order;

import java.util.Date;
import java.util.Objects;

public class Order {

    private String name;    // название
    private int sum;        // сума заказа
    private int costs;      // расходы
    private int avans;      // аванс
    private int payment;    // оплата
    private int debt;       // долг
    private int remainder;  // остаток (аванс + оплата - расходы)
    private String date;    // дата установки

    public Order() {
    }

    public Order(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getAvans() {
        return avans;
    }

    public void setAvans(int avans) {
        if (this.avans != this.sum) {
            this.avans += avans;
            this.payment += avans;
        } else {
            System.out.println("клиент уже расплатился, сумма всех авансов равна сумме заказа");
        }
        this.remainder = this.payment - this.costs;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        if (this.payment + payment <= this.sum) {
            this.payment += payment;
            if (payment == sum) {
                System.out.println("клиент расплатился");
            }
        } else {
            System.out.println("проверте вводимые данные");
        }
        this.remainder = this.payment - this.costs;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return sum == order.sum &&
                remainder == order.remainder &&
                costs == order.costs &&
                avans == order.avans &&
                payment == order.payment &&
                Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sum, remainder, costs, avans, payment);
    }

    @Override
    public String toString() {
        return "Order{" +
                "Заказчик='" + name + '\'' +
                ", Сумма=" + sum +
                ", Остаток=" + remainder +
                ", Расходы=" + costs +
                ", Аванс=" + avans +
                ", Оплата=" + payment +
                '}';
    }
}
