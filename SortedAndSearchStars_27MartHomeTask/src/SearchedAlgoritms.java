public class SearchedAlgoritms {
    public static void main(String[] args) {
        int[] array = {3, 7, 10, 15, 17, 20, 25};

        System.out.println(getBinarySearch(array,10));

        System.out.println("Searched element index = " + getLinearSearch(array,1));

    }

    public static boolean getBinarySearch(int [] array,int searchedNumber) {
        int minIndex = 0;
        int maxIndex = array.length - 1;

        while (maxIndex >= minIndex) {
            int medium = (minIndex + maxIndex) / 2;
            if (array[medium] == searchedNumber) {
                return true;
            }
            if (array[medium] < searchedNumber) {
                minIndex = medium + 1;
            }
            if (array[medium] > searchedNumber) {
                maxIndex = medium - 1;
            }
        }
        return false;
    }

    public static int getLinearSearch(int array[], int searchedNumber)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchedNumber)
                return i;
        }
        return -1;
    }


}
