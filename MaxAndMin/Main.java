import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = promptUser();
        String result = minMax(nums);
        System.out.println("Min and Max values: " + result);
    }

    public static int[] promptUser() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        return numbers;
    }

    public static String minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return "Min: " + min + ", Max: " + max;
    }

}
