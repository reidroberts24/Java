public class Item {
    private String name;
    private double price;
    private int index;
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }




    // getters and setters below
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
    
    // add index getters and setters
    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }
}
