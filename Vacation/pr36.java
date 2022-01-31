import java.util.Scanner;
public class pr36{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int d=0; d<=a.length-1; d++){
      if(a[d]%2==1){
        System.out.println(a[d]);
      }
      break;
    }
  }
}
