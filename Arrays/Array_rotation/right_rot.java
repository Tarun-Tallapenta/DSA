import java.util.Scanner;
import java.util.Arrays;
public class right_rot{
  public static void main(String args[]){
    int[] arr=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elemnts");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int temp=arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=temp;
  System.out.println(Arrays.toString(arr));
  }
}
    
 
