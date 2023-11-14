package day18_Scope;

public class C04_BaskaClassdanVariable_MethodKullanimi {

    public static void main(String[] args) {

        // baska classtan static class uyersi kullanmak icin
        // classIsmi.staticUyeIsmi yazmaniz yeterlidir.

        System.out.println(C03_Scope_ClassVariableKullanim.s); // null
        System.out.println(C03_Scope_ClassVariableKullanim.a); // 0
        C03_Scope_ClassVariableKullanim.method1(); // static method calisti

        // static olmayan uyelere ulasmak icin ise
        // kullanmak istedigimiz class'dan obje olusturmaliyiz.

        C03_Scope_ClassVariableKullanim obj = new C03_Scope_ClassVariableKullanim();
        System.out.println(obj.bl); // false
        System.out.println(obj.chr); // "" hiclik
        obj.method2(); // static olmayan method calisti

        // static olan bir class uyesine
        // static olnayan yolla ulasmak istersek
        // java kullanmamiza itiraz etmez
        // ama intelliJ bizi uyarir
        // Static member 'day18_Scope.C03_Scope_ClassVariableKullanim.a' accessed via instance reference
        // static bir clas uyesine, static olmayan bir yontemle ulasiyorsun diye uyarı verir.

        System.out.println(obj.a); // 0
        System.out.println(obj.s); // null
        obj.method1(); // static method calisti


    }
}
