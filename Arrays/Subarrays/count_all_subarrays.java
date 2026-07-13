import java.util.Scanner;
import java.util.Arrays;
public class count_all_subarrays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[3];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int count=0;
 for(int i=0;i<arr.length;i++){
  for(int j=i;j<arr.length;j++){
    count++;
      }
    }
 System.out.println("Total sub arrays are" + count);
  }
}
 
