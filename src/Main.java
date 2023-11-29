// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create an array with values from 10 to 1
        int[] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Counter for total actions
        int totalActions = 0;

        // Iterate through the array and swap elements if needed
        for (int i = 0; i < array.length - 1; i++) {
            // Counter for for loop iteration
            int forLoopCounter = i + 1;

            for (int j = 0; j < array.length - i - 1; j++) {
                // Counter for if statement
                int ifStatementCounter = j + 1;

                if (array[j] > array[j + 1]) {
                    // Swap elements if the current element is greater than the next one
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Increment total actions counter
                    totalActions++;
                }
            }

            // Print the array after each pass through the outer loop
            System.out.println("\nArray After Pass " + forLoopCounter + ":");
            printArray(array);
        }

        // Print the array after swapping
        System.out.println("\nArray After Swapping:");
        printArray(array);

        // Print the total number of actions performed
        System.out.println("\nTotal Actions Performed: " + totalActions);
    }

    // Function to print the elements of an array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        }
    }
