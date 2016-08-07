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

        sortedArray = bubbleSorting(array);

        System.out.println("");
        System.out.println("Sorted");
        for (int i=0; i<sortedArray.length; i++) {

            System.out.print(sortedArray[i] + " ");
        }
    }

    /**
     * Метод для пузырьковой сортировки
     * @param array несортированный массив
     * @return сортированный массив
     */
    public static int[] bubbleSorting(int[] array) {

        int in, out;
        // начинаем проверять с конца массива
        // тем самым уменьшаем колисество прогонов до конца
        // самый последний элемент - максимальный
        for (out=array.length-1; out>1; out--) {

            // прозод с начала до конца
            for (in=0; in<out; in++) {

                //если первый элемент юольше второгл
                if(array[in] > array[in+1]){
                    //то поменять их местами
                    int temp = array[in];
                    array[in] = array[in+1];
                    array[in+1] = temp;
                }
            }
        }

        return array;
    }
}
