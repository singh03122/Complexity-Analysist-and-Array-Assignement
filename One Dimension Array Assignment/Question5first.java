import java.util.Arrays;

public class Question5first {
    public static void main(String[] args) {
        System.out.println("Starting...");
        int array[] = { 1, 3, 2, 6, 5 };
        Arrays.sort(array);

        // calling meathod
        int result = findPeakElement(array);
        if (result != -1) {
            System.out.println("Peekest Element Value is :-" + array[result]);
        } else {
            System.out.println("No Peek Element is Found ");
        }
    }

    public static int findPeakElement(int array[]) {
        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || array[mid] >= array[mid - 1])
                    && (mid == array.length - 1 || array[mid] >= array[mid + 1])) {
                return mid;
            }

            // If the left neighbor is greater, move the search to the left half
            if (mid > 0 && array[mid - 1] > array[mid]) {
                high = mid - 1;
            } else { // Otherwise, move the search to the right half
                low = mid + 1;
            }
        }

        return -1; // This line should never be reached for valid input arrays
    }
}
