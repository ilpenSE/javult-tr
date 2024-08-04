# For Döngüsü
Java'da for döngüsü, bir başlangıç değeri, bir bitiş değeri ve bir artırma değeri olarak tanımlanır. Bir değerimiz vardır (örn. i) ve bunu artırıp ya da azaltıp belirli bir koşulu sağladığı müddetçe döngü devam eder. Örneğin:
```java
for (int i = 0; i < 4; i++) {
    System.out.println(i);
} // çıktı: 0 1 2 3
```
Burda `int i = 0;` kod parçası `i` isminde değişkeni tanımlar ve sıfıra eşitler. `i < 4;` kod parçası `i`nin 4'ten küçük olup olmadığını kontrol eder. Eğer `i` 4'ten küçükse aşağıdaki kod bloğu çalışır. `i++;` kod parçası da `i`nin aşağıdaki kod bitince ya da döngü başa alınınca değerini 1 arttır demektir.<br/>
For döngüsünde Java'ya özgü bir özellik bulunur. Eğer bir dizimiz varsa ve o dizinin içindeki elemanları çekmek istiyorsak kısa bir yöntem kullanabiliriz:
```java
String[] arr = new String[]{"selam", "merhaba", "hello", "hi"}; // bu bir sonraki dersin konusu
for (String str : arr) {
    System.out.println(str);
} // çıktı: selam merhaba hello hi
```