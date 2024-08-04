public class Operators {
    public static void main(String[] args) {
        // Aritmetik Operatörler
        System.out.println("Toplam: " + (10 + 5)); // 15
        System.out.println("Fark: " + (10 - 5)); // 5
        System.out.println("Çarpım: " + (10 * 5)); // 50
        System.out.println("Bölüm: " + (10 / 5)); // 2
        System.out.println("Kalan: " + (10 % 5)); // 0

        // Mantıksal Operatörler
        System.out.println("1 VE 1: " + (true && true));
        System.out.println("1 VE 0: " + (true && false));
        System.out.println("0 VE 0: " + (false && false));

        System.out.println("1 VEYA 1: " + (true || true));
        System.out.println("1 VEYA 0: " + (true || false));
        System.out.println("0 VEYA 0: " + (false || false));

        System.out.println("1 DEĞİL: " + (!true));
        System.out.println("0 DEĞİL: " + (!false));

        // Atama ve Artırma/Azaltma Operatörleri
        int a = 5; // a artık 5
        a++; // a artık 6
        a--; // a terkardan 5

        a += 2; // a artık 7
        a -= 5; // a artık 2
        a *= 3; // a artık 6
        a /= 2; // a artık 3
        a %= 2; // a artık 1
        /*
            Atama Operatörleri aslında şu şekildedir:
            a += 2 demek a = a + 2 demektir ancak uzun hali yerine daha kısa olan += olan verisyonunu kullanırız
        */

        // Kıyas Operatörleri
        int x = 14;
        int y = 4;
        System.out.println(x > y); // true
        System.out.println(x < y); // false
        System.out.println(x == y); // false
        System.out.println(x >= y); // true
        System.out.println(x <= y); // false

        // Bitwise Operatörler
        int b = 5; // 0101
        int c = 3; // 0011
        int d = b & c; // d artık 0001 yani 1
        /*
            b = 0101
            c = 0011
           &--------
            d = 0001
        */
        int e = b | c; // e artık 0111 yani 7
        /*
            b = 0101
            c = 0011
           |--------
            e = 0111
        */
        int f = ~b; // f artık 1010 yani -6
        /*
            b = 0101
            f = 1010
        */
        int g = b ^ c; // g artık 0110 yani 6
        /*
            b = 0101
            c = 0011
           ^--------
            g = 0110
        */
        int h = b << 1; // h artık 1010 yani 10
        int i = b >> 1; // i artık 0010 yani 2
        int j = b >>> 1; // j artık 0010 yani 2
        /*
            b değerini 32 bitlik (4 bayt) halinde yazıyoruz ve onu 1 sağa kaydırıyoruz
            b = 00000000 00000000 00000000 00000101
            j = 00000000 00000000 00000000 00000010
            En sağdaki biti sildik ve en sola bir 0 attık
        */
    }
}