public class SortedAlgoritms {
    public static void main(String[] args) {
        int[] array = {25, 17, 10, 9, 17, 8, 3};

        printArray(getSelectionSort(array));
        printArray(getBubbleSort(array));
    }

    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static int[] getSelectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int[] getBubbleSort(int [] array){
        int n= array.length;
        boolean isSorted = false;
        for (int i = 1; i < n; i++) {
            if (array[i - 1] > array[i]) {
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                isSorted = true;
            }
        }
        return array;
    }
}
