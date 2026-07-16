import java.util.Scanner;
import java.util.Arrays;
public class build_permutation{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    int[] ans=new int[5];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      ans[i]=arr[arr[i]];
    }
    System.out.println(Arrays.toString(ans));
    }
  }
    
