import java.util.Scanner;
class factorial{
  public static int factorial(int n){
    int sum=1;
    for(int i=1;i<=n;i++){
      sum=sum*i;
    }
    return sum;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    System.out.println(factorial(num));
  }

}
