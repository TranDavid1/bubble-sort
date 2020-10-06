import java.util.Random;

public class BubbleSort
{
    // Function that implements Bubble Sort algorithm to sort array in ascending order
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        /* Iterate through the array such that the algorithm can compare adjacent elements
        and pass through as many times needed to sort the entire array. */
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j] (adjacent arrays)
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }   // end bubbleSort

    // Function to print an array, 10 elements per row
    void printArray(int arr[])
    {
        int rowCount = 0;   //Iterator to keep track of when to create new row
        int n = arr.length;
        for (int i=0; i<n; ++i)
        {
            // If the current element is a multiple of 10, create a new row
            if (rowCount >= 10)
            {
                System.out.println();
                rowCount = 0;   // Reset the rowCount iterator
            }
            System.out.printf("%3d" + " ", arr[i]);     // Print out element in the array with 3 digit wide format
            rowCount++;     // Iterate rowCount
        }
        System.out.println();      // Print out empty line
    }   // end printArray

    // Function to fill out an array with random values
    public static void fillArray(int[] arr)
    {
        // Create instance of Random class
        Random rand = new Random();
        int n = arr.length;
        for (int i = 0; i < n; i++)
            arr[i] = rand.nextInt(1000);    // Randomly generate int value between 0-999
    }   // end fillArray

    // Main method
    public static void main(String args[])
    {
        // Create new object of BubbleSort
        BubbleSort ob = new BubbleSort();

        // Allocate memory for arrays
        int[] array1 = new int[10];
        int[] array2 = new int[100];
        int[] array3 = new int[1000];
        int[] array4 = new int[10000];
        int[] array5 = new int[100000];
        int[] array6 = new int[1000000];

        /* Fill the arrays with random elements with fillArray() method, print the unsorted array,
         sort the arrays with bubbleSort() method, then print the sorted arrays */
        fillArray(array1);
        System.out.println("Unsorted array of 10 elements:");
        ob.printArray(array1);
        ob.bubbleSort(array1);
        System.out.println("\nSorted array: ");
        ob.printArray(array1);
        System.out.println("\n------------------------------\n");

        fillArray(array2);
        System.out.println("Unsorted array of 100 elements:");
        ob.printArray(array2);
        ob.bubbleSort(array2);
        System.out.println("\nSorted array: ");
        ob.printArray(array2);
        System.out.println("\n-----------------------------\n");

        fillArray(array3);
        System.out.println("Unsorted array of 1000 elements:");
        ob.printArray(array3);
        ob.bubbleSort(array3);
        System.out.println("\nSorted array: ");
        ob.printArray(array3);
        System.out.println("\n-----------------------------\n");

        fillArray(array4);
        System.out.println("Unsorted array of 10000 elements:");
        ob.printArray(array4);
        ob.bubbleSort(array4);
        System.out.println("\nSorted array: ");
        ob.printArray(array4);
        System.out.println("\n-----------------------------\n");

        fillArray(array5);
        System.out.println("Unsorted array of 100000 elements:");
        ob.printArray(array5);
        ob.bubbleSort(array5);
        System.out.println("\nSorted array: ");
        ob.printArray(array5);
        System.out.println("\n-----------------------------\n");

        /*
        fillArray(array6);
        System.out.println("Unsorted array of 1000000 elements:");
        ob.printArray(array6);
        ob.bubbleSort(array6);
        System.out.println("\nSorted array: ");
        ob.printArray(array6);
        System.out.println("\n-----------------------------\n");
         */
    }
}   // end main

