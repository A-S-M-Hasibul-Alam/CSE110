public class f1{
  public static void main(String args[]){
    int a[] = {30, 10, 40, 20, 50};
    for(int i=0; i<=a.length-1; i++){
      int min = a[i];
      int minl = i;
      for(int j = i+1; j<=a.length-1; j++){
        if(a[j]<min){
          min = a[j];
          minl = j;
        }
      }
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
    for(int k=0; k<=a.length-1; k++){
      System.out.print(a[k]+", ");
    }
  }
}