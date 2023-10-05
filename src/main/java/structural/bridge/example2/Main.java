package structural.bridge.example2;

import structural.bridge.example2.pojo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product bookWithDollar = new Book(new Dollar());
        Product bookWithEuro = new Book(new Euro());

        Product movieWithDollar = new Movie(new Dollar());
        Product movieWithEuro = new Movie(new Euro());

        products.add(bookWithDollar);
        products.add(bookWithEuro);
        products.add(movieWithDollar);
        products.add(movieWithEuro);

        products.forEach(Product::print);

    }
}
