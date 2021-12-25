package bai1.Model;

import java.io.Serializable;

public class Laptop implements Serializable {
  public static int VALUE=0;
    private int id;
    private String brand;
    private String color;
    private  double price;
    private int quantity;

  public Laptop() {
  }

  public Laptop(String brand, String color, double price, int quantity) {
    this.id = ++VALUE;
    this.brand = brand;
    this.color = color;
    this.price = price;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
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

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public void displayLaptop() {
    System.out.printf("%-20S%-15s%-20s", id,color,price,quantity);
  }

  @Override
  public String toString() {
    return "bai1.Model.Laptop{" +
            "id=" + id +
            ", brand='" + brand + '\'' +
            ", color='" + color + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            '}';
  }
}
