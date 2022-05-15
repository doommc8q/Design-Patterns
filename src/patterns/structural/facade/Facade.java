package patterns.structural.facade;

import java.io.File;

public class Facade {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.orderFood();
    }
}
