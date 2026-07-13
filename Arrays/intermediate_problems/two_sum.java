import java.util.Scanner;
import java.util.Arrays;
public class two_sum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    int[] rev=new int[5];
    System.out.println("enter the arry elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("enter the target element");
    int target=sc.nextInt();
    boolean found=false;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==target){
          System.out.println("indices are" + i + "," + j);
          found=true;
          break;
        }
      }
    }
  }
}
