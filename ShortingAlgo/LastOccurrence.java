
public class LastOccurrence {
    public static int lastOccurrence(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6 };
        int index = lastOccurrence(arr, 4);
        System.out.println("Last Occurrence: " + index);
    }
}
