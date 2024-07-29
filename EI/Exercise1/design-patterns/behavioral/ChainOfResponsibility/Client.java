package behavioral.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setSuccessor(h2);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            h1.handleRequest(request);
        }
    }
}
