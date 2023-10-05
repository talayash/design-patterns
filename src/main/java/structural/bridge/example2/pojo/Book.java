package structural.bridge.example2.pojo;

public class Book extends Product{

    public Book(Currency currency) {
        super(currency);
    }

    @Override
    public void print() {
        System.out.println("Product: Book, Currency: " + currency.code());
    }
}
