# Classes, objetos e métodos

## Classe

* Define a natureza de um objeto, forma a base da programação orientada a objetos.

* **Uma classe é um modelo (molde) que especifica como construir um objeto.**

* Os objetos são **instâncias** de uma classe.

![1 Zo0lQGpe1tkBjtbQg4iDpQ](https://user-images.githubusercontent.com/56240254/88703970-cf29d400-d0e3-11ea-88c0-aea7454b431b.png)

![oopcar-300x210](https://user-images.githubusercontent.com/56240254/88704011-dc46c300-d0e3-11ea-87fb-cba3b67551e8.png)

![Sem Título 15 06 18](https://user-images.githubusercontent.com/56240254/88704144-11ebac00-d0e4-11ea-8d27-d1b4e4822498.png)



* Uma classe é uma abstração lógica. Só quando um objeto dessa classe é criado é que existe uma representação física dela na memória.

* Os métodos e variáveis que compõem uma classe são chamados de **membros da classe**.

* Quando criamos uma classe especificamos as variáveis de instância e os métodos.

* Uma classe é criada com uso da palavra-chave **class**.

```java
public class Veiculo {
    int passageiros;
    double combustivel; // capacidade máxima no tanque
    double consumo; // consumo em Km/L
}
```
* Uma definição de classe cria um novo tipo de dado. Nesse caso, Veiculo.

* Para criar um objeto do tipo Veiculo, usamos a instrução:

```java
// cria um objeto do tipo Veiculo chamado carro
Veiculo carro = new Veiculo();
```

* carro é uma **instância** de Veiculo.

* Essa instrução declara uma variável chamada carro do tipo Veiculo, depois é criado um objeto e atribuido à carro uma referência a ele.

> O operador **new** aloca dinamicamente (no tempo de execução) memória para um objeto e retorna uma referência a ele (endereço do objeto na memória).

* Sempre ao criar uma instância de uma classe, o objeto conterá as variáveis e métodos da classe.

* Para acessar essas variáveis, usamos o operador ponto (.). O operador ponto vincula o nome de um objeto ao nome de um membro (variáveis e métodos).

* A forma geral do operador ponto é:

*objeto.membro*

```java
carro.combustivel = 50.0;
```

```java
public class VeiculoDemo {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        double autonomia;

        carro.passageiros = 5;
        carro.combustivel = 50.0;
        carro.consumo = 10.0; // Km/L

        autonomia = carro.consumo * carro.combustivel;
        System.out.println("Capacidade de passageiros: " + carro.passageiros + " Autonomia: " + autonomia);
    }
}
```

## Métodos

* Um método tem um nome que é usado para chamá-lo.
* Tem parênteses após seu nome. Ex: getval().
* Não usar palavras reservadas do Java para nomear métodos.
* Os métodos de uma classe tratam e dão acesso aos dados da classe.

* A estrutura de um método é:

![Captura de Tela 2020-07-27 às 12 09 01](https://user-images.githubusercontent.com/56240254/88558598-222b5a80-d002-11ea-916d-55132307efb9.png)

* *tipo de retorno* especifica o tipo de dado retornado pelo método.
    * Qualquer tipo válido, inclusive os tipos de classe que criamos (Ex: Veiculo).
    * Se o método não retornar um valor, seu tipo de retorno deve ser **void**.

* *lista de parâmetros (argumentos)* é uma sequência de pares separados por vírgula compostos por tipo e identificador. Passados para o método quando ele é chamado.
    * Se o método não tiver parâmetros, a lista estará vazia.

### Adicionando métodos à classe Veiculo

```java
public class Veiculo {
    int passageiros;
    double combustivel; // capacidade máxima no tanque
    double consumo; // consumo em Km/L

    void autonomia() {
        System.out.println("Autonomia do veículo: " + consumo * combustivel);
    }
}
```
```java
public class VeiculoDemo {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.passageiros = 5;
        carro.combustivel = 50.0;
        carro.consumo = 10.0; // Km/L

        // chama o método autonomia() do objeto carro
        carro.autonomia();
    }
}
```

### Retorno de um método

```java
double autonomia() {
    return consumo * combustivel;
}
```

```java
public static void main(String[] args) {
    Veiculo carro = new Veiculo();
    carro.passageiros = 5;
    carro.combustivel = 50.0;
    carro.consumo = 10.0; // Km/L

    System.out.println("Autonomia do veículo: " + carro.autonomia());
}
```

### Adicionando um método parametrizado a Veiculo

Podemos passar um ou mais valores para um método quando ele é chamado.

Um valor passado para um método se chama *argumento*.

A variável que recebe o argumento se chama *parâmetro*.

Os parâmetros são declarados dentro dos parênteses que vêm após o nome do método.

A sintaxe de declaração de parâmetros é a mesma usada para variáveis.

**Um parâmetro faz parte do escopo de seu método.**

```java
// combustível necessário para percorrer uma certa distância
    double calculaCombustivel(double distancia) {
        return distancia / consumo;
    }
```

```java
public class VeiculoDemo {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.passageiros = 5;
        carro.combustivel = 50.0;
        carro.consumo = 10.0; // Km/L

        System.out.println("Autonomia do veículo: " + carro.autonomia());
        System.out.println("Combustível necessário: " + carro.calculaCombustivel(200.0));
    }
}
```

## Construtores

* Um construtor inicializa um objeto quando ele é criado.
* Tem o mesmo nome da classe e é sintaticamente semelhante a um método.
* Não tem um tipo de retorno explicíto.
* Usamos um construtor para iniciar as variáveis de instância definida pela classe ou executar algum outro procedimento de inicialização.

* Todas as classes têm construtores, mesmo quando não definimos um.

* O Java possui um construtor padrão que inicializa todas as variáveis com seus valores padrão. (zero, null e false, para tipos numéricos, tipos de referência e booleanos, respectivamente).

* Quando definimos nosso próprio construtor, o construtor padrão não é mais usado.

* Exemplo de construtor:
```java
public class MyClass {
    int x;

    public MyClass() {
        x = 10;
    }
}
```

```java
public class ConsDemo {
    public static void main(String args[]) {
        MyClass myObj = new MyClass(); // This will call the constructor
        System.out.println(myObj.x);
    }
}
```
### Construtores parametrizados

* Construtores também podem receber parâmetros, que são usados para iniciar atributos.

* Os parâmetros são adicionados a um construtor da mesma forma que são adicionados a um método.

```java
public class MyClass {
    int x;

    public MyClass(int i) {
        x = i;
    }
}
```

```java
public class ConstDemo {
    public static void main(String args[]) {
        MyClass myObj = new MyClass(5);
        System.out.println(myObj.x);
    }
}

// Outputs 5
```
* Exemplo no IntelliJ

```java
public class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }
}
```

```java
public class ConstDemo {
    public static void main(String args[]) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

// Outputs 1969 Mustang
```

> Adicione um construtor à classe Veiculo.

## This

* A palavra-chave this refere-se ao objeto atual em um método ou construtor.

* Quando um método é chamado, ele recebe um argumento implícito, que é uma referência ao objeto chamador. Essa referência se chama this.

* A sintaxe Java permite que o nome de um paramêtro ou de uma variável local seja igual ao nome de uma variável de instância.

* O uso mais comum da palavra-chave this é eliminar a confusão entre atributos de classe e parâmetros com o mesmo nome.

```java
public class MyClass {
    int x;

    // Constructor with a parameter
    public MyClass(int x) {
        this.x = x;
    }
}
```

```java
public class Example {
    public static void main(String args[]){
        // Call the constructor
        MyClass myObj = new MyClass(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
```

## Coleta de lixo

A alocação de objetos se dá dinamicamente a partir de uma quantidade de memória livre com o uso do operador new.

Um componente de qualquer esquema de alocação dinâmica é a recuperação de memória livre de objetos não usados, com a disponibilização dessa memória para realocações subsequentes.

O Java usa a coleta de lixo (garbage collector).

Ocorre de maneira transparente, sem nenhuma intervenção do programador.

Quando não existe nenhuma referência a um objeto, a memória ocupada é liberada.
