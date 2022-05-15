package patterns.structural.proxy;

public class Proxy {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("instagram.com");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
