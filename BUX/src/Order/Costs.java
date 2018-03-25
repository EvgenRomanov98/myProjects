package Order;

import java.util.Objects;

public class Costs {

    private int sum;
    private String comment;
    private String date;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        Costs costs = (Costs) o;
        return sum == costs.sum &&
                Objects.equals(comment, costs.comment) &&
                Objects.equals(date, costs.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sum, comment, date);
    }

    @Override
    public String toString() {
        return "Costs{" +
                "sum=" + sum +
                ", comment='" + comment + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
