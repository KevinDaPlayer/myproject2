package com.Kevin.sales.midshop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuyingFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("buyfiles.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                String[] token = line.split(",");
                String id= token[0];
                int amount = Integer.parseInt(token[1]);
                Customer customer = new Customer(id, amount);
                customer.print();
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        } catch (IOException e) {
            System.out.println("資料讀取失敗");
        }
    }
}
