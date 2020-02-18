package DataStructure;

import java.util.Arrays;

public class MergeSort {

/*    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int len = array.length;

        int left[] = Arrays.copyOfRange(array, 0, len/2);
        int right[] = Arrays.copyOfRange(array, len/2, len);

        left = mergeSort(left);
        right = mergeSort(right);

        int[] result = new int[array.length];
        result = merge(left, right);
        return result;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println("Initial Array: ");
        printArray(array);

        array = mergeSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
    }*/


    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int len = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, len);
        int[] rightArray = Arrays.copyOfRange(array, len, array.length);
        int[] result = new int[array.length];
        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        result = merge(leftArray, rightArray);
        return result;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (resultPointer < result.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) { // rightPointer has exceeded array
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) { //leftPointer has exceeded array
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 6, 3, 6, 3, 8, 3, 10, 26};
        printArray(a);
        a = mergeSort(a);
        printArray(a);
    }
}
