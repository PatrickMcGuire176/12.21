package com.company;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        ArrayList<String> unsortedArrayList = new ArrayList<>();
        java.io.File file = new File("user.dir/test.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){
                unsortedArrayList.add(scanner.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<String> sortedArrayList = new ArrayList<>(unsortedArrayList);
        Collections.sort(sortedArrayList);

        for (int i = 0; i<unsortedArrayList.size(); i++)
            if (!unsortedArrayList.get(i).equals(sortedArrayList.get(i))){
                System.out.println("Not Equal");
                break;
            }

    }
}
