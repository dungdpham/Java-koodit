import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        if (!hasItem(item)) {
            groceryList.add(item);
        } else {
            System.out.println("\nThe list already contains \"" + item + "\"");
        }
    }

    public boolean hasItem(String item) {
        return groceryList.contains(item);
    }

    public void removeItem(String item) {
        if (hasItem(item)) {
            groceryList.remove(item);
        } else {
            System.out.println("\nThe list does not contain \"" + item + "\"");
        }
    }

    public void printList() {
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();
        groceryList.addItem("Apples");
        groceryList.addItem("Milk");
        groceryList.addItem("Bread");
        groceryList.addItem("Milk");

        System.out.println("\nGrocery List: ");
        groceryList.printList();

        System.out.println("\nIs \"Milk\" in the grocery list? " + groceryList.hasItem("Milk"));

        System.out.println("\nRemoving \"Milk\" from the list...");
        groceryList.removeItem("Milk");

        System.out.println("\nUpdated Grocery List: ");
        groceryList.printList();

        groceryList.removeItem("Tomatoes");
    }
}
