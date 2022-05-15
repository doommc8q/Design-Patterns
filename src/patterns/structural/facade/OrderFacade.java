package patterns.structural.facade;

public class OrderFacade {
    private Waiter waiter;
    private Kitchen kitchen;
    public void orderFood() {
        waiter.takeOrder();
        waiter.takeOrderToCook();
        kitchen.cookFood();
        kitchen.signalReady();;
        waiter.serverCustomer();;
    }
}
