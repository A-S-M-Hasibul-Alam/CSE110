import java.util.Scanner;
public class T8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of articles");
    int article = sc.nextInt();
    int fees = article*500;
    System.out.println("Article number is = "+article);
    System.out.println("Total monthly fees = "+fees);
  }
}
    
    