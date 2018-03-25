package Order;

import java.util.Objects;

public class Provider {

    private String name;
    private int sum;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return sum == provider.sum &&
                Objects.equals(name, provider.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sum);
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
