package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        File file = new File(args[0]);
        ArrayList<String> values = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while (((line = bufferedReader.readLine()) !=null)){
                values.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : values) {
            int sum = 0;
            for (char ch : s.toCharArray()) {
                sum += (int) ch;
            }

            System.out.println("Ascii sum for \"" + s + "\" : " + sum);
        }
    }
}
