import java.util.Scanner;
public class lab1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    int max = a[0];
    for(int j=1; j<a.length; j++){
      if(a[j]>max){
        max = a[j];
      }
    }
    System.out.println(max);
  }
}
