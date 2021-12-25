package bai2.model2;

public class Banana extends Fruit {
    private String name;

    public Banana(String name, double weigh, String taste, String color, double price) {
        super(name,weigh, taste, color, price);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Banana{" + super.toString() +
                "name='" + name + '\'' +
                '}';
    }
}
