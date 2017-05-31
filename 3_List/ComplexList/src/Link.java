/**
 * Created by ilyagutnikov on 31.05.17.
 */
public class Link {

    public long data;
    public Link next;

    public Link(long _data) {

        data = _data;
    }

    @Override
    public String toString() {

        return "" + data;
    }
}
