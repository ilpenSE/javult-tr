# Java'ya Giriş
Bu dersimizde Java IDE'leri, Java'nın arka planı, ekrana bir şeyler yazdırma ve ekrandan bir şeyler alma konularını işleyeceğiz.
## IDE'ler
IDE'ler (İng.: Integrated Development Platform Trk.: Entegre Geliştirme Platformu) kod yazmak için kullanılır ve Java için birkaç IDE vardır:

### [NetBeans](https://netbeans.apache.org/front/main/download/)
+ Kullanımı ve kurulumu kolay
+ Java EE projelerini destekler
- Performans diğer IDE'lere göre daha düşük olabilir
- Kullanıcı arayüzü yeni Java yazılımcıları için kafa karıştırıcı olabilir
### [Eclipse](https://eclipseide.org/)
+ Tonca plugin desteği sunar
+ Topluluğu zengindir
+ Birden fazla dil desteği vardır
- Başlangıç için karmaşık gelebilir
- Performans ara sıra düşük olabilir
### [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
+ Kod analizi (IntelliSense) ve hata ayıklama (debug) oldukça iyidir
+ Performansı diğerlerine göre çok iyidir
+ Java ve diğer diller arası geçiş kolaydır
- Ücretsiz sürümü (Community Edition) sınırlı özelliklere sahiptir
- Profesyoneller için lisans fiyatları pahalıdır

