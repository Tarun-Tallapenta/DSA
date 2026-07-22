import java.util.Scanner;

public class arrays_equal_not{
    public static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Enter first array:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        if (areEqual(arr1, arr2)) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are Not Equal");
        }
    }
}
