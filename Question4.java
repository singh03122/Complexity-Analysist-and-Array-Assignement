public class Question4 {
    public static void main(String[] args) {
        System.out.println("Starting...");

        int array[][] = {
                { 1, 2, 4, 0 },
                { 2, 5, 7, -1 },
                { 4, 2, 6, 9 }
        };

        int largerElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > largerElement) {
                    largerElement = array[i][j];
                }
            }
        }
        System.out.println("Larger element is :- " + largerElement);

    }
}
