public class Question2second {
    public static void main(String[] args) {
        System.out.println("Starting...");
        // Creating an array here...

        int array[] = { 34, 21, 54, 65, 43 };
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println("Even number is :- " + i);
            }
        }
    }
}
