package day10_StringManipulations;

public class C06_startWith_endWith {

    public static void main(String[] args) {

        String str = "Java Candir";

        // baslangictan kac harf alinirsa alinsin onunlami basliyor sorusunun cevabıu evet dir.
        // buna butun metin dahildir.

        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Ja")); // true
        System.out.println(str.startsWith("Jav")); // true
        System.out.println(str.startsWith("Java Candir")); // true
        System.out.println(str.startsWith("")); // true

        // endWtih'te start gibi bitenler seri halde ise cevabi evettir.
        System.out.println(str.endsWith("r")); // true
        System.out.println(str.endsWith("dir")); // true
        System.out.println(str.endsWith("Candir")); // true
        System.out.println(str.endsWith("Java Candir")); // true
        System.out.println(str.endsWith("")); // true

    }
}
