import java.util.Scanner;
public class pr37{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length-1; i++){
      a[i] = sc.nextInt();
    }
    for(int d=0; d<=a.length-1; d++){
      if(a[d]%2==0){
        System.out.println(a[d]);
      }
      break;
    }
  }
}
