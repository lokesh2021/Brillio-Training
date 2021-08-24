package OneDArray;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-D Array operations");
        System.out.println("Do you want to Enter Size of array? y/n");
        String str = sc.nextLine();
        int n;
        OneDArray oneDArray;
        if (str.equalsIgnoreCase("y")) {
            //Input Array Size
            System.out.println("Enter Size of Array");
            n = Input.scanner();
            oneDArray = new OneDArray(n);

        } else {
            oneDArray = new OneDArray();
        }
        oneDArray.readData();
        oneDArray.displayHorizontal();
        oneDArray.displayVertical();
        oneDArray.sort();
        System.out.println("Enter the Element to find: ");
        int x = Input.scanner();
        oneDArray.find(x);
    }
}
