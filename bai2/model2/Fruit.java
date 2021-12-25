package bai2.model2;

public class Fruit {
    private String name;
    private double weigh;
    private String taste;
    private String color;
    private double price;

    public Fruit() {
    }

    public Fruit(String name, double weigh, String taste, String color, double price) {
        this.name = name;
        this.weigh = weigh;
        this.taste = taste;
        this.color = color;
        this.price = price;
    }


    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weigh=" + weigh +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
