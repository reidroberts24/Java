import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int totalDrinks = 0;
        for (int i = 0; i <= numWeeks; i++) {
            totalDrinks += i;
        }
        return totalDrinks;
    }

    public double getOrderTotal(double[] prices) {
        // add all of the prices in the array and return the result
        int orderTotal = 0;
        for (double price : prices) {
            orderTotal += price;
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        
        for (int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            System.out.printf("%d %s%n", i, item);
        }

    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!%n", username);
        int numPeople = customers.size();
        System.out.printf("There are %d people in front of you!%n", numPeople);
        customers.add(username);
        for (String customer : customers) {
            System.out.println(customer);
        }
    }

    // NINJA BONUSES
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.printf("%s\n", product);
        for (int i = 1; i <= maxQuantity; i++) {
            double newPrice = (i * price) - (0.50 * (i - 1));
            System.out.printf("%d - $%.2f%n", i, newPrice);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        } 
        for (int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            double price = prices.get(i);
            System.out.printf("%d - %s - $%.2f%n", i, item, price );
        }
        return true;
    }

    public void addCustomers() {
        ArrayList<String> customerList = new ArrayList<>();
        System.out.printf("Please enter customer name(s): %n");
        String input = System.console().readLine();
        while (!input.equals("q")) {
            customerList.add(input);
            System.out.printf("Enter next customer name or type 'q' to finish.%n");
            input = System.console().readLine();
        }
        System.out.printf("Here is the list of customers you added!%n");
        for (String name : customerList) {
            System.out.println(name);
        }
    }
    
}