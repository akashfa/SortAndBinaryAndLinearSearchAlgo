public class LinearSearch {
    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 2, 5, 6 };
        int indx = linearSearch(arr, 5);
        if (indx != -1) {
            System.out.println("Elemant of index: " + indx);
        } else {
            System.out.println("Elemant not present in the array");
        }
    }
}
