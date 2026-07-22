import java.util.Scanner;
import java.util.Arrays;
public class array_ladders{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[6];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
  for(int i=0;i<arr.length;i++){
    boolean leader=true;
    for(int j=i+1;j<arr.length;j++){
      if(arr[j]>arr[i]){
        leader=false;
        break;
      }
    }
    if(leader){
      System.out.println(arr[i] + "");
    }
  }
}
}
