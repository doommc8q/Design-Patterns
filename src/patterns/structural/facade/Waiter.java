package patterns.structural.facade;

public class Waiter {
    public void takeOrder() {
        System.out.println("Take Order from client");
    }

    public void takeOrderToCook() {
        System.out.println("Send order to cook");
    }
    public void serverCustomer() {
        System.out.println("Serve food");
    }
}
