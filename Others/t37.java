public class t37{
  public static void main(String args[]){
    int n = 1;
    while(n<1600){
      int count = 1;
      int sum =0;
      while(count<n){
        if(n%count == 0){
        sum = sum+count;
        }
        count++;
      }
      if(sum == n){
        System.out.println(n);
      }
      n++;
    }
  }
}
  