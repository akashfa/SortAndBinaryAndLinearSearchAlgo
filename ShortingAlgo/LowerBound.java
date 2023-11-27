public class LowerBound {
    public static int lowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int lowerInd = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                lowerInd = mid;
                high = mid - 1;

            } else if (arr[mid] > target) {

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lowerInd;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6 };
        System.out.println("Frist Occurrence: " + lowerBound(arr, 4));
    }
}
