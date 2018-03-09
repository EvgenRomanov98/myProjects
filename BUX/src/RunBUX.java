import Order.Order;

public class RunBUX {
    public static void main(String[] args) {
        Order order = new Order("Писькин дом", 200000);

        order.setAvans(2000);
        System.out.println(order.toString());
        order.setAvans(180000);
        System.out.println(order.toString());
        order.setPayment(18000);
        System.out.println(order.toString());


    }
}
