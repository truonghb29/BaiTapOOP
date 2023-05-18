import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private int count;
    ArrayList<OrderDetail> lineItems;
    public void addLineItem(Product p, int x) {
        lineItems.add(new OrderDetail(p, x));
    }

    public double calcTotalCharge() {
        double tong = 0;
        for (OrderDetail o : lineItems){
            tong += o.calcTotalPrice();
        }
        return tong;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s",orderID,orderDate);
    }

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}