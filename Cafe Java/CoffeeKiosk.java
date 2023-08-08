import java.util.ArrayList;

public class CoffeeKiosk {
    public ArrayList<Item> menu;
    public ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String newItemName, double newItemPrice) {
        Item newItem = new Item(newItemName, newItemPrice);
        this.menu.add(newItem);
        int newItemIndex = this.menu.indexOf(newItem);
        newItem.setIndex(newItemIndex);
    }

    public void displayMenu() {

        for (int i = 0; i < this.menu.size(); i++) {
            System.out.printf("%d %s -- $%.2f%n", i, this.menu.get(i).getName(), this.menu.get(i).getPrice());
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order1 = new Order(name);
        // Show the user the menu, so they can choose items to add.
        System.out.println("Please browse the menu below!");
        displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
        
    }

}
