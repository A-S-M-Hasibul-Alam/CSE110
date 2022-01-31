public class pr33{
  public static void main(String args[]){
    for(int a=40; a<=50; a++){
      int div = 0;
      for(int i=1; i<=a-1; i++){
        if(a%i==0){
          div++;
        }
      }
      if(div == 1){
        System.out.println(a);
      }
    }
  }
}