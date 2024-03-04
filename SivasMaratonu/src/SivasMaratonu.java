public class SivasMaratonu {

    //Maratonda yarışan kişilerin ismini ve kaç dakikada tamamladıklarını dizi şeklinde tanımladım.
    public static void main(String[] args) {
        String[] isimler = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] dakıkalar = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};

        //Birinciyi , ikinciyi ve üçüncüyü metodları çağırıp bularak integer bir değer olarak tanımladım.
        int bırıncı = enıyıderece(dakıkalar);
        int ıkıncı = ıkıncıenıyıderece(dakıkalar, bırıncı);
        int ucuncu = ucuncuenıyıderece(dakıkalar, bırıncı, ıkıncı);

        // En iyi 3 dereceyi bulma ve yazdırma.
        System.out.println("Birinci: " + isimler[bırıncı] + " " + dakıkalar[bırıncı] + "'");
        System.out.println("İkinci: " + isimler[ıkıncı] + " " + dakıkalar[ıkıncı] + "'");
        System.out.println("Üçüncü: " + isimler[ucuncu] + " " + dakıkalar[ucuncu] + "'");

        derece(dakıkalar);
    }

    //Maratonda yarışan ve birinci olarak bitiren kişiyi bulduran metod.
    private static int enıyıderece(int[] dakıkalar) {
        int enıyı = 0;
        for (int i = 1; i < dakıkalar.length; i++) {
            if (dakıkalar[i] < dakıkalar[enıyı]) {
                enıyı = i;
            }
        }
        return enıyı;
    }

    //Maratonda yarışan ve ikinci olarak bitiren kişiyi bulduran metod.(ikinciyi bulabilmek için birinci kişiyi parametre olarak ekledim.)
    private static int ıkıncıenıyıderece(int[] dakıkalar, int bırıncı) {
        int ıkıncı = (bırıncı == 0) ? 1 : 0;
        for (int i = 0; i < dakıkalar.length; i++) {
            if (i != bırıncı && dakıkalar[i] < dakıkalar[ıkıncı]) {
                ıkıncı = i;
            }
        }
        return ıkıncı;
    }

    //Maratonda yarışan ve üçüncü olarak bitiren kişiyi bulduran metod.(üçüncüyü bulabilmek için birinci ve ikinci kişiyi parametre olarak ekledim.)
    private static int ucuncuenıyıderece(int[] dakıkalar, int bırıncı, int ıkıncı) {
        int ucuncu = (bırıncı == 0 && ıkıncı == 1) ? 2 : ((bırıncı == 0 && ıkıncı == 2) || (bırıncı == 1 && ıkıncı == 2)) ? 1 : 0;

        for (int i = 0; i < dakıkalar.length; i++) {
            if (i != bırıncı && i != ıkıncı && dakıkalar[i] < dakıkalar[ucuncu]) {
                ucuncu = i;
            }
        }
        return ucuncu;
    }

    //Derecelendirme bölümü A,B Ve C derecelerinde kaç kişi olduğunu bulduran ve A,B Ve C de kaç kişi olduğunu yazdıran metod.
    private static void derece(int[] dakıkalar) {
        int a = 0, b = 0, c = 0;
        for (int derece : dakıkalar) {
            if (derece >= 200 && derece <= 299) {
                a++;
            } else if (derece >= 300 && derece <= 399) {
                b++;
            } else if (derece >= 400) {
                c++;
            }
        }
        System.out.println("A -> " + a + '\n' + "B -> " + b + '\n' + "C -> " + c );
    }
}

// 2023141043 Bilgisayar Mühendisliği 1.Sınıf Öğrencisi Ahmet TURGUT - B2 HOMEWORK
