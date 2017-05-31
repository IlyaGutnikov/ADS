public class Main {

    public static void main(String[] args) {

        SortedList sortedList = new SortedList();

        sortedList.insert(20);
        sortedList.insert(50);

        System.out.println(sortedList.toString());

        sortedList.insert(10);
        sortedList.insert(80);

        System.out.println(sortedList.toString());

    }
}
