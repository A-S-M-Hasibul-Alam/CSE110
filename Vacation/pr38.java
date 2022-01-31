import java.util.Scanner;
public class pr38{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int o=0; o<a.length; o++){
      a[o] = sc.nextInt();
    }
    for(int i=0; i<a.length; i++){
      int max = a[i];
      int maxl = i;
      for(int j=i+1; j<a.length; j++){
        if(a[j]>max){
          max = a[j];
          maxl = j;
        }
      }
      int temp = a[i];
      a[i] = max;
      a[maxl] = temp;
    }
    for(int w=0; w<a.length; w++){
      System.out.println(a[w]);
    }
  }
}