## Modificadores de acesso da linguagem Java

* O controle de acesso a membros é obtido com o uso de três **modificadores de acesso: public, private e protected.**

* Se nenhum modificador de acesso for especificado é usado o **default**. É igual a public, porém o código somente pode ser acessado no mesmo pacote.

* Quando um membro de uma classe é **public**, esse pode ser acessado por qualquer código do programa.

* Quando é **private**, ele só pode ser acessado por outros membros de sua classe.

* O modificador **protected** é aplicado quando há herança. O código é acessível no mesmo pacote e nas subclasses.

```java
class Modifiers {
    private int alpha; // acesso privado
    public int beta; // acesso público
    int gamma; // acesso padrão

    void setAlpha(int a) {
        alpha = a; // como alpha é private pode ser acessado pela própria classe
    }

    int getAlpha() {
        return alpha;
    }
}
```

```java
class ModifiersDemo {
    public static void main(String args[]) {
        Modifiers ob = new Modifiers();

        /* O acesso a alpha só é permitido através de seus métodos acessores */
        ob.setAlpha(10);
        System.out.println("ob.alpha is " + ob.getAlpha());

        ob.alpha = 10; // Errado!

        ob.beta = 88;
        ob.gamma = 99; // Certo! esses membros são públicos
    }
}
```

* Membros privados não podem ser acessados por códigos de fora de sua classe.

* Deve ser acessado por intermédio de seus **métodos acessores públicos** set e get.

## Encapsulamento

* Encapsulamento vem de encapsular, que significa isolar, esconder.
* O encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe.
* É uma forma eficiente de proteger os dados de uma classe.

## Sobrecarga de métodos

* Em Java, dois os mais métodos da mesma classe podem ter o mesmo nome, desde que suas declarações de parâmetros sejam diferentes.

* Quando esse é o caso, diz-se que os métodos são sobrecarregados e é chamado de sobrecarga de métodos.

* Uma das maneiras pelas quais o Java implementa o polimorfismo.

* Para sobrecarregar um método, temos que declarar versões diferentes dele. O tipo e/ou a quantidade dos parâmetros de cada método sobrecarregado devem ser diferentes.

* Os métodos sobrecarregados podem ter tipos de retorno diferentes.

* *Quando um método sobrecarregado é chamado, sua versão cujos parâmetros coincidem com os argumentos é executada.*

* Exemplo no IntelliJ

```java
class Overload {

    void ovlDemo() {
        System.out.println("No parameters");
    }

    void ovlDemo(int a) {
        System.out.printl("One parameter: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
}
```
```java
class OverloadDemo {
    public static void main(String args[]) {
        Overload obj = new Overload();
        obj.ovlDemo();
        obj.ovlDemo(2);
        System.out.println("Result " + obj.ovlDemo(4,6));
        System.out.println("Result " + obj.ovlDemo(1.1,2.32));
    }
}
```

> Dois métodos da mesma classe não podem ter a mesma assinatura.

> Uma assinatura é o nome de um método mais sua lista de parâmetros. Não inclui o tipo de retorno.

## Sobrecarga de construtores

* Os construtores também podem ser sobrecarregados.
* Isso permite a construção de objetos de várias maneiras.

```java
class MyClass {
    int x;

    MyClass() {
        System.out.println("Inside MyClass()");
        x = 0;
    }

    MyClass(int i) {
        System.out.println("Inside MyClass(int)");
        x = i;
    }

    MyClass(double d) {
        System.out.println("Inside MyClass(double)");
        x = (int) d;
    }

    MyClass(int i, int j) {
        System.out.println("Inside MyClass(int, int)");
        x = i * j;
    }
}
```
```java
class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(88);
        MyClass obj3 = new MyClass(17.23);
        MyClass obj4 = new MyClass(2,4);

        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj3.x);
        System.out.println(obj4.x);
    }
}
```

> O construtor apropriado é chamado de acordo com os parâmetros especificados quando a instrução new é executada.

> Ao sobrecarregar o construtor, damos ao usuário da classe flexibilidade na maneira como os objetos são construídos.

## Membros estáticos

* Normalmente, um membro de uma classe é acessado por intermédio de um objeto.

* Podemos definir um membro de uma classe para ser usado independentemente de qualquer objeto dessa classe.

* Para isso, antes da declaração do membro colocamos a palavra-chave **static**.

* Quando um membro (variáveis e métodos) é static, pode ser acessado sem ser criado um objeto de sua classe.

* Para usar um membro static, especificamos o nome de sua classe seguido pelo operador ponto.

> Exemplo: Atribuir o valor 10 a uma variável static chamada count pertencente à classe Timer.

```java
Timer.count = 10;
```

> Um método static pode ser chamado da mesma forma.

* Exemplo no IntelliJ

```java
public class StaticMethod {

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
```
```java
public class StaticMethodDemo {
    public static void main(String[] args) {
        StaticMethod.myStaticMethod(); // Call the static method

        StaticMethod myObj = new StaticMethod();
        myObj.myPublicMethod();
    }
}
```
* Exemplo

A classe Math do Java

```java
Math.sqrt();
```
