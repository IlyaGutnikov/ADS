/**
 * Created by ilyagutnikov on 31.05.17.
 */
public class DoublyLinkedList {

    private DoubleLink first;
    private DoubleLink last;

    public DoublyLinkedList() {

        first = null;
        last = null;

    }

    public boolean isEmpty() {

        return (first == null);
    }

    public void insertFirst(long key) {

        DoubleLink newLink = new DoubleLink(key);

        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }

        newLink.next = first;
        first = newLink;
    }

    public void inserLast(long key) {

        DoubleLink newLink = new DoubleLink(key);

        if (isEmpty()) {

            first = newLink;
        } else {

            last.next = newLink;
            newLink.previous = last;
        }

        last = newLink;
    }

    public boolean insertAfter(long key, long data) {

        DoubleLink curent = first;
        while (curent.data != key) {

            curent = curent.next;

            if (curent == null) {
                return false;
            }
        }

        DoubleLink newLink = new DoubleLink(data);
        if (curent == last) {

            newLink.next = null;
            last = newLink;
        } else {

            newLink.next = curent.next;
            curent.next.previous = newLink;
        }

        newLink.previous = curent;
        curent.next = newLink;
        return true;
    }

    public DoubleLink deleteFirst() {

        DoubleLink temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }

        first = first.next;
        return temp;
    }

    public DoubleLink deleteLast() {

        DoubleLink temp = last;

        if (first.next == null) {
            last = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;
        return temp;
    }

    public DoubleLink deleteKey(long key) {

        DoubleLink current = first;
        while (current.data != key) {

            current = current.next;

            if (current == null) {
                return null;
            }
        }

        if (current == first) {

            first = current.next;
        } else {

            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {

            current.next.previous = current.previous;
        }

        return current;
    }

    @Override
    public String toString() {

        String temp = "";

        DoubleLink current = first;
        while (current != null) {

            temp += current.data + " ";
            current = current.next;
        }

        return temp;
    }
}
