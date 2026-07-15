import java.util.Scanner;
import java.util.Arrays;
public class twoD_colwise_array{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[3][3];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("column wise two dimensional array");
    for(int j=0;j<arr[0].length;j++){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i][j] + " ");
      }
  System.out.println();
    }
    
  }
}
