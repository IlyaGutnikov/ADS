public class Main {

    public static void main(String[] args) {

        LinkStack linkStack = new LinkStack();

        linkStack.push(20);
        linkStack.push(10);

        System.out.println(linkStack.toString());

        linkStack.pop();

        System.out.println(linkStack.toString());
    }
}
