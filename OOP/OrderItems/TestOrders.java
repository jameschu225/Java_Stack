import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 10);
        Item item2 = new Item("latte", 40.33);
        Item item3 = new Item("drip coffee", 2000);
        Item item4 = new Item("cappuccino", 20.56);

        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders("Cindhuri");
        order1.ready = true;
        Orders order2 = new Orders("Jimmy");
        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;
        Orders order3 = new Orders("Noah");
        order3.items.add(item4);
        order3.total += item4.price;
        Orders order4 = new Orders("Sam");
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price*2;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
}
