import java.util.Scanner;
import java.util.Arrays;
public class twoD_array_printing{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[3][3];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("row wise two dimensional array");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] + " ");
      }
  System.out.println();
    }
    
  }
}