Size tavsiyem eğer bilgisayarınız destekliyorsa IntelliJ IDEA kullanmanız olacaktır zira hem ücretsizdir hem de başlangıç ve sonrası için gayet idealdir.
## Giriş
Java, tamamen OOP (Object-Oriented Programming, Nesne Yönelimli Programlama) dilidir. Yani sınıflar (class) olmadan hiçbir kod çalıştırılamaz. Java'da sınıfın adıyla dosyamızın adı aynı olmalıdır. Örneğin: <br/>
Main.java
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
Yukardaki kod parçasında Main isimli bir sınıf oluşturulmuş ve bu sınıfın içinde programın başlangıç yani `main` metodu bulunmaktadır. Bu metot her Java programında `public static void main(String[] args)` şeklinde yazılmalıdır. Metotlar hakkında daha fazla bilgi için [buraya tıklayın.](#metotlar)<br></br>
`System.out.println()` metodu ekrana yani konsola bir şeyler yazdırmak için kullanılır. `println` ismindeki `ln` ifadesi **line** kelimesinin kısaltmasıdır. Parantez içine her türden veri yazılabilir. İki `"` (tırnak) arasında gösterilen ifadeye `String` denir ve içinde herhangi bir metni tutar. Daha fazla bilgi için [buraya tıklayın.](#string-veri-türü)<br></br>
## Erişim Operatörleri ve Paketler
`public` operatörü bu sınıfın diğer sınıflardan da ulaşılabilir olması demektir. Bunlara erişim operatörleri (access operators) denir. Erişim operatörleri `public`, `private` ve `protected` olmak üzere üç tanedir. `private` operatörü geldiği değişkeni/metodu sadece o dosya içinde erişilebilir yapar. `protected` operatörüyse geldiği değişkeni/metodu sadece o paket içinde ya da o dosyadaki alt sınıflarda (subclass) erişilebilir yapar. Java'daki **paket**ler art arda klasörler şeklinde olur. Örneğin `dev.elite` isimli paketin bulunduğu projenin ***src*** dosyası yani kodların bulunduğu dosya şu şekilde olur:
```
src:
    dev:
        elite:
            Main.java
```
Paketlerin çalışması için Main.java dosyamızın en başına `package dev.elite` koymamız gerekir
## Sınıflar
Ayrıca bir Java dosyasında birden fazla sınıf bulunabilir.
```java
package dev.elite
public class Main {
    // kod
}
private class Other1 {
    // kod
}
```
Bu yazdığımız kodun daha iyi okunabilmesi için ya da not almak için kod derleyicileri (compiler) tarafından okunmayan **yorum**lar (comment) bırakırız. Bunun için de `// yorum` ya da `/* yorum */` ifadelerini kullanırız. `//`dan sonra gelen her şey yorum kabul edilirken `/*` işaretindeyse `*/` işaretine kadar olan her şey kabul edilir. Bunları çalışmasını istemediğimiz kodları silmek yerine orda tutmak için de kullanabiliriz.<br></br>
## Operatörler
Java'daki operatörler ***Mantıksal Op.***, ***Aritmatik Op.***, ***Kıyas Op.***, ***Artırma/Azaltma Op.***, ***Atama Op.*** ve ***Bitwise Op.*** olmak üzere altıya ayrılır. Tüm operatörlerin örnek kullanımları için [buraya tıklayın](./Operators.java)
### Mantıksal Operatörler
Bu operatörlerin amacı matematiksel mantığı ifade eder. Bu operatörler sadece `true` ve `false` değerini alabilen `boolean` değer türü için uygulanabilir
- `&&` VE
- `||` VEYA
- `!` DEĞİL
### Aritmatik Operatörler
Bu operatörler matematiksel işlemler için kullanılır.
- `+` Toplama
- `-` Çıkarma
- `*` Çarpma
- `/` Bölme
- `%` Mod (Kalan Bulma)
### Kıyas Operatörleri
Bu operatörler iki veriyi kıyaslarlar.
- `==` EŞİTTİR
- `!=` EŞİT DEĞİLDİR
- `>` BÜYÜKTÜR
- `<` KÜÇÜKTÜR
- `>=` BÜYÜKTÜR VEYA EŞİTTİR
- `<=` KÜÇÜKTÜR VEYA EŞİTTİR
### Artırma/Azaltma Operatörleri
Bunlar bir sayıyı artırıp azaltmak için kullanılır.
- `++` 1 arttır
- `--` 1 azalt
### Atama Operatörleri
- `=` Bir veriyi diğerine eşitler yani atar
- `+=` Bir sayıyı diğeriyle toplamını atar
- `-=` Bir sayıyı diğerinden farkını atar
- `*=` Bir sayıyı diğeriyle çarpımını atar
- `/=` Bir sayıyı diğeriyle bölümünü atar
- `%=` Bir sayıyının diğerinden kalanını atar
### Bitwise Operatörleri
Bu operatörler iki sayının ikili sistemdeki haliyle iş yapar. VE, VEYA vb. operatörlerde iki sayının binary (ikili) sistemdeki karşılıkları alt alta yazılır ve öyle işlem yapılır.
- `&` Bitsel VE
- `|` Bitsel VEYA
- `^` Bitsel XOR (ANCAK VE ANCAK TERSİ)
- `~` Bitsel DEĞİL
- `<<` SOLA KAYDIR
- `>>` SAĞA KAYDIR
- `>>>` DOLGULU SAĞA KAYDIR
## Metotlar
Java'daki metotlar yani fonksiyonlar ya bir değer döndürür ya da döndürmez. Eğer değer döndürüyorsa döndürdüğü değer metot isminden önce yazılır ama eğer döndürmüyorsa metot isminden önce `void` yazılır. <br></br>
Değer döndürmesi için `return` operatörü kullanılır. Bundan sonra dönecek değer yazılır ve noktalı virgül konur. <br></br>
Metotlarda erişim operatörleriyle beraber statiklik operatörü de bulunur bu da `static` şeklinde ifade edilir. Bu operatör konduğunda erişilebilir bir diğer dosyadan direkt sınıfla beraber kullanılır ama konmadığında bir yapı (constructor) oluşturulmalıdır. (Yapılar bir sonraki dersin konusu)<br></br>
Metotlar aynı matematikteki fonskiyonlar gibi değer yani parametre alabilir. Java'da bunları ifade ederken önce değerimizin türünü sonra da metot içi ismini yazarız. <br></br>
Örneğin iki tam sayıyı toplayan bir metot şöyle olur:
```java
public static int sum(int a, int b) {
    return a + b;
}
```
## Veri Türleri
Java'da veri tanımlamak için ya bir metoda ya da bir sınıfa ihtiyacımız vardır. Java'da veri türleri üçe ayrılır: ***Primitif Veri Türleri (Primitive Data Types)***, ***Referans Veri Türleri (Reference Data Types)*** ve ***Özel Veri Türleri (Custom Data Types)***. <br/>
### Primitif Veri Türleri (Primitive Data Types)
Bu veri türü Java'nın kendisiyle gelir ve bir sınıfı temsil etmez. Bunlar: `int`, `float`, `double`, `long`, `short`, `boolean`, `byte` ve `char`dır. <br/>
#### int, float, double, long, short Veri Türleri
Bu veri türleri bir sayıyı temsil ederler. `int` bir tam sayıyı, `float` ve `double` ise ondalıklı yani virgüllü sayılar için kullanılır. `long` ve `short` ise yine bir tam sayıyı belirtir. `long`, `short` ve `int` arası farklarda `long` içinde tutulan sayı 64 bitliktir yani o veri -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,808 arası bir değer alır. `short` içindeki veri 16 bitliktir ve -32,768 ile 32,768 arası bir değer alır. `int` içindeki veri 32 bitliktir ve -2,147,483,648 ile 2,147,483,648 arası bir değer alır. Bu sayılar aslında `2^(bit sayısı - 1) - 1` şeklinde genelleştirilir. Aynısı `float` ve `double` için geçerlidir. `float` 32 bitlikken `double` 64 bitliktir. `float` türünde virgülden sonra maksimum 7 sayı desteklerken `double` için bu sayı 16'dır. <br/>
Bu veri türlerinin kullanımı şu şekildedir:
```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        float b = 4.2f;
        double c = 4.654d;
        long d = 105L;
        short e = 40;
    }
}
```
#### boolean Veri Türü
Bu veri türü `true` ve `false` alabilir. Bunlar bir koşullu ifade içinde kullanılır. Aynı zamanda mantıksal operatörlerde de kullanılabilir. Örneğin:
```java
boolean x = true;
boolean y = false;
System.out.println("X: " + x + " Y: " + y);
```
#### char Veri Türü
Bu veri türü sadece bir ASCII karakteri temsil eder ve iki `'` simgesi içinde gösterilir. Büyük küçük harfe dikkat edilir. Örneğin:
```java
char x = 'A'; // A'nın ASCII kodu 65'tir.
```
#### byte Veri Türü
Bu veri türü 8 bitlik bir tamsayı değerini ifade eder. ASCII kodlarını ifade etmek için kullanılır. Yani içindeki veri -128 ile 127 arası bir değer alır. Genelde dosya işlemlerinde ve ağ iletişiminde kullanılır. Örneğin:
```java
byte a = 65;
```
### Referans Veri Türü (Reference Data Types)
Bu veri türü `Class Types (Sınıflar)`, `Array Types (Diziler)`, `Interface Types (Arayüzler)`, `Enum Types (Enumerasyonlar)`, `Reference Types (Referanslar)`, `String` olmak üzere altıya ayrılır. Ancak bugün sadece sınıflar, ve stringleri işleyeceğiz. Diğerleri sonraki derslerde.
#### Sınıflar (Class Types)
Java'daki her nesnenin yani dosyanın bir sınıfı bulunur. Bunlar bellekte yer kaplarlar. İçine değişken, sabit veya metot alabilirler. Örneğin:
```java
public class Main {
    public static int a = 6;
    public static float b;
    public static void main(String[] args) {
        b = 4.2f;
        System.out.println(a);
    }
}
```
#### String Veri Türü
Bu veri türü içinde bir veya daha fazla karakteri barındıran metin türüdür. İçinde sadece sayılar da olabilir ancak bu şekilde iki tanesiyle işlemler yapılamaz. Örneğin `"10" + "5"` ifadesi `"105"`e eşittir. Buna `String concatenation (String birleştirme)` denir. Bunun dışında ortasında `-`, `*` vb. olursa program hata verir. `String` ifadesiyle kullanılabilecek metotlar için [buraya tıklayın](https://www.w3schools.com/java/java_ref_string.asp)
