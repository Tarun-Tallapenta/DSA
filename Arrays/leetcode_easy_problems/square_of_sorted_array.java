import java.util.Scanner;
import java.util.Arrays;
public class square_of_sorted_array{
  public static void main(String args[]){
    int[] arr=new int[5];
    int[] ans=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elemnts");
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  for(int i=0;i<arr.length;i++){
    ans[i]=arr[i]*arr[i];
  }
  System.out.println(Arrays.toString(ans));
  }
}
