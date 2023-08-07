import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "guest";
        this.items = new ArrayList<Item>();
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // class methods 
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (getReady()) {
            String ready = "Your order is ready.";
            return ready;
        } else {
            String notReady = "Thank you for waiting. Your order will be ready soon.";
            return notReady;
        }
    }

    public double getOrderTotal() {
        double total = 0.00;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (int i = 0; i < this.items.size(); i++) {
            Item currItem = this.items.get(i);
            System.out.printf("%s - $%.2f%n", currItem.getName(), currItem.getPrice());
        }
        System.out.printf("Total: $%.2f", this.getOrderTotal());

        
        
    }

    // getters and setters below
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setReady(boolean status) {
        this.ready = status;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

}
