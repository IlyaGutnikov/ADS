/**
 * Created by ilyagutnikov on 31.05.17.
 */
public class SortedList {

    private Link first;

    public SortedList() {

        first = null;
    }

    public boolean isEmpty() {

        return (first == null);
    }

    public void insert(long key) {

        Link newLink = new Link(key);

        Link previous = null;
        Link current = first;

        while(current != null && key > current.data) {

            previous = current;
            current = current.next;

        }

        if (previous == null) {

            first = newLink;
        } else {

            previous.next = newLink;
        }

        newLink.next = current;

    }

    public Link remove() {

        if (isEmpty()) {

            return null;
        }

        Link temp = first;
        first = first.next;
        return temp;
    }

    @Override
    public String toString() {

        String temp = "";
        Link current = first;
        while (current != null) {

            temp += current.toString() + " ";
            current = current.next;
        }

        return temp;
    }
}
