import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String greeting = String.format("Hello, %s. Lovely to see you!", name);
        return greeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String returnDate = String.format("It is currently %s.", date);
        return returnDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String response = "";
        if (conversation.contains("Alexis")) {

        response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            response = "At your service. As you wish, naturally";
        } else {
            response = "Right. And with that I shall retire.";
        }
        return response;
    }
    
	// NINJA BONUS
    public String guestGreeting(String name, String dayPeriod) {
        String greeting = String.format("Hello, %s. Lovely to see you this %s!", name, dayPeriod);
        return greeting;
    }
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(hourFormat.format(date));
        String dayPeriod = "";
        if (hour >= 5 && hour <= 12) {
            dayPeriod = "morning";
        } else if (hour >= 12 && hour <= 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }
        String greeting = String.format("Good %s! It's great to see you!", dayPeriod);
        return greeting;        
    }
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

