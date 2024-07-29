package behavioral.Observer;

public class ConcreteObserver implements Observer {
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        observerState = subject.getState();
        System.out.println("Observer State updated to: " + observerState);
    }
}
