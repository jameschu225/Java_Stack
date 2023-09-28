import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String greeting = String.format("Hello, %s. Loverly to see you.", name);
        return greeting;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int findAlexis = conversation.indexOf("Alexis", 0);
        int findAlfred = conversation.indexOf("Alfred", 0);

        if (findAlexis >= 0){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (findAlfred >= 0){
            return "At your service. As you wish, naturally.";
        }
        else 
            return "Right. And with that I shall retire.";
    }
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        String greeting = String.format("Good %s, %s. Loverly to see you.",dayPeriod, name);
        return greeting;
    }

	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    public String guestGreeting() {
        // YOUR CODE HERE
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("k");
        String stringTime = simpleDateFormat.format(new Date());
        int time = Integer.parseInt(stringTime);
        if (time >= 6 && time <12){
            return "Good Morning";
        }
        else if (time >= 12 && time <18){
            return "Good Afternoon";
        }
        else if (time >= 18 && time <24){
            return "Good Evening";
        }
        else 
            return "Good Night";
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
