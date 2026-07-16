import java.util.Scanner;
import java.util.Arrays;
public class contact_arrays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[3];
    int[] ans=new int[2 * arr.length];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      ans[i]=arr[i];
      ans[i+arr.length]=arr[i];
    }
    System.out.println(Arrays.toString(ans));
    }
  }
    
