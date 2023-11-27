public class InsertionShort {
    public static void insertionShort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void displayArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, 4, 2, 4 }; // 10, 40, 30, 20, 50
        insertionShort(arr);
        displayArray(arr);
    }
}
