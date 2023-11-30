package day30_timeDate_Varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        islemyap(1,2,3,4,5,6,7); // 1 + 5 = 6
        islemyap(5,0,4); // 5 + c[0] == > 5 + 4 = 9
    }
    public static void islemyap(int a, int b, int...c){
        System.out.println(a+c[b]);
    }
}
