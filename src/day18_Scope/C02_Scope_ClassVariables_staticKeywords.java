package day18_Scope;

public class C02_Scope_ClassVariables_staticKeywords {

    /*
        Static keyword bir nevi statu belirtir.
        static unvani alan bir variable veya method'lar
        static olmayan class uyelerini kabul etmezler.

        static uyeler ellerini kollarini sallayarak, her yere gidebilirler
        ama kendi iclerine static olmayan uyeleri almazlar.

        Class level'daki variable'larda static olarak veya static keyword
        kullanilmadan olusturulabilir.

        static olarak keyword atanmis variable'lar tum methodlar icerisinden cagrilabilir.
        Ancak static keyword atamasi YAPILMAMIS olan variable'lar sadece static olmayanlardan cagrilabilir



    */

    static String s;
    static int a;
    boolean bl;
    char chr;

    public static void main(String[] args) {
        staticMethod1();
        // staticOlmayanMethod();
        // Non-static method 'staticOlmayanMethod()' cannot be referenced from a static context
        s = "Java";
        a = 20;
        // Non-static field 'bl' cannot be referenced from a static context
        // bl = false;
        // chr = 'b';

    }

    public static void staticMethod1() {

        // staticOlmayanMethod();
        s = "Hava";
        a = 30;
    }

    public void staticOlmayanMethod() {

        staticMethod1();
        System.out.println(s);
        System.out.println(a);
        System.out.println(bl);
        System.out.println(chr);

    }
}
