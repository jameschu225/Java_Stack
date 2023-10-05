import java.text.DecimalFormat;
import java.util.ArrayList;

public class CafeUtil{

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i =1; i <=numWeeks; i ++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total =0;
        for (double itemPrice : prices){
            total += itemPrice;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i =0; i <menuItems.size(); i++){
            String item = menuItems.get(i);
            System.out.println( i + " " + item);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello," + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(username);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        int qty = 0;
        while (qty < maxQuantity){
            if (qty != 0){
                price -= 0.5*qty;
                DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
                String output = myFormatter.format(price);
                System.out.println(qty+1 + " - " + output);
            }
            else {
                DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
                String output = myFormatter.format(price);
            System.out.println(qty+1 + " - " + output);
            }
        qty ++;
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            return false;
        }
        else{
            for (int item =0; item < menuItems.size(); item++){
                DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
                String output = myFormatter.format(prices.get(item));
                System.out.println(item + " " + menuItems.get(item) + " -- " + output);
            }
            return true;
        }
    }

    public void addCustomers(ArrayList<String> customers){
        String input = "g"; 
        while ( !input.equals("q")){
        System.out.println("Please enter your name:");
        System.out.println("Enter q to Exit");
            String username = System.console().readLine();
            if (username.equals("q")){
                System.out.println(customers);
                return;
            }
            customers.add(username);
            input = username;
        }
    }
}