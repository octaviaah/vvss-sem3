import java.util.Random;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, low);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivotIndex = choosePivot(low, high);
        int pivotValue = arr[pivotIndex];
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivotValue) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;


    }

    private static int choosePivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
