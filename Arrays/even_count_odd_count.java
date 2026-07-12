import java.util.Scanner;
import java.util.Arrays;
public class even_count_odd_count{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int even_count=0;
    int odd_count=0;
for(int i=0;i<arr.length;i++){
  if(arr[i]%2==0){
    even_count=even_count+1;
  }
  else{
    odd_count=odd_count+1;
      }
    }
 System.out.println("even_count" + even_count);
 System.out.println("odd_count" + odd_count);
  } 
}
