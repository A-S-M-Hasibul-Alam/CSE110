import java.util.Scanner;
public class Main8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double R = sc.nextDouble();
    double AREA = Math.PI*R;
    AREA = Math.round(AREA*10000.0000)/10000.0000;
    System.out.println("A="+AREA);
  }
}