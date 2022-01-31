import java.util.Scanner;
public class b{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<=a.length-1; i++){
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
    }
    for(int j=0; j<=a.length-1; j++){
      //int min = a[j];
      int minl = j;
      for(int k=j+1; k<=a.length-1; k++){
        if(a[k]<a[j]){
          //min = a[k];
          minl = k;
        }
        int temp = a[j];
        a[j] = a[minl];
        a[minl] = temp;
      }
    }
    for(int w=0; w<=a.length-1; w++){
      System.out.print(a[w]+",");
    }
    /*if(a.length%2==1){
      int med = a[a.length/2];
      System.out.println(med);
    }
    else{
      int med = (a[a.length/2]+a[a.length/2-1])/2;
      System.out.println(med);
    }*/
  }
}