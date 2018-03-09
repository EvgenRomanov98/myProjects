import Order.Order;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RunBUX {
    public static void main(String[] args) throws ParseException {
        Order order = new Order("Писькин дом", 200000);

//
//        order.setAvans(2000);
//        System.out.println(order.toString());
//        order.setAvans(180000);
//        System.out.println(order.toString());
//        order.setPayment(18000);
//        System.out.println(order.toString());

        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MINUTE,5);
        System.out.println(calendar.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        Date newDate = simpleDateFormat.parse("05/12/1985 05:55");
        System.out.println(newDate);
    }
}
