public class Question1 {
    public static void main(String[] args) {
        System.out.println("Starting...");
        // Creating an array here...

        int array[][] = { { 1, 2, -3, 4 },
                { 0, 0, -4, 2 },
                { 1, -1, 2, 3 },
                { -4, -5, -7, 0 } };

        int ZeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        int positiveNumberCount = 0;
        int negativeNumberCound = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0) {
                    ZeroCount++;
                }
                if (array[i][j] % 2 == 0) {
                    evenCount++;
                }
                if (array[i][j] % 2 != 0) {
                    oddCount++;
                }
                if (array[i][j] > 0) {
                    positiveNumberCount++;
                }
                if (array[i][j] < 0) {
                    negativeNumberCound++;
                }

            }

        }
        System.out.println("Number of Posive number is :- " + positiveNumberCount);
        System.out.println("Number of Negative number is " + negativeNumberCound);
        System.out.println("Number of Odd number is :-" + oddCount);
        System.out.println("Number of Even Number is :- " + evenCount);
        System.out.println("Number of zero is :- " + ZeroCount);

    }
}
