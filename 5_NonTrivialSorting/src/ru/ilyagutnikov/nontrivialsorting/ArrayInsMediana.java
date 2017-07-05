package ru.ilyagutnikov.nontrivialsorting;

/**
 * Created by IlyaGutnikov on 03.07.2017.
 */
public class ArrayInsMediana {

    private long[] theArray;
    private int nElems;

    public ArrayInsMediana(int max) {

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

        int leftPtr = left;
        int rightPtr = right - 1;
        while (true) {

            while (theArray[++leftPtr] < pivot) {
                ;
            }

            while ( theArray[--rightPtr] > pivot) {
                ;
            }

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }

        swap(leftPtr, right-1);
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

        int size = right - left + 1;

        if (size <= 3)
            manualSort(left, right);
        else {

            long median = medianOf3(left, right);
            int partition = partition(left, right, median);

            recQucikSort(left, partition-1);
            recQucikSort(partition+1, right);
        }
    }

    public long medianOf3(int left, int right) {

        int center = (left + right)/2;

        if (theArray[left] > theArray[center]) {

            swap(left, center);
        }

        if (theArray[left] > theArray[right]) {

            swap(left, right);
        }

        if (theArray[center] > theArray[right]) {

            swap(center, right);
        }

        //Разсещение медианы по правому краю
        swap(center, right-1);

        return theArray[right - 1];
    }

    public void manualSort(int left, int right) {

        int size = right - left + 1;
        if (size <= 1)
            return;
        if (size == 2) {

            if (theArray[left] > theArray[right])
                swap(left, right);
            return;
        }
        else {
            if (theArray[left] > theArray[right - 1])
                swap(left, right-1);
            if (theArray[left] > theArray[right])
                swap(left, right);
            if (theArray[right-1] > theArray[right])
                swap(right-1, right);
        }
    }
}

