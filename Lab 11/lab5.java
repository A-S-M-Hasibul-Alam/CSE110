import java.util.Scanner;
public class lab5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int j=0;j<a.length; j++){
      int max = a[j];
      int maxl = j;
      for(int k=j+1; k<a.length; k++){
        if(a[k]>max){
          max = a[k];
          maxl = k;
        }
      }
      int temp = a[j];
      a[j] = max;
      a[maxl] = temp;
    }
    for(int w=0; w<a.length; w++){
      if(w==a.length-1){
        System.out.print(a[w]+".");
      }
      else{
      System.out.print(a[w]+", ");
      }
    }
  }
}
