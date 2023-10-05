package structural.bridge.example2.pojo;

public class Dollar implements Currency {
    @Override
    public String code() {
        return "USD";
    }

    @Override
    public void info() {
        System.out.println("Dollar Currency (USD)");
    }
}
