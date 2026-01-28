import java.util.Scanner;

public class quicksort {

    public int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }

    public void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int part = partition(arr, start, end);
            quicksort(arr, start, part - 1);
            quicksort(arr, part + 1, end);
        }
    }

    public static void main(String[] args) {
        quicksort qs = new quicksort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        qs.quicksort(arr, 0, n- 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
