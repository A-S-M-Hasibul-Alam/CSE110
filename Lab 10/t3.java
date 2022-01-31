import java.util.Scanner;
public class t3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int index=0; index<a.length; index++){
      a[index] = sc.nextInt();
    }
    for(int print=a.length-1; print>=0; print--){
      System.out.println(a[print]);
    }
  }
}