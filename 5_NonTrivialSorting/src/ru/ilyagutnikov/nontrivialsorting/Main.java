package ru.ilyagutnikov.nontrivialsorting;

public class Main {

    public static void main(String[] args) {

	    // Shell sorting
        System.out.println("Shell sorting");
        int maxSize = 100;
        ArraySh arraySh = new ArraySh(maxSize);

        for (int j=0; j<maxSize; j++) {

            long n = (int)(java.lang.Math.random() * 999);
            arraySh.insert(n);
        }

        arraySh.display();
        arraySh.shellSort();
        arraySh.display();

        //Partition
        System.out.println("Partition");
        ArrayPar arrayPar = new ArrayPar(maxSize);

        for (int j=0; j<maxSize; j++) {

            long n = (int)(java.lang.Math.random() * 999);
            arrayPar.insert(n);
        }

        arrayPar.display();
        long pivot = 99;
        System.out.println("Pivot is " + pivot);

        int partDex = arrayPar.partition(0, arrayPar.size()-1, pivot);
        System.out.println("Partition is at index " + partDex);
        arrayPar.display();

        //Quick sort
        System.out.println("Quick sort 1");
        ArrayIns arrayIns = new ArrayIns(maxSize);

        for (int j=0; j<maxSize; j++) {

            long n = (int)(java.lang.Math.random() * 999);
            arrayIns.insert(n);
        }

        arrayIns.display();
        arrayIns.quickSort();
        arrayIns.display();

    }
}
