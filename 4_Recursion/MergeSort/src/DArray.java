/**
 * Created by IlyaGutnikov on 11.06.2017.
 */
public class DArray {

    private long[] array;
    private int nElems;

    public DArray(int max) {

        array = new long[max];
        nElems = 0;
    }

    public void insert(long value) {

        array[nElems] = value;
        nElems++;
    }

    public void display() {

        for (int j=0; j<nElems; j++) {

            System.out.print(array[j] + " ");
        }

        System.out.println("");
    }

    public void mergeSort() {

        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems - 1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {

        if (lowerBound == upperBound) {
            return;
        }
        else {
            int mid = (lowerBound + upperBound)/2;

            recMergeSort(workSpace, lowerBound, mid);

            recMergeSort(workSpace, mid+1, upperBound);

            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {

        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound)
            if (array[lowPtr] < array[highPtr])
                workSpace[j++] = array[lowPtr++];
            else
                workSpace[j++] = array[highPtr++];

        while (lowPtr <= mid)
            workSpace[j++] = array[lowPtr++];

        while (highPtr <= upperBound)
            workSpace[j++] = array[highPtr++];

        for (j=0; j<n; j++) {

            array[lowerBound+j] = workSpace[j];
        }
    }
}
