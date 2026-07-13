import java.util.Scanner;
import java.util.Arrays;
public class consecutive_ones{
  public static void main(String args[]){
    int[] arr=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elemnts");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
 int count=0;
 int max=0;
 for(int i=0;i<arr.length;i++){
  if(arr[i]==1){
    count++;
  }
    if(count>max){
      max=count;
    }
 }
 System.out.println("consecutive ones is" + max);
 }
}
