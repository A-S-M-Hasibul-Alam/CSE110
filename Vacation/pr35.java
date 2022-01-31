import java.util.Scanner;
public class pr35{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length-1; i++){
      a[i] = sc.nextInt();
    }
    for(int d=a.length-1; d>=0; d--){
      System.out.println(a[d]);
    }
  }
}

