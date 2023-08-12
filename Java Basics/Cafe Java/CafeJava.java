public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 1.25;
        double latte = 4.25;
        double cappuccino = 4.00;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage + "!");
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage + "! " + displayTotalMessage + cappuccino);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage + ".");
        }
        
        double samPrice = 2 * latte;
        System.out.println(generalGreeting + customer2 + "! " + displayTotalMessage + samPrice + ".");
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + ".");
        } else {
            System.out.println(customer2 + pendingMessage + ".");
        }
        
        double jimmyPrice = latte - dripCoffee;
        System.out.println(generalGreeting + customer3 + "! " +displayTotalMessage + jimmyPrice +".");
    }
}
