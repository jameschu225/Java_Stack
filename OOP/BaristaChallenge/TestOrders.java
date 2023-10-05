
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 10);
        Item item2 = new Item("latte", 40.33);
        Item item3 = new Item("drip coffee", 2000);
        Item item4 = new Item("cappuccino", 20.56);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();

        Order order2 = new Order("Cindhuri");

        Order order3 = new Order("Jimmy");

        Order order4 = new Order("Noah");

        Order order5 = new Order("Sam");

        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item3);

        // Application Simulations
        // Use this example code to test various orders' updates
        // Test status
        System.out.println(order5.getStatusMessage());
        order5.setOrderReady(true);
        System.out.println(order5.getStatusMessage());

        // Test order total
        System.out.println(order5.getOrderTotal());
        order5.display();

    }
}
