import java.util.Scanner;
public class t40{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount of money");
    int a = sc.nextInt();
    int b = a/500;
    int c = a%500;
    int d = c/100;
    int e = c%100;
    int f = e/50;
    int g = e%50;
    int h = g/20;
    int i = g%20;
    int j = i/10;
    int k = i%10;
    int l = k/5;
    int m = k%5;
    int n = m/2;
    int o = m%2;
    int p = o/1;
    System.out.println("500 Taka: "+b+"note(s) "+"100 Taka: "+d+"note(s) "+"50 Taka: "+f+"note(s) "+"20 Taka: "+h+"note(s) "+"10 Taka: "+j+"note(s) "+"5 Taka: "+l+"note(s) "+"2 Taka: "+m+"note(s) "+"1 Taka: "+p+"note(s)");
  }
}
