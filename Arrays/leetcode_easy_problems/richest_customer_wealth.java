import java.util.Scanner;
import java.util.Arrays;
public class richest_customer_wealth{
  public static void main(String args[]){
    int[][] arr=new int[3][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elemnts");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int max_sum=0;
    for(int i=0;i<arr.length;i++){
      int sum=0; 
      for(int j=0;j<arr[i].length;j++){
        sum+=arr[i][j];
      }
      if(sum>max_sum){
        max_sum=sum;
      }
    }
    System.out.println("richest customer wealth is:" + max_sum);
    }
  }
  
