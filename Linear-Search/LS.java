// Linear Search is useful to search for a target in an unsorted array.
// It is a basic searching algorithm.

// Question: Find whether an element exists in an array or not?



// The worst case time complexity is O(n), goes through every element in the array.
// The best case complexity is : O(1), constant time if the element is found at the first pos.


//Arrays.toString() in Java serves the purpose of converting an array into a string representation.
// When an array is directly printed or converted to a string using the default toString() method, it outputs a non-human-readable representation that includes the array's type and hash code. Arrays.toString() provides a clear, readable output of the array's elements, enclosed in square brackets and separated by commas.


public class LS {
    public static void main(String[] args) {

        int[] arr = {13, 12, 14, 20, 19, 18, 16, 22};
        int target = 20;

        // Returns the index of the target in the array
        int ans = LS(arr, target);
        System.out.println("LS returns the index: " + ans);

        // Returns the target element if it exists in the array
        int ansElement = LinSr(arr, target);
        System.out.println("LinSr returns the element: " + ansElement);
    }

    // Search the target and return the element (if it exists) instead of the index.
    static int LinSr(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Iterate over each element in the array using the enhanced for-loop.
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return -1;
    }

    // Search the target and return its index if found.
    static int LS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Iterate through the array using a traditional for-loop.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
