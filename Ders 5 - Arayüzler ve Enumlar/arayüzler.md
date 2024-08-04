# Arayüzler (Interface Data Types)
Java'da sınıflar yerine `interface` yazarak bir arayüz oluştururuz. Bu arayüzler, örnek sınıf niteliğindedir. Farzımisal elimizde bir metot olsun ancak bu metot birden fazla sınıfta da bulunmalı yani sürekli yeni bir sınıf oluşturduğumuzda içini doldurmamız gerekicek. Örneğin bir komut yöneticisi yaparken bu işimize yarar. Daha optimize çalışır program.
```java
public interface Command {
    public void onCommand(String[] args);
}
```
Burda `Command` örnek sınıftır yani diğer sınıflar bundan kalıtım alabilir. Mesela **help** ve **about** isminde komutlarımız olsun ve bunların sınıfları `HelpCmd.java` ve `AboutCmd.java` olsun. Bu sınıflarda teker teker onCommand(...) yazıp main sınıfımızda şuysa şu şeklinde yazmak yerine bütün bunları temsil eden bir sınıf bulunur ve bu da örnek sınıf yani arayüzdür. Peki bu sınıfları nasıl örnek sınıfımıza bağlayacağız? Bunun için ya `implements` ya da `extends` operatörleri kullanılır. Örneğin:<br></br>
HelpCmd.java:
```java
public class HelpCmd implements Command {
    @Overrride
    public static void onCommand(String[] args) {
        System.out.println("sa");
    }
}
```
Main.java:
```java
public class Main {
    private static HashMap<String, Command> commands;
    public static void main(String[] args) {
        registerCommands();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] ss = s.split(" ");
        String[] arguments = new String[ss.length - 1];
        System.arraycopy(ss, 1, arguments, 0, arguments.length);
        executeCommand(cmdName, arguments);
        // eğer kullanıcı help yazmışsa ekranda "sa" yazacak
    }

    public static void executeCommand(String cmd, String[] args) {
        commands.get(cmd).onCommand(args);
    }

    public static void registerCommands() {
        commands.put("help", new HelpCmd());
        commands.put("about", new AboutCmd());
    }
}
```
Burda `@Override` notu üstüne yazmayı ifade eder. Yani aslında bellekte tek bir `onCommand` vardır ve bu sürekli değişir.<br></br>
## Implements ve Extends Farkı
`implements` ile `extends` arası farklarda `implements` operatörü bir `interface` ile kullanılırken `extends` operatörü bir sınıfı diğerine bağlamaz, aralarında ilişkilendirir. İlişki kurduğumuz asıl sınıfa `superclass` denir ve onun içindeki tüm her şeyi bunun içinde toplar. Yani o `superclass` sınıfını direkt içeriye import eder ve bu ikisi dışında bir sınıfta eğer erişim varsa `extends` yazdığımız sınıfın içine `superclass`ın metotları kullanılabilir. Ayrıca `implements` ile sadece 1 sınıf kullanılabilirken `extends` ile sınırsız sınıf kullanılabilir.<br></br>
```java
public class Superclass {
    public int topla(int a, int b) {
        return a + b;
    }
    public void sayHello() {
        System.out.println("hello");
    }
}
public class SubClass extends Superclass {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    } // istersek implement edebiliriz
}
```
Başka bir sınıfta:
```java
public class OtherClass {
    public static void main(String[] args) {
        SubClass subclass = new SubClass();
        subclass.topla(1, 2); // sonucu üçtür
        subclass.sayHello(); // ekrana hello world yazdırır
    } // göründüğü üzere SubClass içinde hiç topla() diye metot olmamasına rağmen extends sayesinde diğer sınıftaki her şeyi kullanabiliyoruz
}
```