import java.util.Scanner;
import java.util.Arrays;
public class print_array{
  public static void main(String args[]){
    int[] arr=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elemnts");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    }
  }
