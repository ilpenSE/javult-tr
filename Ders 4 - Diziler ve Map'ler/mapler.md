# Mapler
Map dediğimiz ifade aslında içinde key-value (anahtar-değer) veri çiftinin olduğu veri türüdür. Bir sürü map sınıfı bulunur. Orijinal sınıf `Map`, sırası önemsiz map sınıfı `HashMap`, sıralama bulunduran `TreeMap`, HashMap'in alt sınıfı olan ve sıralamayı koruyan `LinkedHashMap` ve keyleri zayıf referans olarak tutan `WeakHashMap`. Örneğin:
```java
// HashMap örneği
HashMap<String, String> map = new HashMap<>();

// put() ile içine değer atayabiliriz
map.put("hello", "merhaba");
map.put("hi", "selam"); // 1. yazılan key, 2.si value

// get() ile içinden belirttiğimiz key'in karşılığını alırız.
map.get("hello") // = merhaba

// remove() ile bir veri çiftini sileriz
map.remove("hello") // artık hello: merhaba çifti yok

// containsKey() ile mapin içinde verdiğimiz key var mı yok mu diye kontrol ederiz.
map.containsKey("hello") // = false

// containsValue() ile mapin verdiğimiz bir value yani değer var mı yok mu diye kontrol ederiz
map.containsValue("merhaba") // = false

// size() ile mapin key-value çiftinin uzunluğunu alırız
map.size() // = 1

// isEmpty() ile mapin boş olup olmadığı kontrolü sağlanır
map.isEmpty() // = false

// keySet() ile mapteki key'leri Set halinde alırız
map.keySet() // [hi]

// values() ile mapteki değerleri Collection halinde alırız
map.values() // selam

// entrySet() ile mapteki anahtar-değer çiftini barındıran bir Set alırız
map.entrySet() // [hi:selam]
```
## Map Türleri
Her map türünün kendince özellikleri vardır. Ancak yukardaki metotlar her map türü için geçerlidir. Map türleri aşağıda sıralanmıştır.
### HashMap
- Anahtarlar ve değerler sırasızdır.
- Hızlı erişim ve güncelleme sağlar (ortalama O(1) zaman karmaşıklığına sahip).
- null anahtar ve null değerleri destekler.

### TreeMap
- Anahtarlar sıralı olarak tutulur.
- Ortalama O(log n) zaman karmaşıklığına sahiptir.
- null anahtarları desteklemez, ancak null değerleri destekler.

### LinkedHashMap
- Anahtarlar, eklenme sırasına göre veya erişim sırasına göre sıralanabilir.
- Hızlı erişim sağlar ve sıralı erişim gereksinimleri için uygundur.
- null anahtar ve null değerleri destekler.

### WeakHashMap
- Anahtarlar, Garbage Collector tarafından serbest bırakılabilir.
- Bellek sızıntılarını önlemek için kullanışlıdır.
- null anahtar ve null değerleri destekler.