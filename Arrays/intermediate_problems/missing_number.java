import java.util.Scanner;
import java.util.Arrays;
public class missing_number{
  public static void main(String args[]){
    int[] arr=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elemnts");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int sum_array=0;
    int total_array=0;
    for(int i=0;i<arr.length;i++){
      sum_array=sum_array+arr[i];
    }
    for(int i = 1; i <= arr.length + 1; i++){
    total_array = total_array + i;
}
    System.out.println(total_array-sum_array);
    
    }
  }
