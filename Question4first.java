public class Question4first {

    public static void main(String[] args) {
        System.out.println("Starting...");

        int array[] = { 34, 21, 54, 65, 43 };

        if (array.length < 2) {
            System.out.println("Array doesn't have enough elements");
            return;
        }

        int firstMax =array[0];
        int secondMax = array[0];

        for (int num : array) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is: " + secondMax);
        }
    }
}
