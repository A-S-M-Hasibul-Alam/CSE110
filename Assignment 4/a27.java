public class a27{
  public static void main(String ars[]){
    
    for(int n=1; n<1000; n++){
      int div=0;
      for(int a=1; a<=n; a++){
        
        if(n%a==0){
          div++;
        }
      }
      if(div==2){
        System.out.println(n);
      }
    }
  }
}


