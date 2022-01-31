import java.util.Scanner;
public class a4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter quantity");
    int n = sc.nextInt();
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int min = a; int sum=0; int d=0; 
    for(int c=1; c<=n-1; c++){
      System.out.println("Enter a number");
    int b = sc.nextInt();
      if(b<a){
        min = b;
      }
  
   if(a%2==0){
     sum=sum+a;
     d++;
   }
   if(b%2==0){
     sum=sum+b;
     d++;
   }
    }
    System.out.println(min);
    int avg = sum/d;
    System.out.println(avg);
  }
}
      