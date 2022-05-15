package patterns.structural.facade;

public class Kitchen {
    public void cookFood(){
        System.out.println("Cook the food");
    }
    public void signalReady() {
        System.out.println("Signal food is ready");
    }
}
