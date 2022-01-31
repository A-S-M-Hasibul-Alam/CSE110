public class Q2 {
  public static void main (String[] args) {
    int a[] = {10,100,1000,10000};
    int a1[] = {3,2,1,0};
    int a2[] = {10000,100000,1000000,10000000};
    int a3[] = {1,2,3,0};
    int a4[] = a;
    a = a2;
    int a5[] = a4;
    for (int i = 0; i < a.length; i++) {
      if (a5[a1[i]] == a[a3[i]]/10){
        System.out.println(a3[a2[i]-a[i]]);
      }
      else if (a5[a1[i]]*10 == a[a3[i-1]-1]) {
        System.out.println(a3[a2[i]-a[i]+i-1+3]+a5.length);
      }
      else if (a5[a1[i-1]]*10 == a4[a3[i]]) {
        System.out.println(a3[a2[i]-a[i]+i]*10);
      }
      else {
        a2 = a3;
        a3 = a1;
        System.out.println(a3[a4[i]-a[i-i]]);
      }
    }
  }
}