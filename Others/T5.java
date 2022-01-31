import java.util.Scanner;
public class T5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter seconds");
    int second= sc.nextInt();
    int h = second/3600;
    int b = second%3600;
    int m = b/60;
    int s = b%60;
    System.out.println(h +" Hours "+m+" Minutes "+s+" Seconds");
  }
}