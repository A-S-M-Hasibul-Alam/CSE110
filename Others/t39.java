public class t39{
  public static void main(String args[]){
    int n = 1;
    while(n<1000){
      int count = 1;
      int d =0;
      while(count<=n){
        if(n%count == 0){
        d++;
        }
        count++;
      }
      if(d == 2){
        System.out.println(n);
      }
      n++;
    }
  }
}
  
