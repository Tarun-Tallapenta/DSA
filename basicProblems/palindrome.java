import java.util.Scanner;
class palindrome{
  public static boolean isPalindrome(int n){
    int temp=n;
    int reverse=0;
    while(n>0){
      int digit=n%10;
      reverse=reverse*10+digit;
      n=n/10;
    }
    return temp==reverse;
  }

  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  int num=sc.nextInt();
  if(isPalindrome(num)){
    System.out.println("palindrome number");
  }
  else{
    System.out.println("not a palindrome number");
  }
}
}
