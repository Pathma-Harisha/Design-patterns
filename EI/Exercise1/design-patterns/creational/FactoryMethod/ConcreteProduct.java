package creational.FactoryMethod;

public class ConcreteProduct implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProduct");
    }
}
