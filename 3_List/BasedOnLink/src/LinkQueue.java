import java.util.Random;

/**
 * Created by ilyagutnikov on 30.05.17.
 */
public class LinkQueue {

    private FirstLastLink firstLastLink;

    public LinkQueue() {

        firstLastLink = new FirstLastLink();
    }

    public void insert(double _data) {

        Random random = new Random();

        firstLastLink.insertLast(random.nextInt(20), _data);
    }

    public double delete() {

        return firstLastLink.deleteFirst().data;
    }

    @Override
    public String toString() {

        return firstLastLink.toString();
    }
}
