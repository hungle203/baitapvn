package bai1.main;

import bai1.Manager.LaptopManager;
import bai1.Model.Laptop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args){
        LaptopManager laptopManager = new LaptopManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm theo id");
            System.out.println("3. Sửa sản phẩm theo id");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Hiển thị tất cả sản phẩm của một hãng");
            System.out.println("6. Tìm kiếm sản phẩm theo hãng");
            System.out.println("7. Tìm kiếm sản phẩm theo  màu sắc");
            System.out.println("8. Tìm kiếm sản phẩm theo giá");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    laptopManager.createLaptop();
                    break;
                case 2:
                    System.out.println("Nhập vào id muốn xóa");
                    int idDelete = scanner.nextInt();
                    laptopManager.deleteLaptopById(idDelete);
                    break;
                case 3:
                    System.out.println("Nhập vào id muốn sửa");
                    int idEdit = scanner.nextInt();
                    System.out.println(laptopManager.laptopUpdate(idEdit));
                    break;
                case 4:
                    laptopManager.displayAllLaptop();
                    break;
                case 5:
                    laptopManager.displayByBrand();
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Nhập tên hãng muốn tìm");
                    scanner.nextLine();
                    String br = scanner.nextLine();
                    ArrayList<Laptop> laptopList = laptopManager.FindLaptopByBrand(br);
                    System.out.println(laptopList);
                    break;
                case 7:
                    System.out.println("Nhập vào màu muốn tìm");
                    scanner.nextLine();
                    String col = scanner.nextLine();
                    ArrayList<Laptop> laptopList2 = laptopManager.findLaptopBColor(col);
                    System.out.println(laptopList2);
                    break;
                case 8:
                    System.out.println("Nhập vào khoảng giá muốn tìm");
                    scanner.nextLine();
                    double findPrice = scanner.nextDouble();
                    ArrayList<Laptop> laptopList3= laptopManager.findLaptopByPrice(findPrice);
                    System.out.println(laptopList3);
                    break;
            }
        } while (choice != 0);
    }
}
