import java.util.Scanner;
class fibonocci{
  public static void fibonocci(int n){
    int a=0;
    int b=1;
    for(int i=0;i<=n;i++){
      System.out.print(a  +  " ");
      int next=a+b;
      a=b;
      b=next;
    }
  }
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
  fibonocci(num);
  }
}
