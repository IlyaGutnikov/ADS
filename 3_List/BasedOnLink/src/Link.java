/**
 * Created by IlyaGutnikov on 28.05.2017.
 */
public class Link {

    public  int key;
    public double data;
    public Link next;

    public Link(int _key, double _data) {

        this.key = _key;
        this.data = _data;
    }

    @Override
    public String toString() {

        return "{" + key + ", " + data + "} ";
    }
}
