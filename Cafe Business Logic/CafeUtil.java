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
        System.out.printf("Hello, %s!\n", username);
        int numPeople = customers.size();
        System.out.printf("There are %d people in front of you!\n", numPeople);
        customers.add(username);
        for (String customer : customers) {
            System.out.println(customer);
        }
    }

}