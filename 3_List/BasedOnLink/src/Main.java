public class Main {

    public static void main(String[] args) {

        //LIFO
        LinkStack linkStack = new LinkStack();

        linkStack.push(20);
        linkStack.push(10);

        System.out.println(linkStack.toString());

        linkStack.pop();

        System.out.println(linkStack.toString());

        //FIFO
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(20);
        linkQueue.insert(30);
        linkQueue.insert(10);

        System.out.println(linkQueue.toString());

        linkQueue.delete();

        System.out.println(linkQueue.toString());
    }
}
