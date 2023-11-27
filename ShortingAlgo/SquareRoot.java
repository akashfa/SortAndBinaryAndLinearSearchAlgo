public class SquareRoot {
    public static int squareRoot(int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int square = mid * mid;
            if (square == n) {
                return mid;
            } else if (square > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int square = squareRoot(16);
        if (square != -1) {
            System.out.println("True");
        } else

        {
            System.out.println("False");
        }
    }
}
