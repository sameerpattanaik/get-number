package com.example.getNumber.serviceimpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumberService {
    public List<Integer> numberImpl() throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/number.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> integers;
        integers = new ArrayList<>();

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        return integers;
    }
}
