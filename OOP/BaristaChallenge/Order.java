import java.text.DecimalFormat;
import java.util.ArrayList;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getOrder(){
        return name;
    }

    public boolean isOrderReady(){
        return ready;
    }

    public void setOrderReady(boolean status){
        this.ready = status;
    }

    public void getOrderList(){
        DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
        for (Item item : items){
            String itemName = item.getName();
            double itemPrice = item.getPrice();
            String output = myFormatter.format(itemPrice);
            System.out.printf(itemName + " - " + output + "\n");
        }
    }

    public void addItem(Item newItem){
        items.add(newItem);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting, your order will be ready soon.";
    }

    // public String getStatusMessage(){
    //     if (isOrderReady()){
    //         return ("Your order is ready.");
    //     } else {
    //         return ( "Thank you for waiting. Your order will be ready soon.");
    //     }
    // }

    public String getOrderTotal(){
        double total = 0;
        for (Item item : items){
            total += item.getPrice();
        }
        DecimalFormat myFormatter = new DecimalFormat("$###,###.###");
        String output = myFormatter.format(total);
        return output;
    }

    public void display(){
        System.out.printf("Customer Name: " + this.name + "\n");
        // System.out.printf("Name: " + getOrderList());
        getOrderList();
        System.out.printf("Total: %s\n",  getOrderTotal());

    }
}
