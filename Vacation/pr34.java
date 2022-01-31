import java.util.Scanner;
public class pr34{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[3];
    for(int index=0; index<a.length; index++){
      System.out.println("Enter a number");
      a[index] = sc.nextInt();
    }
    int sum = 0;
    for(int index=0; index<a.length; index++){
      sum = sum+a[index];
    }
    System.out.print(sum+", "+ a[0]+", "+a[1]+", "+a[2]+".");
  }
}
