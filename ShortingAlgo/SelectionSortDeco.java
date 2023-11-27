public class SelectionSortDeco {
    public static void descendingOrder(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
