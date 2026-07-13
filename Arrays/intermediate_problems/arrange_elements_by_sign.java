import java.util.Scanner;
import java.util.Arrays;
public class arrange_elements_by_sign{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[6];
    int[] arr_2=new int[6];
    System.out.println("enter the arry elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int pos_indx=0;
    int neg_indx=1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>=0){
        arr_2[pos_indx]=arr[i];
        pos_indx=pos_indx+2;
      }
      else{
        arr_2[neg_indx]=arr[i];
        neg_indx=neg_indx+2;
      }
    }
    System.out.println(Arrays.toString(arr_2));
    }
  }
