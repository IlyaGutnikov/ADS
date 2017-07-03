package ru.ilyagutnikov.patterns;

public class Main {

    public static void main(String[] args) {
	    // Shell sorting

        int maxSize = 100;
        ArraySh arraySh = new ArraySh(maxSize);

        for (int j=0; j<maxSize; j++) {

            long n = (int)(java.lang.Math.random() * 999);
            arraySh.insert(n);
        }

        arraySh.display();
        arraySh.shellSort();
        arraySh.display();
    }
}
