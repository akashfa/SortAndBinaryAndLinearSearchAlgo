public class Square {
    public static int square(int n, int m) {
        int squ = 1;
        for (int i = 1; i <= m; i++) {
            squ *= n;

        }
        return squ;
    }

    public static void main(String[] args) {
        System.out.println(square(2, 3));
    }
}
