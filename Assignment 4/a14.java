import java.util.Scanner;
public class a14{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int prod=1;
     System.out.println("Enter a number");
    int n= sc.nextInt();
    for(int c=1; c<=n; c++){
      
        prod=prod*c;
      
    }
    System.out.println(prod);
  }
}