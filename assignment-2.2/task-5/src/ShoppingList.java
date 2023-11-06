public class ShoppingList {
    private String listName;
    private GroceryListManager items = new GroceryListManager();

    public ShoppingList(String listName) {
        this.listName = listName;
    }

    public String getListName() {
        return listName;
    }

    public void addItem(String item, double cost, String category, int quantity) {
        items.addItemWithCost(item, cost);
        items.addItemWithCategory(item, category);
        items.updateQuantity(item, quantity);
    }

    public void removeItem(String item) {
        items.removeItem(item);
    }

    public void displayList() {
        items.printList();
    }
}
