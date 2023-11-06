import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        if (groceryList.containsKey(item) && groceryList.get(item) != cost) {
            System.out.println("\nUpdating cost of \"" + item + "\"...");
        }
        groceryList.put(item, cost);
    }

    public boolean hasItem(String item) {
        return groceryList.containsKey(item);
    }

    public void removeItem(String item) {
        if (hasItem(item)) {
            groceryList.remove(item);
        } else {
            System.out.println("\nThe list does not contain \"" + item + "\".");
        }
    }

    public void printList() {
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " euros.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;

        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            totalCost += entry.getValue();
        }

        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        groceryList.addItem("PC", 1000);
        groceryList.addItem("Monitor", 250);
        groceryList.addItem("Mouse", 120);
        groceryList.addItem("Keyboard", 150);

        System.out.println("\nList: ");
        groceryList.printList();
        System.out.println("Total cost: " + groceryList.calculateTotalCost() + " euros.");

        System.out.println("\nDoes the list contain \"Headset\"? " + groceryList.hasItem("Headset"));
        groceryList.addItem("Headset", 100);
        groceryList.addItem("PC", 850);

        System.out.println("\nUpdated List: ");
        groceryList.printList();

        System.out.println("\nRemoving \"Monitor\"...");
        groceryList.removeItem("Monitor");
        groceryList.removeItem("Speakers");

        System.out.println("\nUpdated List: ");
        groceryList.printList();
        System.out.println("Total cost: " + groceryList.calculateTotalCost() + " euros.");
    }
}
