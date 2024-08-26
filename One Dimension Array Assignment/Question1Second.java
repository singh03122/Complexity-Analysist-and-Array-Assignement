public class Question1Second {
    public static void main(String[] args) {
        System.out.println("Starting codding...");
        // creating array here...
        int array[] = { 4, 3, 6, 7 };
        int targeted_output = 11;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                while (array[i] + array[j] == targeted_output) {
                    System.out.println(array[i] + "," + array[j]);
                    break;

                }
            }
        }
    }
}
