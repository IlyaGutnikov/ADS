package ru.ilyagutnikov.nontrivialsorting;

/**
 * Created by IlyaGutnikov on 03.07.2017.
 */
public class ArrayIns {

    private long[] theArray;
    private int nElems;

    public ArrayIns(int max) {

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

            while (theArray[++leftPtr] < pivot) {
                ;
            }

            while (rightPtr > 0 && theArray[--rightPtr] > pivot) {
                ;
            }

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }

        swap(leftPtr, right);
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

    public void quickSort() {

        recQucikSort(0, nElems - 1);
    }

    public void recQucikSort(int left, int right) {

        if (right-left <= 0) {
            return;
        } else {

            long pivot = theArray[right];

            int partition = partition(left, right, pivot);
            recQucikSort(left, partition-1);
            recQucikSort(partition+1, right);
        }
    }
}

