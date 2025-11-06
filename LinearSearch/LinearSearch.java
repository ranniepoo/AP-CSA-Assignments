import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = promptUser();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to search for: ");
        int target = input.nextInt();

        int resultIndex = linearSearch(numbers, target);

        if (resultIndex != -1) {
            System.out.println("Found " + target + " at index " + resultIndex + ".");
        } else {
            System.out.println(target + " not found in the array.");
        }
        input.close();
    }

    public static int[] promptUser() {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; //return index if found
            }
        }
        return -1; //return -1 when not found
    }
}
