import java.util.Scanner;
import java.util.Arrays;
public class first_occurence{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the arry elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    boolean found=false;
    System.out.println("enter the target element");
    int target=sc.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]==target){
        System.out.println("index of first occurence is" + i);
        found=true;
        break;
      }
    }

    }
  }
