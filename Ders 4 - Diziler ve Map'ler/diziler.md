# Diziler (Array Types)
Diziler, içinde birden fazla veri depolar ancak veriler aynı türde olmak zorundadır. Dizilerin özellikleri ve nasıl kullanıldıkları hakkında daha fazla bilgi için aşağıya bakabilirsiniz.
## Oluşturma (Declaration)
Bir diziyi oluşturmak için içindeki veri türünü yazıp `[]` koyarız ve sonrasında ismini yazarız. Örneğin:
```java
int[] numbers;
String[] lines;
float[] floats;
```
## Değer Atama (Initialization)
Diziyi oluşturduktan sonra içine veri atmak için `new` operatörü kullanılır. Sonra da veri türü yazılıp `[]` içine o dizinin uzunluğu yazılır. Eğer hiçbir şey yazılmazsa dizi boştur ancak `[]`den sonra `{}` yazılıp içine elemanlar `,` ile ayrılmış şekilde yazılırsa elle bir dizi oluşturulur. Örneğin:
```java
int[] numbers = new int[3]; // 3 elemanlı boş bir array
int[] nums = new int[]{1, 2, 3, 6, 78}; // içinde veri olan array
String[] lines = new String[]{"hello", "world", "!"};
```
## Elemanları Çağırma (Accessing Elements)
Bir dizi oluşturduk ancak o dizinin n. elemanını istiyoruz. Bunu yapmak için dizimizi yazıp sağına `[]` içine elemanın sırasını yazıyoruz ancak şuna dikkat edilmelidir ki bilgisayarlar saymaya sıfırdan başlar.
```java
int[] numbers = new int[]{1, 2, 3, 4, 5};
numbers[0]; // 1 değerini döndürür
numbers[4]; // 5 değerini döndürür
String[] lines = new String[]{"hello", "world", "!"};
lines[0]; // hello değerini döndürür
lines[2]; // ! değerini döndürür
```
## Uzunluk (Length)
Bir dizinin uzunluğu vardır. Bunun için `length` özelliğini kullanırız. Örneğin:
```java
int[] nums = new int[5];
nums.length; // 5 değerini döndürür
String[] lines = new String[]{"hello", "world", "!"};
lines.length; // 3 değerini döndürür
// Bir dizinin son elemanını almak istiyorsak o dizinin uzunluğu - 1. elemanına bakmamız gerekir
lines[lines.length - 1] // son elemanı yani ! döndürür
```
## Birden Fazla Boyutlu Diziler (Multidimensional Arrays)
Bir dizi içinde bir dizi koymak istiyorsak bunu yaparız. Örneğin benim dizim `[1, 2, 3]` yerine `[[1,2], [3,4]]` şeklinde olsun diyorsak:
```java
int[][] nums = new int[2][3]; // ana dizide 2 alt dizi ve alt dizilerde 3 eleman
nums[0][0] = 1; // ilk dizinin ilk elemanını 1 yaptık
nums[0][1] = 2; // ilk dizinin 2. elamanını 2 yaptık
nums[1][0] = 3;
nums[1][1] = 4;
// Sonuç: nums = [ [1, 2], [3, 4] ]
```
İstersek köşeli parantez yani `[]` sayısını artırarak 3 boyuta hatta 4 boyuta çıkabiliriz. Aslında bu boyutların bir sonu yok istediğimiz kadar koyabiliriz.<br></br>
1 boyutlu dizileri ekrana yazdırmak için `Arrays.toString(array)` metodunu kullanabiliriz ancak bu metot için bir paket import etmemiz yani içeriye aktarmamız gerekir. Bunun için sınıfımızın üstüne `import` operatörünü kullanırız. Import etmemiz gereken modül `java.util.Arrays` modülüdür. İsterseniz `Arrays` yerine `*` işaretini koyup `java.util` içindeki her şeyi çekebilirsiniz.
```java
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] nums1d = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(nums1d)); // çıktı: [1, 2, 3]

        // NOT: >1 boyutlu dizilerde tek satırda atama yapılamaz yani {} simgesi kullanılamaz.
        int[][] nums2d = new int[2][3];
        nums2d[0][0] = 1;
        nums2d[0][1] = 2;
        nums2d[1][0] = 3;
        nums2d[1][1] = 4;
        System.out.println(Arrays.deepToString(nums2d)); // çıktı: [[1, 2], [3, 4]]
    }
}
```
## Yardımcı Birkaç Bilgi
Bunlar Java'da bir metotla yazılamayan bilgilerdir. Projelerinizde yardım edebilir.
### Bir Dizinin İlk Elemanını Silme
Bir dizinin ilk elemanını silmek kolay bir iş değildir. `System.arraycopy` metodunu kullanırız. Bu metot için yeni bir array gerekir. Bu işlem için:
```java
    String[] oldArr = new String[]{"hello", "world", "sa"};
    String[] newArr = new String[oldArr.length - 1];
    System.arraycopy(oldArr, 1, newArr, 0, newArr.length);
    // newArr = ["world", "sa"]
```
### Bir Dizinin Son Elemanını Silme
Bir dizinin son elemanını silmek için yine `System.arraycopy` kullanırız:
```java
    String[] oldArr = new String[]{"hello", "world", "sa"};
    String[] newArr = new String[oldArr.length - 1];
    System.arraycopy(oldArr, 0, newArr, 0, newArr.length);
    // newArr = ["hello", "world"]
```
### Bir Dizinin Belirli Bir Elemanını Silme
Bunun için `for` döngüsü kullanabiliriz veya ArrayList kullanarak da bu işi çözebiliriz ancak şu an `for` döngüsüyle işi çözelim:
```java
int index = 1; // 1. elemanı yani "world" elemanını silmek istiyoruz
String[] arr = new String[]{"hello", "world", "sa"};
String[] newArr = new String[arr.length - 1];
for (int i = 0; i < arr.length; i++) {
    if (i != index) {
        newArr[index] = arr[i];
        index++;
    }
}
```
Bu yöntem büyük diziler için kullanışlı değildir. Onun yerine array'imizi ArrayList'e dönüştürmek gerekebilir:
```java
String[] arr = new String[]{"hello", "world", "sa"};
ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
arrList.remove(1);
```