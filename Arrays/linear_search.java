import java.util.Scanner;
import java.util.Arrays;
public class linear_search{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("enter the array elements");
    boolean found=false;
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
  System.out.println("enter the target element");
  int target=sc.nextInt();
  for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
      found=true;
      break;
    }
  }
System.out.println("the elements if this arry is" + Arrays.toString(arr));
if(found){
  System.out.println("item found the element is" + target);
}
else{
   System.out.println("item not found the target element is");
}
  }
}
    
