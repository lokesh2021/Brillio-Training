package OneDArray;

import java.io.ObjectStreamException;
import java.util.Arrays;

public class OneDArray {
    int n;
    int[] arr;

    public OneDArray() {
        this.n = 10;
    }
    public OneDArray(int n) {
        this.n = n;
    }


    public void readData() {
        System.out.printf("Enter " + n + " elements: ");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Input.scanner();
        }
    }

    public void displayHorizontal() {
        System.out.printf("Horizontal Display of Elements in the Array are : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public void displayVertical() {
        System.out.printf("Vertical Display of Elements in the Array are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public void sort() {
        Arrays.sort(arr);
        System.out.println("After Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public void find(int x) {
        int ele = Arrays.binarySearch(arr, x);
        System.out.println("Element is found at :"+ele);
    }
}
