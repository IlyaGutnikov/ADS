public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        StackX stackX = new StackX(10);
        //LIFO
        stackX.push(10);
        stackX.push(20);
        stackX.push(30);
        stackX.push(60);
        stackX.push(1);

        while (!stackX.isEmpty()) {

            System.out.println(stackX.pop());
        }
    }
}
