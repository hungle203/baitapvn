package bai2.main;

import bai2.model2.Apple;
import bai2.model2.Banana;
import bai2.model2.Fruit;
import bai2.model2.Lemon;
import bai2.Manager.FruitManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm một quả");
            System.out.println("2. Hiển thị tất cả các loại quả");
            System.out.println("3. Hiển thị tất cả Apple");
            System.out.println("4. Hiển thị tất cả Banana");
            System.out.println("5. Hiển thị tất cả Lemon");
            System.out.println("6. Hiển thị quả có đơn giá cao nhất");
            System.out.println("7. Hiển thị quả có thể mua được nhiều nhất bằng 100000");
            System.out.println("8. Thêm quả vào list theo tên");
            System.out.println("9. Xóa quả trong list theo tên");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn của bạn");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("Nhập vào quả bạn muốn tạo: ");
                        System.out.println("1. Fruit");
                        System.out.println("2. Apple");
                        System.out.println("3. Banana");
                        System.out.println("4. Lemon");
                        System.out.println("0. Exit");
                        choice1 = scanner.nextInt();
                        if (choice1 != 0 && !fruitManager.addFruit(choice1)) {
                            System.out.println("Tên bị trùng mời nhập lại");
                            System.out.println();
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    System.out.println("Tất cả quả là");
                    scanner.nextLine();
                    fruitManager.disPlayAlLFruit();
                    break;
                case 3:
                    scanner.nextLine();
                    ArrayList<Apple> apples = fruitManager.displayAllApple();
                    for (Apple apple : apples) {
                        if (apple != null) {
                            System.out.println("Tất cả quả táo là");
                            System.out.println(apple);
                        } else {
                            System.out.println("Không có quả táo nào trong danh sách");
                        }
                    }
                    break;
                case 4:
                    scanner.nextLine();
                    ArrayList<Banana> bananas = fruitManager.displayAllBanana();
                    for (Banana banana : bananas) {
                        if (banana != null) {
                            System.out.println("Tất cả quả chuối là");
                            System.out.println(banana);
                        } else {
                            System.out.println("Không có quả chuối nào trong danh sách");
                        }
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    ArrayList<Lemon> lemons = fruitManager.displayAllLemon();
                    for (Lemon lemon : lemons) {
                        if (lemon != null) {
                            System.out.println("Tất cả quả tranh là");
                            System.out.println(lemon);
                        } else {
                            System.out.println("KHông có quả tranh nào trong danh sách");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Quả có đơn giá cao nhất là");
                    ArrayList<Fruit> fruits = fruitManager.fruitArrayListByPrice();
                    System.out.println(fruits);
                    break;
                case 7:
                    System.out.println("Qủa có thể mua được nhiều nhất bằng 1000000");
                    scanner.nextLine();
                    ArrayList<Fruit> fruit1 = fruitManager.displayByPrice();
                    System.out.println(fruit1);
                    break;
                case 8:
                    System.out.println("Nhập vào tên muốn thêm");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    fruitManager.FruitUpdateByName(name);
                    break;
                case 9:
                    System.out.println("Nhập vào tên muốn xóa");
                    scanner.nextLine();
                    String nameDelete = scanner.nextLine();
                    System.out.println(fruitManager.deleteFruit(nameDelete));
                    break;
            }
        } while (choice != 0);

    }
}
