import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale local = new Locale("vi", "vn");
        NumberFormat format = NumberFormat.getCurrencyInstance(local);
        Product p1 = new Product("Nuoc tuong", "sp4", 8000);
        OrderDetail o1 = new OrderDetail(p1,10);
        Product p2 = new Product("Gao", "sp1", 18000);
        OrderDetail o2 = new OrderDetail(p1,5);
        Product p3 = new Product("Duong", "sp3", 10000);
        OrderDetail o3 = new OrderDetail(p1,1);
        Product p4 = new Product("Gao", "sp1", 18000);
        OrderDetail o4 = new OrderDetail(p1,1);
        Order order = new Order(1, LocalDate.now());
        order.lineItems = new ArrayList<>();
        order.addLineItem(p1, o1.getQuantity());
        order.addLineItem(p2, o2.getQuantity());
        order.addLineItem(p3, o3.getQuantity());
        order.addLineItem(p4, o4.getQuantity());
        System.out.println("MA HD: " + order.getOrderID());
        System.out.println("Ngay lap hoa don: "+ order.getOrderDate());

        System.out.printf("%-5s %-10s %-15s %-15s %-15s %-20s\n",
                "STT",
                "| Ma SP ",
                "| Mo ta ",
                "| Don gia ",
                "| So luong ",
                "| Thanh tien "

        );
        for (OrderDetail o : order.lineItems) {
            System.out.printf("%-5s %-10s %-15s %-15s %-15s %-20s\n",
                    order.getLineItems().indexOf(o)+1,
                    "| "+ o.getProduct().getProductID(),
                    "| "+ o.getProduct().getDescription(),
                    "| "+ o.getProduct().getPrice(),
                    "| "+ o.getQuantity(),
                    "| "+ format.format(o.calcTotalPrice())

            );
        }
        System.out.println("Tong tien thanh toan: " + format.format(order.calcTotalCharge()));
    }
}