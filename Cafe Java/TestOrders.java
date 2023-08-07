public class TestOrders {
    
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("mocha", 3.75);
        Item item2 = new Item("latte", 4.50);
        Item item3 = new Item("drip coffee", 1.75);
        Item item4 = new Item("cappuccino", 4.25);

        // 1. Create 2 orders for unspecified guests.
        Order guestOrder1 = new Order();
        Order guestOrder2 = new Order();

        // 2. Create 3 orders using the overloaded constructor.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");

        // 3. Add at least 2 items to each order.
        guestOrder1.addItem(item1);
        guestOrder1.addItem(item3);

        guestOrder2.addItem(item2);
        guestOrder2.addItem(item3);

        order1.addItem(item1);
        order1.addItem(item4);

        order2.addItem(item2);
        order2.addItem(item3);

        order3.addItem(item1);
        order3.addItem(item2);
        
        // 4. Test getStatusMessage method by setting some orders to ready.
        guestOrder1.setReady(true);
        guestOrder2.setReady(false);
        order1.setReady(true);
        order2.setReady(false);
        order3.setReady(true);

        System.out.println("Guest Order 1 Status: " + guestOrder1.getStatusMessage());
        System.out.println("Guest Order 2 Status: " + guestOrder2.getStatusMessage());
        System.out.println("Order 1 Status: " + order1.getStatusMessage());
        System.out.println("Order 2 Status: " + order2.getStatusMessage());
        System.out.println("Order 3 Status: " + order3.getStatusMessage());

        // 5. Test the total.
        System.out.println("Guest Order 1 Total: $" + guestOrder1.getOrderTotal());
        System.out.println("Guest Order 2 Total: $" + guestOrder2.getOrderTotal());
        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());
        System.out.println("Order 3 Total: $" + order3.getOrderTotal());

        // 6. Call the display method on all orders.
        System.out.println("\nDisplaying Guest Order 1:");
        guestOrder1.display();
        System.out.println("\nDisplaying Guest Order 2:");
        guestOrder2.display();
        System.out.println("\nDisplaying Order 1:");
        order1.display();
        System.out.println("\nDisplaying Order 2:");
        order2.display();
        System.out.println("\nDisplaying Order 3:");
        order3.display();
    }
}
