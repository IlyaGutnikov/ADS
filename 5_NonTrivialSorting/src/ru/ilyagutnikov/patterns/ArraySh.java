package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 03.07.2017.
 */
public class ArraySh {

    private long[] theArray;
    private int nElems;

    public ArraySh(int max) {

        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {

        theArray[nElems] = value;
        nElems++;
    }

    public void display() {

        System.out.println("A=");

        for (int i=0; i<nElems; i++) {

            System.out.print(theArray[i] + " ");
        }

        System.out.println();
    }

    public void shellSort() {

        int inner, outer;
        long temp;
        int h = 1;

        while (h <= nElems/3) {

            h = h*3 + 1;
        }

        while (h>0) {

            for (outer = h; outer < nElems; outer++) {

                temp = theArray[outer];
                inner = outer;

                while (inner > h-1 && theArray[inner - h] >= temp) {

                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }

                theArray[inner] = temp;
            }

            h = (h-1)/3;
        }
    }
}