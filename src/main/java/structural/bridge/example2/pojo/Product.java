package structural.bridge.example2.pojo;

public abstract class Product {

    // Attributes
    protected Currency currency;

    // Constructor
    public Product(Currency currency) {
        this.currency = currency;
    }

    // Methods
    abstract public void print();


}
