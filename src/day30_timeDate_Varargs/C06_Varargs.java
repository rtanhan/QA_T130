package day30_timeDate_Varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        islemyap("Ali","Veli","Sahil","Saido"); // 6
        islemyap("Meltem"); // 6
        islemyap("Orkong","Yakup","Sedat","Eren"); // 9

    }

    public static void islemyap (String s, String... t){

        System.out.println(s.length()+t.length);
    }
}
