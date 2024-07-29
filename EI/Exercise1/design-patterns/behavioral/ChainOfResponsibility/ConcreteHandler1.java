package behavioral.ChainOfResponsibility;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("ConcreteHandler1 handled request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
