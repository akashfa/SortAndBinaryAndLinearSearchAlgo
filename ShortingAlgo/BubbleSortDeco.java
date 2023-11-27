public class BubbleSortDeco {
    public static void descendingOrder(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 2, 5, 6 };
        descendingOrder(arr);
        displayArray(arr);
    }
}