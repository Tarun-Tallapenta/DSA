import java.util.Scanner;
import java.util.Arrays;
public class twoD_col_sum{
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
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i][j];
      }
       System.out.print(sum + " ");
    }

  }
}
