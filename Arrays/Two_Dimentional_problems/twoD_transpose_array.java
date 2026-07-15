import java.util.Scanner;
import java.util.Arrays;
public class twoD_transpose_array{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[3][3];
    int[][] transpose=new int[3][3];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("transpose of a two dimensional array is");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
       transpose[j][i]=arr[i][j];
      }
    }
     for(int i=0;i<transpose.length;i++){
      for(int j=0;j<transpose[i].length;j++){
        System.out.print(transpose[i][j] + " ");
      }
  System.out.println();
    }
  }
}
