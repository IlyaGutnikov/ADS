import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] array = new int[10];
        int[] sortedArray = new int[10];
        Random random = new Random();

        System.out.println("Non-sorted");
        for (int i=0; i<array.length; i++) {

            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        sortedArray = selectionSorting(array);

        System.out.println("");
        System.out.println("Sorted");
        for (int i=0; i<sortedArray.length; i++) {

            System.out.print(sortedArray[i] + " ");
        }
    }

    /**
     * Метод для сортировки выбором
     * @param array несортированный массив
     * @return сортированный массив
     */
    public static int[] selectionSorting(int[] array) {

        /*
        * Внешний цикл (out)  перебирает начиная с начала массива.
        * Внутренний цикл (in) начинает с out и также дивгается вправо.
        * В каждой новой позиции сравниваются array[in] и array[min],
        * и находится новый минимальный элемент. В конце каждой итерации внутреннего
        * цикла находится новый минимальный элемент, который переставляется с текущим out.
        *
        * */

        int in, out, min;

        //внешний цикл
        for (out = 0; out < array.length-1; out++) {
            min = out; //минимум

            //внутренний цикл
            for (in = out + 1; in < array.length; in++) {

                if (array[in] < array[min]) {
                    //найден новый минимум
                    min = in;
                }

            }
            int temp = array[out];
            array[out] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
