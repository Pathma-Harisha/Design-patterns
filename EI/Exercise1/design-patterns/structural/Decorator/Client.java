package structural.Decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratedComponent = new ConcreteDecorator(component);
        decoratedComponent.operation();
    }
}
