public class pr26{
  public static void main(String args[]){
    int sum = 0;
    for(int i=1; i<=600; i++){
      if(i%7==0){
        if(i%9==0){
          sum = sum+i;
        }
      }
    }
    System.out.println(sum);
  }
}