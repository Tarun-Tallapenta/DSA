import java.util.Scanner;
import java.util.Arrays;
public class reverse_array{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    int[] rev=new int[5];
    System.out.println("enter the arry elements");
    int j=0;
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
System.out.println("the array is");
System.out.println(Arrays.toString(arr));
    System.out.println("reverse of array is");
    for(int i=arr.length-1;i>=0;i--){
        rev[j]=arr[i];
        j++;
    }
System.out.println(Arrays.toString(rev));  

  }
}
