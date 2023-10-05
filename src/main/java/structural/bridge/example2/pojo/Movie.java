package structural.bridge.example2.pojo;

public class Movie extends Product{
    public Movie(Currency currency) {
        super(currency);
    }

    @Override
    public void print() {
        System.out.println("Product: Movie, Currency: " + currency.code());
    }
}
