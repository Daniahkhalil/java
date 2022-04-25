import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "place holder for guest greeting return string";
    }
    
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String  dateAnnouncement() {
        java.util.Date date=new java.util.Date();
        return String.format("It is currently %s.", date);
    }
    public String respondBeforeAlexis(String description) {
    // YOUR CODE HERE
    String alexis = "Alexis";
    String alfred = "Alfred";
    int a = description.indexOf ("Alexis");
    int b = description.indexOf ("Alfred");
    if(a >= 0){
        return "Immediately, sir. It's certainly not sophisticated enough for that.";
    }
    else if(b >= 0){
        return "At your service. As you wish, naturally.";
    }
    else {
        return "Good. And with that, I will retire.";
    }
    }
}
