public class Question1 {

    public static void main(String[] args) {
        System.out.println("Starting Codding...");

        // creating an array here
        int array[] = { 3, 20, 4, 6, 9 };
        int targeted_output = 16;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    while (array[i] + array[j] + array[k] == targeted_output) {
                        System.out.println(array[i] + "," + array[j] + "," + array[k]);
                        break;
                    }
                }
            }
        }
    }
}