
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array index " + i + " :");
            array[i] = input.nextInt();
            System.out.println("Array index " + i + " :");
            System.out.println(array[i]);
        }
    }
}
