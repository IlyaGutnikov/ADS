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

        ///
        FirstLastLink firstLastLink = new FirstLastLink();
        firstLastLink.insertFirst(55, 5);
        firstLastLink.insertFirst(66, 6);
        firstLastLink.insertFirst(77, 7);

        System.out.println(firstLastLink.toString());

        firstLastLink.insertLast(88,8);

        System.out.println(firstLastLink.toString());
    }
}
