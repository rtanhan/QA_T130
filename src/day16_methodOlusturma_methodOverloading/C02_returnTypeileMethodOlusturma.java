package day16_methodOlusturma_methodOverloading;

public class C02_returnTypeileMethodOlusturma {

    public static void main(String[] args) {

        // Verilen isim ve soyismi
        // istenen formata cevirip bize donduren bir method olusturun.
        // ornek output : A****** B******

        System.out.println(isimiIstenenFormataCevir("ramazan", "tanhan"));


    }

    public static String isimiIstenenFormataCevir (String isim,String soyisim){

        String donusmusIsim = isim.substring(0,1).toUpperCase()
                + isim.substring(1).replaceAll("\\w","*")
                + " " +
                soyisim.substring(0,1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w","*");

        return donusmusIsim;

    }
}
