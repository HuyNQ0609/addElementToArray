import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0};
        int x, index;
        System.out.println("Index: ");
        index = scanner.nextInt();
        System.out.println("Enter the number to add to the array: ");
        x = scanner.nextInt();
        if (index >= array.length - 1) {
            System.out.println("Error Array!");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (index == i) {
                    for (int j = array.length - 1; j >= index; j--) {
                        array[j] = array[j - 1];
                    }
                    array[i] = x;
                }
            }
            System.out.println("New array is: " + Arrays.toString(array));
        }
    }
}