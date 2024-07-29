package behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        new ConcreteObserver(subject);
        new ConcreteObserver(subject);

        subject.setState("State1");
        subject.setState("State2");
    }
}
