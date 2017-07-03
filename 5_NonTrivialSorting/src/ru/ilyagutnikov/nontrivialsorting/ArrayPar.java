package ru.ilyagutnikov.nontrivialsorting;

/**
 * Created by IlyaGutnikov on 03.07.2017.
 */
public class ArrayPar {

    private long[] theArray;
    private int nElems;

    public ArrayPar(int max) {

        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {

        theArray[nElems] = value;
        nElems++;
    }

    public int size() {

        return nElems;
    }

    public void display() {

        System.out.println("A=");

        for (int i=0; i<nElems; i++) {

            System.out.print(theArray[i] + " ");
        }

        System.out.println();
    }

    /**
     * Разбиение массива
     * @param left отступ слева
     * @param right оступ справа
     * @param pivot опорный элемент
     * @return позиция разбиения
     */
    public int partition(int left, int right, long pivot) {

        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {

            while (leftPtr < right && theArray[++leftPtr] < pivot) {
                ;
            }

            while (rightPtr > left && theArray[--rightPtr] > pivot) {
                ;
            }

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }

        return leftPtr;
    }

    /**
     * Перестановка двух элементов
     * @param dex1
     * @param dex2
     */
    public void swap(int dex1, int dex2) {

        long temp;
        temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
