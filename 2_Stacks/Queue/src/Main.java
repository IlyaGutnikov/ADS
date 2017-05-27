import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Queue queue = new Queue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());



    }
}
