public class Main {

    public static void main(String[] args) {

        int maxSize = 100;

        DArray array = new DArray(maxSize);

        array.insert(64);
        array.insert(21);
        array.insert(12);
        array.insert(70);
        array.insert(3);
        array.insert(44);
        array.insert(17);
        array.insert(29);

        array.display();

        array.mergeSort();

        array.display();
    }
}
