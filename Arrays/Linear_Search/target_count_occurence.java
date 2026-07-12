import java.util.Scanner;
import java.util.Arrays;
public class target_count_occurence{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the arry elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("enter the target element");
    int target=sc.nextInt();
    boolean found=false;
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==target){
        found=true;
        count++;
      }
    }
  System.out.println("target is appears"  +  count  + "times");
  }
}
