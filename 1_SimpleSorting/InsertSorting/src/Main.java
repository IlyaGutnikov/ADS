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

        sortedArray = insertSorting(array);

        System.out.println("");
        System.out.println("Sorted");
        for (int i=0; i<sortedArray.length; i++) {

            System.out.print(sortedArray[i] + " ");
        }
    }

    /**
     * Метод для сортировки вставкой
     * @param array несортированный массив
     * @return сортированный массив
     */
    public static int[] insertSorting(int[] array) {
        /*
        * Во внешнем цикле for счетчик отмечаки крайний неотсортированный элемент.
        * Во внутреннем циле while счетчик In  начинает с позиции out и двигается влево,
        * пока есть такая вохможность или пока temp не станет меньше элемента массива.
        * */
        int in, out;
        // out - Разделительный маркер
        for (out = 1; out < array.length; out++) {

            int temp = array[out]; //копирует помечанный элемент
            in = out; //начать перемещение с out
            //пока не найден меньший элемент
            while ((in > 0) && (array[in - 1] >=temp)) {

                array[in] = array[in - 1]; //сдвинуть элемент вправо
                in--; //перейти на одну позицию влево
            }

            array[in] = temp; //вставить помеченный элемент
        }

        return array;
    }
}
