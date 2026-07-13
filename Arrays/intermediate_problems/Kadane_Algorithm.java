import java.util.Scanner;
import java.util.Arrays;
public class Kadane_Algorithm{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the arry elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int current_sum=0;
    int max_sum=arr[0];
    for(int i=0;i<arr.length;i++){
      current_sum+=arr[i];
      if(current_sum>max_sum){
        max_sum=current_sum;
      }
      else if(current_sum<0){
        current_sum=0;
      }
    }
  System.out.println("final output is" + max_sum);
  }
}
