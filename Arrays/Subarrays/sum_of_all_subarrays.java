import java.util.Scanner;
import java.util.Arrays;
public class sum_of_all_subarrays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[3];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    
 for(int i=0;i<arr.length;i++){
  for(int j=i;j<arr.length;j++){
    int sum=0;
    for(int k=i;k<=j;k++){
      System.out.println(arr[k] + "");
      sum+=arr[k];
     }
     System.out.println("sum of sub arrays are" + sum);
   } 
  }
 }
}
 
