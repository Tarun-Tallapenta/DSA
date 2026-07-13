import java.util.Scanner;
import java.util.Arrays;
public class buy_sell{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[6];
    System.out.println("enter the arry elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
  int first_price=arr[0];
  int maximum_profit=0;
    for(int i=1;i<arr.length;i++){
      if(arr[i]<first_price){
        first_price=arr[i];
      }
      int profit=arr[i]-first_price;
      if(profit>maximum_profit){
        maximum_profit=profit;
      }
      }
    System.out.println(maximum_profit);
    }
  }
  

     
