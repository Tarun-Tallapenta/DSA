import java.util.Scanner;
import java.util.Arrays;
public class right_rot_by_k_step{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
  System.out.println("enter the how many steps rotate");
  int k=sc.nextInt();
  for(int j=0;j<k;j++){
    int temp=arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=temp;
  }
  System.out.println(Arrays.toString(arr));
}
}
