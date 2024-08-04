# If-Else Bloğu
Bir programda bir koşulun sağlanıp sağlanmadığını kontrol etmek için `if` operatörünü kullanırız. `if (condition)` içine yazılan `condition` ifadesi `boolean` olmak zorundadır. Bu bir metotsa mutlaka `boolean` değerini döndürmelidir.<br></br>
Bunun yanı sıra içeride kıyas operatörlerini de kullanabiliriz. Örneğin `==`, `<`, `>` vb.
```java
int a = 10;
if (a == 4) {
    System.out.println(a);
}
```
Bu kod, eğer `a` ifadesi dörde eşitse ekrana `a`yı yazdırır ancak `a` burda on olduğu için bu sağlanmaz ve ekrana `a` yazdırılmaz. O zaman `a == 4 sağlanmıyorsa` nasıl diyeceğiz? Bunun için `else` kullanacağız. Eğer yukardaki `if` bloğu sağlanmazsa `else` içindeki kodlar çalışır. Örneğin:
```java
if (4 == 10) {
    System.out.println("4 eşittir 10");
} else {
    System.out.println("4 eşit değildir 10");
} // Çıktı: 4 eşit değildir 10
```
Diyelim ki ben, kullanıcıdan bir veri alacağım ve bunun `a` olup olmadığını kontrol ettim ancak `a` değilmiş. Ben bir de bu verinin `b` olup olmadığını da kontrol etmek istiyorum. Bunu da `else if` ile yaparım. Yani:
```java
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
if (s.equals("a")) {
    // kullanıcı a yazdı
} else if (s.equals("b")) {
    // kullanıcı a yazmadı, b yazdı
} else {
    // kullancı a da b de yazmadı
}
```
Bu blokların daha hızlısı için [tıklayın.](./switch-case.md)