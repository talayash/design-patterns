package structural.bridge.example2.pojo;

public class Euro implements Currency{
    @Override
    public String code() {
        return "EUR";
    }

    @Override
    public void info() {
        System.out.println("Euro Currency (EUR)");
    }
}
