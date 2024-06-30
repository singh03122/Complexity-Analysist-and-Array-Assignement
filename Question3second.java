public class Question3second {
    public static void main(String[] args) {
        System.out.println("Staring...");

        // creating an array here
        int array[] = { 4, 3, 6, 7, 1 };
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The greater is :- " + max);
    }
}
