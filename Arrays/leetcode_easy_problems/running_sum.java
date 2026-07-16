import java.util.Scanner;
import java.util.Arrays;
public class running_sum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    int[] ans=new int[5];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
      ans[i]=sum;
    }
    System.out.println(Arrays.toString(ans));
  }
}
    
