import java.util.Scanner;
import java.util.Arrays;
public class print_all_subarrays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[3];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
 for(int i=0;i<arr.length;i++){
  for(int j=i;j<arr.length;j++){
    for(int k=i;k<=j;k++){
      System.out.println(arr[k] + "");
      }
     System.out.println();
    }
  }
 }
}
 
