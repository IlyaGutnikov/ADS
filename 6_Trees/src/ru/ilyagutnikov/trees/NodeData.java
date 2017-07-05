package ru.ilyagutnikov.trees;

/**
 * Created by IlyaGutnikov on 05.07.2017.
 */
public class NodeData {

    int iData;
    double fData;

    public NodeData(int _iData, int _fData) {

        iData = _iData;
        fData = _fData;
    }

    @Override
    public String toString() {
        return "iData " + iData + ", fData " + fData;
    }
}
