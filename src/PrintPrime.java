
import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number = 2;
        while (number < n) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
            if (flag){
                System.out.println(number);
            }
            number++;
        }

    }
}
