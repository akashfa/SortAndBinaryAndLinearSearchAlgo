public class CountOne {
    public static int coutnNumberOne(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == 1) {
                count = arr.length - mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
        System.out.println("Count of One: " + coutnNumberOne(arr));
    }
}