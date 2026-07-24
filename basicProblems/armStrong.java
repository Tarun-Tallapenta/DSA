import java.util.Scanner;
class armStrong{
  public static boolean armStrong(int n){
    int temp=n;
    int sum=0;
    while(n>0){
      int digit=n%10;
      sum=sum+(digit*digit*digit);
      n=n/10;
    }
     return sum==temp;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    if(armStrong(num)){
      System.out.println("armstrong num");
    }
    else{
      System.out.println("not armstrong num");
    }
  }
}
