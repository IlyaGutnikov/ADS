public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        LinkList linkList = new LinkList();

        linkList.insertFirst(22, 2);
        linkList.insertFirst(33, 3);
        linkList.insertFirst(44, 4);

        System.out.println(linkList.toString());

        linkList.delete(22);

        System.out.println(linkList.toString());
    }
}
