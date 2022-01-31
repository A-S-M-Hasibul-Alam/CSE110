public class a17{
  public static void main(String args[]){
    int s=0;
    System.out.println(s);
    int t=1;
    System.out.println(t);
    int f=s+t;
    while(f<1600){
      System.out.println(f);
      s=t;
      t=f;
      f=s+t;
    }
  }
}