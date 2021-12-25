package bai2.Manager;

import bai2.model2.Apple;
import bai2.model2.Banana;
import bai2.model2.Fruit;
import bai2.model2.Lemon;

import java.util.*;

public class FruitManager {
    Map<String, Fruit> fruitHashMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public boolean addFruit(int choice) {
        System.out.println("Nhập vào tên");
        String name = scanner.nextLine();
        System.out.println("Nhập cân nặng");
        double we = scanner.nextDouble();
        System.out.println("Nhập Vị");
        scanner.nextLine();
        String taste = scanner.nextLine();
        System.out.println("Nhập màu sắc");
        String col = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = scanner.nextDouble();
        scanner.nextLine();
        switch (choice) {
            case 1:
                Fruit fruit = new Fruit(name,we, taste, col, price);
                return checkNameFruit(fruit);
            case 2:
                Apple apple = new Apple(name, we, taste, col, price);
                return checkNameFruit(apple);
            case 3:
                Banana banana = new Banana(name, we, taste, col, price);
                return checkNameFruit(banana);
            case 4:
                Lemon lemon = new Lemon(name, we, taste, col, price);
                return checkNameFruit(lemon);
        }
        return false;
    }

    private boolean checkNameFruit(Fruit fruit) {
        HashSet<String> strings = new HashSet<>(fruitHashMap.keySet());
        if (strings.add(fruit.getName())) {
            fruitHashMap.put(fruit.getName(), fruit);
            return true;
        } else {
            return false;
        }

    }

    public void disPlayAlLFruit() {
        for (Fruit fruit : fruitHashMap.values()) {
            System.out.println(fruit);
        }
    }


    public ArrayList<Fruit> fruitArrayListByPrice() {
       ArrayList<Fruit> fruit = new ArrayList<>();
     double max = Integer.MIN_VALUE;
        for (Fruit fruit1: fruitHashMap.values()) {
            if (fruit1.getPrice() > max) {
                max = fruit1.getPrice();
                fruit.add(fruit1);

            }
        }
        return fruit;
    }

    public ArrayList<Apple> displayAllApple() {
        ArrayList<Apple> apples = new ArrayList<>();
        for (Fruit fruit : fruitHashMap.values()) {
            if ( fruit instanceof Apple) {
                apples.add((Apple) fruit);
            }
        }
        return apples;
    }

    public ArrayList<Banana> displayAllBanana() {
        ArrayList<Banana> bananas = new ArrayList<>();
        for (Fruit fruit : fruitHashMap.values()) {
            if ( fruit instanceof Banana) {
               bananas.add((Banana) fruit);
            }
        }
        return bananas;
    }

    public ArrayList<Lemon> displayAllLemon() {
        ArrayList<Lemon> lemons= new ArrayList<>();
        for (Fruit fruit : fruitHashMap.values()) {
            if ( fruit instanceof Lemon) {
                lemons.add((Lemon) fruit);
            }
        }
        return lemons;
    }

  public ArrayList<Fruit> displayByPrice() {
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
      for (Fruit fruit: fruitHashMap.values()) {
          if (fruit.getPrice() <=1000000) {
              fruitArrayList.add(fruit);
          }
      }
      return fruitArrayList;
  }


    public void FruitUpdateByName(String name) {
        Fruit fruit = fruitHashMap.get(name);
        if (fruit != null) {
            System.out.println("Nhập cân nặng mới");
            double we = scanner.nextDouble();
            System.out.println("Nhập Vị mới");
            scanner.nextLine();
            String taste = scanner.nextLine();
            System.out.println("Nhập màu sắc mới");
            String col = scanner.nextLine();
            System.out.println("Nhập giá mới");
            double price = scanner.nextDouble();
            scanner.nextLine();
            fruit.setWeigh(we);
            fruit.setTaste(taste);
            fruit.setColor(col);
            fruit.setPrice(price);
            fruitHashMap.remove(name);
            fruitHashMap.put(name,fruit);
        }
        assert fruit != null;
        fruitHashMap.get(fruit.getName());
    }


    public Fruit deleteFruit(String name) {
        return fruitHashMap.remove(name);
    }
}
