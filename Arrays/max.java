import java.util.Scanner;
import java.util.Arrays;
public class max{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
      
     int largest=arr[0];
    for(int i=0;i<arr.length;i++){
      if(largest<arr[i]){
        largest=arr[i];
      }
        }
System.out.println("Largest number of this array is" + largest);
System.out.println("Smallest number of this array is" + arr[0] );

  
  }

}
