import java.util.Scanner;
import java.util.Arrays;
public class last_occurence{
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
    for(int i=arr.length-1;i>=0;i--){
      if(arr[i]==target){
        found=true;
        System.out.println("index of last occurence of target element is" + i);
        break;
      }
    }
  }
}
