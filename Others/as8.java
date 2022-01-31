import java.util.Scanner;
public class as8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
    }
    for(int j=0; j<n; j++){
      int min = a[j];
      int minL = j;
      for(int k=j+1; k<n; k++){
        if(a[k]<min){
          min = a[k];
        }
      }
        int temp = a[j];
        a[j] = min;
        a[minL] = temp;
    }
    int med;
    if(n%2==0){
      med = (a[n/2]+a[n/2-1])/2;
    }
    else{
      med = a[n/2];
    }
    System.out.println("Median is: "+med);
  }
}
      