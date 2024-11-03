package projectdemo;
import java.util.*;

public class LinearSearch{
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 3, 4, 5, 7, 8, 9, 11, 23, 45, 67, 89, 91, 94, 96};

        System.out.println("Enter the element you want to search in the array: ");
        int search = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("The element found at index: " + i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Element not found");
        }
    }
}
