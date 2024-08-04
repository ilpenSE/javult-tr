# While Döngüsü
Java'da döngü yapmanın birçok yolu vardır. Bunlardan biri de while döngüsüdür. Döngü için önceden bir `int` atamamız lazımdır. `while` döngüsü, içindeki koşulun `true` olduğu sürece çalışır. Döngünün içine sonda atadığımız `int` değerini genellikle bir artırarak sonsuz döngüden kaçarız.<br></br>
Örneğin aşağıdaki örnekte `int i` değeri 10'dan küçük olduğu sürece ekrana `i`yi yazdıracaktır ve sonrasında `i`yi bir artıracaktır. En sonda i değeri 10 olduğunda `while` içindeki koşul sağlanmadığı için `i` değeri 10 kalacaktır ve döngü bitecektir.
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```
Çıktısı: `0 1 2 3 4 5 6 7 8 9`<br></br>
Eğer herhangi bir sebeple döngüyü bitirmek istiyorsak `break` operatörü kullanılır. Döngüyü başa almak içinse `continue` kullanılır. Örneğin:
```java
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int i = 0;
while (i < 10) {
    if (s.equalsIgnoreCase("a")) {
        break;
    }
    i++;
    System.out.println("a yazmadın");
    if (s.equalsIgnoreCase("b")) {
        continue;
    }
    System.out.println(i);
}
```
Bu kodda kullanıcıdan bir `String` alıyoruz ve eğer bu değer `a`ya eşitse döngüyü bitiriyoruz ve ekranda hiçbir şey yazmıyor.<br></br>
Eğer kullanıcı `b` yazmışsa ekrana `a yazmadın` yazacak ve döngü başa alınacak. Çıktısında 10 kere `a yazmadın` görülecek. <br></br>Yalnız burda dikkat edilmesi gereken bir husus var. O da eğer yukardaki kodda `i++;` kodunu döngünün sonuna koyarsanız ve ekrana `b` yazarsanız program sonsuz döngüye girecektir. Çünkü `i++` kodu, `continue` kodunun altında kaldığı için ve ikinci koşulumuz yani `s.equalsIgnoreCase("b")` sağlandığı için sürekli kod başa dönecek ve boşu boşuna `s` değerinin `a`ya eşit olup olmadığı kontrol edilecektir. Ayrıca `i`de bir değişiklik olmadığı ve `i = 0` olduğu için `i < 10` ifadesi her zaman sağlanacaktı ve sonsuz döngü oluşacaktı. Bu sonsuz döngüler, bilgisayarınızın RAM'ini ve işlemcisini yorar, o yüzden sonsuz döngüden olabildiğince kaçının.

# Do While Döngüsü
Normal `while` ile tamamen ayrıdır ancak tek farkı `while`da `{}` içine yazdığımız kodu ilk olarak `do {}` ile yapıyoruz. Örneğin:
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```