/**
 * Created by IlyaGutnikov on 28.05.2017.
 */
public class LinkList {

    private Link first;

    public LinkList() {

        first = null;
    }

    public boolean isEmpty() {

        return (first == null);
    }

    public void insertFirst(int _key, double _data) {

        Link newLink = new Link(_key, _data);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {

        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int _key) {

        if (this.isEmpty()) {
            return null;
        }

        Link current = first;
        while (current.key != _key) {

            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }

        return current;
    }

    public Link delete(int _key) {

        Link current = first;
        Link previous = first;

        while (current.key != _key) {

            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }

        return current;
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
