public class Question3 {
    public static void main(String[] args) {
        System.out.println("Staring...");
        int array[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j == array.length - 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.println();
                }
            }
        }
    }
}
