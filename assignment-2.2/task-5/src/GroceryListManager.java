import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class GroceryListManager {
    private HashMap<String, HashMap<String, String>> groceryList = new HashMap<>();
    private HashMap<String, String> itemDetails;
    private ArrayList<ShoppingList> shoppingLists = new ArrayList<>();

    public void createShoppingList(String listName) {
        ShoppingList shoppingList = new ShoppingList(listName);
        shoppingLists.add(shoppingList);
    }

    public void showLists() {
        for (ShoppingList list : shoppingLists) {
            System.out.println(list.getListName());
        }
    }

    public ShoppingList getList(String listName) {
        for (ShoppingList list : shoppingLists) {
            if (listName.equals(list.getListName())) {
                return list;
            }
        }
        return null;
    }

    public void addItemWithCost(String item, double cost) {
//        HashMap<String, String> itemDetails;

        if (groceryList.containsKey(item)) {
            itemDetails = groceryList.get(item);
            itemDetails.put("Cost", Double.toString(cost));
        } else {
            itemDetails = new HashMap<>();
            itemDetails.put("Cost", Double.toString(cost));
            groceryList.put(item, itemDetails);
        }
    }

    public void addItemWithCategory(String item, String category) {
//        HashMap<String, String> itemDetails;

        if (groceryList.containsKey(item)) {
            itemDetails = groceryList.get(item);
            itemDetails.put("Category", category);
        } else {
            itemDetails = new HashMap<>();
            itemDetails.put("Category", category);
            groceryList.put(item, itemDetails);
        }
    }

    public void addItemWithQuantity(String item, int quantity) {
        if (groceryList.containsKey(item)) {
            itemDetails = groceryList.get(item);
            itemDetails.put("Quantity", Integer.toString(quantity));
        } else {
            itemDetails = new HashMap<>();
            itemDetails.put("Quantity", Integer.toString(quantity));
            groceryList.put(item, itemDetails);
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            itemDetails = groceryList.get(item);
            itemDetails.put("Quantity", Integer.toString(newQuantity));
        } else {
            System.out.println("\nThe list does not contain \"" + item + "\"");
        }
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
        } else {
            System.out.println("The list does not contain \"" + item + "\".");
        }
    }

    public void printList() {
        System.out.println("\nList: ");
        for (Map.Entry<String, HashMap<String, String>> item : groceryList.entrySet()) {
            HashMap<String, String> itemDetails = item.getValue();
            System.out.println(item.getKey() + " " + itemDetails.entrySet());
//            for (Map.Entry<String, String> detail : itemDetails.entrySet()) {
//                System.out.println(detail.getKey() + ": " + detail.getValue());
//            }
        }
    }

    public void displayByCategory(String category) {
        System.out.println("\nCategory \"" + category + "\" contains: ");
        for (Map.Entry<String, HashMap<String, String>> item : groceryList.entrySet()) {
            HashMap<String, String> itemDetails = item.getValue();
            if (itemDetails.get("Category").equals(category)) {
                System.out.println(item.getKey());
            }
        }
    }

    public void displayAvailableItems() {
        System.out.println("\nAvailable items: ");
        for (Map.Entry<String, HashMap<String, String>> item : groceryList.entrySet()) {
            HashMap<String, String> itemDetails = item.getValue();
            if (itemDetails.get("Quantity") != null && Integer.parseInt(itemDetails.get("Quantity")) > 0) {
                System.out.println(item.getKey() + ": quantity = " + Integer.parseInt(itemDetails.get("Quantity")));
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        groceryList.addItemWithCost("Apple", 20);
        groceryList.addItemWithCategory("Apple", "Fruits");
        groceryList.printList();

        groceryList.addItemWithCost("Apple", 30);
        groceryList.addItemWithCategory("Orange", "Fruits");
        groceryList.addItemWithCategory("Milk", "Dairy");
        groceryList.addItemWithCost("Orange", 15);
        groceryList.printList();

        groceryList.displayByCategory("Fruits");

        groceryList.addItemWithQuantity("Milk", 2);
        groceryList.addItemWithQuantity("Apple", 70);
        groceryList.addItemWithQuantity("Flour", 0);
        groceryList.printList();

        groceryList.updateQuantity("Apple", 59);
        groceryList.displayAvailableItems();

        GroceryListManager listManager = new GroceryListManager();
        listManager.createShoppingList("Backyard BBQ");
        listManager.createShoppingList("Picnic");

        listManager.showLists();

        ShoppingList BBQList = listManager.getList("Backyard BBQ");
        BBQList.addItem("Steak", 30, "Meat", 5);
        BBQList.addItem("Beer", 5, "Beverage", 24);
        System.out.println("\nList: " + BBQList.getListName() + ": ");
        BBQList.displayList();
    }
}
