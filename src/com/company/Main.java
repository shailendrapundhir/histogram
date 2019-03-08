package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReaderStdInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter input values file path:");
        try {
            String path = bufferedReaderStdInput.readLine();

            ArrayList<String> values = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while (((line = bufferedReader.readLine()) != null)) {
                values.add(line);
            }

            for (String s : values) {
                int sum = 0;
                for (char ch : s.toCharArray()) {
                    sum += (int) ch;
                }

                System.out.println("Ascii sum for \"" + s + "\" : " + sum);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Invalid inputs");
        }
    }
}
