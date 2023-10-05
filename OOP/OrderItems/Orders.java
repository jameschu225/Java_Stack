import java.util.ArrayList;

public class Orders {

        public String name;
        public double total;
        public boolean ready;
        public ArrayList<Item> items = new ArrayList<Item>();

        public Orders(String orderName ){//, double orderPrice, boolean orderReady, ArrayList<Item> orderItems){
            name = orderName;
            // total = orderPrice;
            // ready = orderReady;
            // items = orderItems;
        }

}
