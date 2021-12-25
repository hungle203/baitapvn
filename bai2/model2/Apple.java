package bai2.model2;

public class Apple extends Fruit {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple(String name, double weigh, String taste, String color, double price) {
        super(name,weigh, taste, color, price);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Apple{" + super.toString() +
                "name='" + name + '\'' +
                '}';
    }
}
