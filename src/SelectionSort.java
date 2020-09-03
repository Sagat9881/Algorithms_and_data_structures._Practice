public class SelectionSort {

//    Сортировка выбором

    public static void swapElements(int[] array, int i, int j) {
// Метод, меняющий местами элементы с индексами "i" и "j", в указаном массиве "array".
        int buffer = array[i];
        array[i] = array[j];
        array[j] = buffer;
    }

    public static int lowestIndex(int[] array) {

//        Метод, поочередно сравнивающий все элементы массива, после чего возвращает индекс наименьшего его (массива) элемента
        int lowestIndex = 0;

        for (int i : array) {
            if (array[i] < array[lowestIndex]) lowestIndex = i;
        }
        return lowestIndex;
    }

    public static int lowestIndex(int[] array, int start) {
//    Перегруженная версия метода выше. Метод поочередно сравнивает все элементы массива, начиная с элемента с индексом "start".
//    После чего возвращает индекс наименьшего элемента в интервале от start до конца массива

        int lowestIndex = start;

        for (int i : array) {
            if (array[i] < array[lowestIndex]) lowestIndex = i;
        }
        return lowestIndex;
    }

    public static void selectionSort (int [] array){
//        Алгоритм сортировки выбором
//        Метод находит индекс наименьшего значения в массиве (при первой итерации i = 0, т.к. сначала проходит весь массив)
//        После, он помещает ЗНАЧЕНИЕ в ячейку массива с индексом "i" (В перой итерации это 1-ая ячейка в массиве), после чего
//        Этот (наименьший по значению) элемент исключается из интервала поиска индекса наименьшего значения, т.к. i - инкрементное в цикле
//        Повторяя поиск, пока не пройдет весь массив.
//        Если n - количество элементов в массиве, то общее количество сравнений = (n(n+1))/2, что значит selectionSort = O(n^2)

        for (int i: array) {
            int j = lowestIndex(array, i);
            swapElements(array, i, j);
       }
    }


}
