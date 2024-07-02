public class Question5 {
    public static void main(String[] args) {
        System.out.println("Starting...");
        int array[][] = { { 1, 2, 3, 4, 5 },
                { 3, 4, 5, 6, 7 },
                { 7, 6, 5, 4, 3 },
                { 8, 7, 6, 5, 4 },
                { 1, 2, 37, 8, 0 } };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == array.length / 2) {
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println("*************************");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == array.length / 2) {
                    System.out.println(array[i][j]);
                }
            }
        }

    }
}
