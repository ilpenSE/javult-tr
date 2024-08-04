# Switch-Case Bloğu
Bu blokta bir değerin ötekine eşit olup olmadığını kontrol etmenin daha hızlı bir yöntemidir. Normalde uzun uzun `if-else` blokları yazmaktansa daha hızlı ve daha az kod yazarak bu işlemi gerçekleştirebiliriz. Yani
```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if (a == 1) {
    ...
} else if (a == 2) {
    ...
} else if (a == 3) {
    ...
} else {
    ...
}
```
yerine:
```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
switch (a) {
    case 1:
        System.out.println("a birdir");
        break;
    case 2:
        System.out.println("a ikidir");
        break;
    case 3:
        System.out.println("a üçtür");
        break;
    default:
        System.out.println("a ne 1 ne 2 ne 3tür");
        break;
}
```
Burda `default` bloğu, yukardaki değerlerin hiçbiri sağlanmazsa çalışır. `switch` içine yazılan ifade `if-else`lerin içindeki eşitliklerin solunda yer alan ifadedir. `case` ifadesinin sağındaki sayılar da `switch` içindeki değerin nelerere eşit olup olmadığını kıyaslamak için bulunur. Burda `break` operatörü kodu bitirmek için kullanılır. Kullanılmazsa aşağısındaki bütün ifadeler çalışır. Eğer yukardaki kodda `break` hiç kullanılmazsa kullanıcının yazdığı ifade ve onun altındakiler çalışır. Örneğin 3 yazılmışsa çıktıda `a üçtür` ve `a ne 1 ne 2 ne 3tür` yazar.