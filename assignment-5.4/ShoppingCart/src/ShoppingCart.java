import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void addItem(String itemName, double price) {
        cart.put(itemName, price);
    }

    public void removeItem(String itemName) {
        cart.remove(itemName);
    }

    public int getItemCount() {
        return cart.size();
    }

    public double calculateTotal() {
        double sum = 0;
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }
}
