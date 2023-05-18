import java.util.ArrayList;

public class OrderDetail {
    private int quantity;
    private Product product;


    public double calcTotalPrice(){
        return this.quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s",quantity,calcTotalPrice());
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderDetail( Product p, int x) {
        this.quantity = x;
        this.product = p;
    }

    public Product getProduct() {
        return product;
    }
}
