package Order;

import java.util.Objects;

public class Payment {

    private int sum;
    private String Comment;
    private String date;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
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
        Payment payment = (Payment) o;
        return sum == payment.sum &&
                Objects.equals(Comment, payment.Comment) &&
                Objects.equals(date, payment.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sum, Comment, date);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "sum=" + sum +
                ", Comment='" + Comment + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
