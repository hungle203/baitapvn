package bai1.file;

import java.io.File;
import java.io.IOException;

public class FileName {
    public static void main(String[] args) throws IOException {
        try {

            File file = new File("D:\\IDEA\\BaiTapVN\\src\\bai1\\main\\Main.java");

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
