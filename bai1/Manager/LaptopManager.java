package bai1.Manager;

import bai1.Model.Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager implements S{
    ArrayList<Laptop> laptops;
    Scanner scanner = new Scanner(System.in);


    public LaptopManager() {
        this.laptops = new ArrayList<>();
    }

    public Laptop createLaptop() {
        System.out.println("Nhập vào Hãng: ");
        String br = scanner.nextLine();
        System.out.println("Nhập vào Màu sắc: ");
        String cor = scanner.nextLine();
        System.out.println("Nhập vào giá tiền: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vào số lượng: ");
        int qua = scanner.nextInt();
        scanner.nextLine();
        Laptop laptop = new Laptop(br, cor, price, qua);
        laptops.add(laptop);
        return laptop;
    }

    public void displayAllLaptop() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public void displayByBrand() {
        ArrayList<Laptop> laptop = new ArrayList<>();
        for (Laptop l : laptops) {
            laptop.add(l);
        }
        System.out.println(laptop);
    }

    public ArrayList<Laptop> findLaptopByPrice(double price) {
        ArrayList<Laptop> laptop = new ArrayList<>();
        for (Laptop l : laptops) {
            boolean check = l.getPrice() == price;
            if (check) {
                laptop.add(l);
                return laptop;
            } else {
                System.out.println("Không có máy tính ở khoảng giá này!");
            }
        }
        return null;
    }

    public ArrayList<Laptop> findLaptopBColor(String color) {
        ArrayList<Laptop> laptop = new ArrayList<>();
        for (Laptop l : laptops) {
            if (l.getColor().equals(color)) {
                laptop.add(l);
            }
        }
        return laptop;
    }

    public Laptop laptopUpdate(int id) {
        Laptop laptopUpdate = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptopUpdate = l;
            }
        }
        if (laptopUpdate != null) {
            System.out.println("Nhập vào Hãng mới: ");
            String br = scanner.nextLine();
            laptopUpdate.setBrand(br);
            System.out.println("Nhập vào Màu sắc mới: ");
            String cor = scanner.nextLine();
            laptopUpdate.setColor(cor);
            System.out.println("Nhập vào giá tiền mới: ");
            double price = scanner.nextDouble();
            laptopUpdate.setPrice(price);
            System.out.println("Nhập vào số lượng mới: ");
            int qua = scanner.nextInt();
            laptopUpdate.setQuantity(qua);
            scanner.nextLine();
            return laptopUpdate;
        }
        return null;
    }

    public void deleteLaptopById(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptop = l;
            }
            boolean check = laptops.removeAll(laptops);
            if (check) {
                System.out.println(laptop);
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Xóa không thành công!!");
                System.out.println(laptops);
            }
        }
    }

    public ArrayList<Laptop> FindLaptopByBrand(String br) {
        ArrayList<Laptop> laptop = new ArrayList<>();
        for (Laptop l : laptops) {
            if (l.getBrand().equals(br)) {
                laptop.add(l);
            }
        }
        return laptop;
    }
}
