import java.util.Scanner;

public class numbers_with_even_digits {
    public static void main(String args[]) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int even_count = 0;

        for (int i = 0; i < arr.length; i++) {
            int digit_count = 0;
            int temp = arr[i];

            while (temp > 0) {
                digit_count++;
                temp = temp / 10;
            }

            if (digit_count % 2 == 0) {
                even_count++;
            }
        }

        System.out.println(even_count);
    }
}
