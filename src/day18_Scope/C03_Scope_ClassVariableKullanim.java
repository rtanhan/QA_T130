package day18_Scope;

public class C02_Scope_ClassVariableKullanim {

    /*
        Kural 4 -   static variable'lar her yere gidebilirler. ( tum methodlardan cagrilabilirler)
                    static olmayan variable (instance variable)'lar ise
                    static alanlara giremezler (static olan method'lardan varsayilan olarak cagrilamazlar)

        Kural 5 -   class level variable'lar deger atanmadan olusturulabildigi gibi
                    deger atanmadan kullanilabilirler.
                    biz deger atamaz isek Java default deger olarak
                    - non-pirimitive'lere == > null
                    - sayisal pirimitive'lere == > 0
                    - boolean variable'lara == > false
                    - char variable'lara == > hiclik degeri atar. (char olarak bosluk atanir assci DEGER DEGIL )

    */

    static String s;
    static int a;
    boolean bl;
    char chr;

    public static void main(String[] args) {

        System.out.println(s); // null

        System.out.println(a); // 0

        // Eger static olmayan class uyelerine static alandan ulasmak isterisek
        // once class'dan bir obje olusturmali
        // sonra o obje uzerinden static olmayan ueyeler kullanilmalidir.

        C02_Scope_ClassVariableKullanim obj = new C02_Scope_ClassVariableKullanim();
        System.out.println(obj.bl); // false default deger
        System.out.println(obj.chr); // "" default deger hiclik

    }

    public static void method1() {

    }


    public void method2() {
        System.out.println(chr); // ""

    }

}
