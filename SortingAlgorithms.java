// Import Scanner class for taking user input
import java.util.Scanner;

// Main class
public class SortingAlgorithms {

    // Main method (Program execution starts here)
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();   // Store size of array

        // Declare array
        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter " + n + " elements:");

        // Loop to read elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // Store each element
        }

        // Display menu
        System.out.println("\nChoose Sorting Method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");

        // Read user choice
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Switch case for sorting choice
        switch (choice) {

            case 1:
                bubbleSort(arr, n);   // Call Bubble Sort
                System.out.println("Sorted using Bubble Sort:");
                break;

            case 2:
                selectionSort(arr, n);   // Call Selection Sort
                System.out.println("Sorted using Selection Sort:");
                break;

            case 3:
                insertionSort(arr, n);   // Call Insertion Sort
                System.out.println("Sorted using Insertion Sort:");
                break;

            default:
                System.out.println("Invalid Choice!");
                sc.close();   // Close Scanner
                return;   // Stop program
        }

        // Display sorted array
        displayArray(arr, n);

        // Close Scanner
        sc.close();
    }

    // Method for Bubble Sort
    static void bubbleSort(int arr[], int n) {

        // Loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // If current element is greater than next
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method for Selection Sort
    static void selectionSort(int arr[], int n) {

        // Loop through all elements
        for (int i = 0; i < n - 1; i++) {

            // Assume first element is minimum
            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < n; j++) {

                // Compare elements
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;   // Update minimum index
                }
            }

            // Swap minimum with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method for Insertion Sort
    static void insertionSort(int arr[], int n) {

        // Loop through array starting from second element
        for (int i = 1; i < n; i++) {

            // Store current element
            int key = arr[i];

            // Previous index
            int j = i - 1;

            // Shift elements to right
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];   // Move element
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    // Method to display array
    static void displayArray(int arr[], int n) {

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();   // New line
    }
}
