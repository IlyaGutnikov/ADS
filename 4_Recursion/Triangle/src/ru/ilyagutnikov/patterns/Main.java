package ru.ilyagutnikov.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter the number: ");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String s = br.readLine();

            System.out.println("Triangle: " + triangle(Integer.parseInt(s)));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int triangle(int n) {

        if (n == 1) {

            return 1;
        } else {

            return (n + triangle(n-1));
        }
    }
}
