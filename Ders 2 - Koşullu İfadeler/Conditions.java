public class Conditions {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        if (a > b) {
            System.out.println("10 büyüktür 4");
        } else {
            System.out.println("10 büyük değildir 4");
        } // bu durumda else kodu a veya b değiştirilmeden çalışmaz
        // buranın çıktısı 10 büyüktür 4 olacaktır

        int c = 5;
        switch (c) {
            case 1:
                System.out.println("5 eşittir 1");
                break;
            case 2:
                System.out.println("5 eşittir 2");
                break;
            case 5:
                System.out.println("5 eşittir 5");
                break;
            default:
                System.out.println("5 ne bire ne ikiye ne beşe eşit");
                break;
        }
        // buranın çıktısı 5 eşittir 5 olacaktır
    }
}
