public class Question3first {
    public static void main(String[] args) {
        System.out.println("Starting");

        // creating an array
        int array[] = { 34, 21, 54, 65, 43 };
        int max = array[0];

        // Iterating the elements :-
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The Greater is " + max);
    }
}
