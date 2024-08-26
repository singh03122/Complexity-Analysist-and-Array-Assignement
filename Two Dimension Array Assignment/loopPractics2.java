public class loopPractics2 {
    public static void main(String[] args) {
        System.out.println("Starting ...");
        int n = 13;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2
                        || i == (n - 1) / 4 && j > (n - 1) / 4 && j < (n - 1) / 2 + 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
