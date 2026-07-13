import java.util.Scanner;
import java.util.Arrays;
public class maximum_sub_array{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[3];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int maxi_sum=0;
 for(int i=0;i<arr.length;i++){
  for(int j=i;j<arr.length;j++){
    int sum=0;
    for(int k=i;k<=j;k++){
      System.out.println(arr[k] + "");
      sum+=arr[k];
      }
  if(maxi_sum<sum){
    maxi_sum=sum;
        }
  System.out.println();
      }
 
    }
   System.out.println("maximum sub array is" + maxi_sum);
  }
}
