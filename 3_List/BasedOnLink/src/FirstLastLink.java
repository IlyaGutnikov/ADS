/**
 * Created by IlyaGutnikov on 28.05.2017.
 */
public class FirstLastLink {

    private Link first;
    private Link last;

    public FirstLastLink() {

        first = null;
        last = null;
    }

    public boolean isEmpty() {

        return (first == null);
    }

    public void insertFirst(int _key, double _data) {

        Link newLink = new Link(_key, _data);

        if (isEmpty()) {

            last = newLink;
        }

        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int _key, double _data) {

        Link newLink = new Link(_key, _data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }

        last = newLink;
    }

    public Link deleteFirst() {

        Link temp = first;
        if (first.next == null) {

            last = null;
        }

        first = first.next;
        return temp;
    }

    @Override
    public String toString() {

        String temp = "";
        Link current = first;
        while (current != null) {

            temp+= current.toString();
            current = current.next;
        }

        return temp;
    }
}
