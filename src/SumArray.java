public class SumArray {
    public static void main(String[] args) {
        int[] array = {2, 65, 88, 41, 2, 1, 5, 4, 10, 15};
        int sum = 0;
        int max = array[0];
        for (int value : array) {
            sum += value;
            if (max < value) {
                max = value;
            }
        }
        System.out.println("Sum array: " + sum);
        System.out.println("Max array: " + max);
    }
}
