public class BubbleSort {
    static boolean sorted = false;
    int buffer;

    public static void bubbleSort(int[] array) {
        while (!sorted) {
            sorted = true;
            for (int i : array) {
                if (array[i] > array[i + 1]) {
                    SelectionSort.swapElements(array, array[i], array[i + 1]);
                    sorted = false;
                }

            }
        }

    }
}
