
public class CountDuplicate {
    public static int countOccurrence(int arr[], int x) {
        int fristIndex = fristOccurrence(arr, x);
        if (fristIndex == -1) {
            return 0;
        }
        int lastIndex = lastOccurrence(arr, x);
        return lastIndex - fristIndex + 1;
    }

    public static int fristOccurrence(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;
        int fristIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                fristIndex = mid;
                right = mid - 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }

        }
        return fristIndex;
    }

    public static int lastOccurrence(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int secondIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                secondIndex = mid;
                left = mid + 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return secondIndex;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9, 9 };
        System.out.println("Number of count: " + countOccurrence(arr, 8));
    }

}
