import java.util.Random;

/**
 * Created by ilyagutnikov on 30.05.17.
 */
public class LinkStack {

    private LinkList list;

    public LinkStack() {

        list = new LinkList();
    }

    public void push(double _data) {

        Random random = new Random();

        list.insertFirst(random.nextInt(20), _data);
    }

    public double pop() {

        Link temp = list.deleteFirst();

        return temp.data;
    }

    public boolean isEmpty() {

        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
