package bai1;

import java.io.*;

public class FileName {
    public static void main(String[] args) throws IOException {
        try {

            File file = new File("D:\\IDEA\\BaiTapVN\\src\\bai1\\Manager\\LaptopManager.java");

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            throw new IOException("Lỗi");
        }
    }
}