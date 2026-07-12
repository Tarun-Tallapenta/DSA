import java.util.Scanner;
import java.util.Arrays;
public class sum_of_elements{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
      arr[i]=sum+arr[i];
      sum=arr[i];
    }
    System.out.println("sum of the elements of this array is " + sum);
  
    
  }
  
}
