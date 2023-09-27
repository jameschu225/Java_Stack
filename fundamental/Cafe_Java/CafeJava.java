public class CafeJava {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java.";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffeePrice = 7;
        double lattePrice = 5;
        double cappuccinoPrice = 6.8;
        
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(readyMessage );
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4){
            System.out.println(readyMessage + " " + displayTotalMessage  + cappuccinoPrice);
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattePrice*2);
        if (!isReadyOrder2){
            System.out.println(pendingMessage);
        }
        else {
            System.out.println(readyMessage);
        }

        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice));


    }
    
}