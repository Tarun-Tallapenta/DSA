import java.util.Scanner;
class primeNumber{
  public static boolean primeNumber(int n){
    int count=0; 
    int i=1;
    while(i<=n){
      if(n%i==0){
        count++;
      }
      i++;
    }
    if(count==2){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=20;i++){
      if(primeNumber(i)){
        System.out.println(i + "");
      }
    }
  }
}
