package creational.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.someOperation();
    }
}
