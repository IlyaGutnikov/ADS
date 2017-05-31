/**
 * Created by ilyagutnikov on 31.05.17.
 */
public class DoubleLink {

    public DoubleLink previous;
    public DoubleLink next;
    public long data;

    public DoubleLink(long _data) {

        data = _data;
        previous = null;
        next = null;
    }
}
