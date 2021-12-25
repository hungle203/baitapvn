package bai2.model2;

public class Lemon extends Fruit {
    private final String name;

    public Lemon(String name, double weigh, String taste, String color, double price) {
        super(name,weigh, taste, color, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lemon{" + super.toString() +
                "name='" + name + '\'' +
                '}';
    }
}
