/**
 * Created by IlyaGutnikov on 27.05.2017.
 */
public class PriorityQueue {

    private int maxSize;
    private long[] queArray;
    private int numOfItems;

    public PriorityQueue(int _size) {

        maxSize = _size;
        queArray = new long[maxSize];
        numOfItems = 0;
    }

    public void insert(long item) {

        int j = 0;
        if (numOfItems == 0) {
            queArray[numOfItems++] = item;
        } else {

            for (j = numOfItems-1; j>=0; j--) {

                if (item > queArray[j]) {
                    queArray[j+1] = queArray[j];
                } else {

                    break;
                }

                queArray[j+1] = item;
                numOfItems++;
            }
        }

    }

    public long peekMin() {

        return queArray[numOfItems--];
    }

    public boolean isEmpty() {

        return (numOfItems == 0);
    }

    public boolean isFull() {

        return (numOfItems == maxSize);
    }

    public long remove() {

        return queArray[--numOfItems];
    }
}
