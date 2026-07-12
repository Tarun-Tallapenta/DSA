import java.util.Scanner;
import java.util.Arrays;
public class smallest_number{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the array elemnts");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int smallest=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<smallest){
        smallest=arr[i];
        }
    }
    System.out.println("smallest number of this array is" + smallest);
  
  }
}
