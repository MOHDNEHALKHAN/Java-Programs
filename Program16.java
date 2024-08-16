//program to find the largest element in an array
public class Program16 {
    public static void main(String[] args) {
        // Example array
        int[] array = {12, 34, 54, 2, 99, 75, 23, 87};

        // Function call to find the largest element
        int largest = findLargestElement(array);

        // Output the result
        System.out.println(largest);
    }

    public static int findLargestElement(int[] array) {
        // Check if the array is empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Initialize the maximum value with the first element of the array
        int max = array[0];

        // Iterate through the array and update the max value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Return the largest element
        return max;
    }
}