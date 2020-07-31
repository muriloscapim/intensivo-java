# Herança

Herança é um dos três princípios básicos da POO.

Com a herança, é possível criar uma classe geral que defina características comuns a um conjunto de itens relacionados.

Essa classe pode ser herdada por outras classes mais específicas, cada uma adicionando suas próprias características.

A classe que é herdada se chama **superclasse (classe base, pai, mãe).**

A classe que herda se chama **subclasse (filha, derivada).**

Uma subclasse é uma versão especializada da superclasse. Ela herda todas as características e comportamentos definidos pela superclasse e adiciona seus próprios elementos.

* Vantagens
    * Reuso (evita repetição de código)
    * Polimorfismo

* Sintaxe
    * class A **extends** B
    * A classe A herda dados e comportamentos da classe B.
    
* Relação "é um".

Herança permite o reuso de atributos e métodos.

![Captura de Tela 2020-07-29 às 16 08 21](https://user-images.githubusercontent.com/56240254/88927565-fb616400-d24d-11ea-958d-0b160880b8aa.png)

### Hierarquia de herança

![0-wrxNDC9_W8juLLyl](https://user-images.githubusercontent.com/56240254/89065127-94bd7280-d341-11ea-9842-e760e0484b43.png)

## Diagrama de classes da UML

Um diagrama de classes é uma representação da estrutura e relações das classes que servem de modelo para objetos.

A UML (Unified Modeling Language) é uma linguagem-padrão para a elaboração da estrutura de projetos de software.

No diagrama de classes da UML uma classe é representada por um retângulo com três divisões: o nome da classe, seus atributos e seus métodos.

Exemplo:

![notacao-de-diagrama-de-classe-3](https://user-images.githubusercontent.com/56240254/88921901-ade0f900-d245-11ea-9b51-5c9588e21ae3.jpg)

A visibilidade dos atributos e métodos é representado no digrama da seguinte forma:

Pública **(+)** qualquer classe pode acessá-lo

Privada **(-)** só a classe que o possui pode acessá-lo

Protegida **(#)** somente as classes e subclasses podem acessá-lo

Pacote **(˜)** todas as classes que pertencem ao pacote podem acessá-lo

## Generalização/Especialização

Generalização ou especialização representa a relação existente entre classes. Este relacionamento é conhecido na orientação a objetos como herança.

Exemplo:

![generalizacao-classe-diagrama](https://user-images.githubusercontent.com/56240254/88923193-b4707000-d247-11ea-987f-2a33d0528682.jpg)

Animal é uma generalização de Leão e Cavalo e Leão e Cavalo são especializações de Animal.

A generalização no diagrama de classes da UML possui como sintaxe uma seta com direção das classes específicas para a mais geral, ou seja, das subclasses para as superclasses.

## Software para modelagem UML

* Astah UML: https://astah.net/downloads/

![Class Diagram](https://user-images.githubusercontent.com/56240254/88927575-fdc3be00-d24d-11ea-85ab-0d8fde59dbd7.png)

Exemplo no IntelliJ

```java
public class Conta {

    private Integer numero;
    private String titular;
    //private Double saldo;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    /*
    O saldo não pode ser alterado livremente, para isso teremos
    os métodos de saque e deposito

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
     */

    public void saque(double valor) {
        saldo -= valor + 5.0;
    }

    public void deposito(double valor) {
        saldo += valor;
    }
}
```

```java
public class ContaPoupanca extends Conta {

    private Double juros;

    public ContaPoupanca() {
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double juros) {
        super(numero, titular, saldo);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public void atualizaSaldo() {
        saldo += saldo * juros;
    }
}
```

```java
public class Program {

    public static void main(String[] args) {

        Conta conta = new Conta(100,"Alex",1000.0);
        conta.saque(200.0);
        System.out.println(conta.getSaldo());

        // upcasting (casting da subclasse para a superclasse)
        // polimorfismo
        Conta conta2 = new ContaPoupanca(101, "Maria",1000.0,0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());
    }
}
```

## Construtores e herança

* Quando tanto a superclasse quanto a subclasse definem construtores (explicítos), os dois construtores devem ser executados.
> Uso da palavra-chave **super** do Java.

> A subclasse deve usar o super para executar o construtor da superclasse.

* O construtor da superclasse constrói a parte do objeto referente à superclasse e o construtor da subclasse constrói a parte da subclasse.

* Quando só a subclasse define um construtor, construímos apenas o objeto da subclasse. A parte do objeto referente à superclasse é construída automaticamente pelo construtor padrão (implícito).

O super é usado para chamar um construtor e acessar membros da superclasse.


# Sobreposição, palavra super, anotação @Override

## Sobreposição ou sobrescrita

É a implementação de um método de uma superclasse na subclasse.

É fortemente recomendável usar a anotação **@Override** em um método sobrescrito.
   * Facilita a leitura e compreensão do código
   * Avisamos ao compilador (boa prática)

Exemplo

Na classe Conta o método de saque contém uma taxa no valor de 5.00. A classe ContaPoupanca herda esse método, porém para uma conta poupança esta taxa não deve ser cobrada.

Solução: O método de saque deve ser sobrescrito na subclasse ContaPoupanca.

```java
public class ContaPoupanca extends Conta {

    private Double juros;

    public ContaPoupanca() {
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double juros) {
        super(numero, titular, saldo);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public void atualizaSaldo() {
        saldo += saldo * juros;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }
}
```

## Usando super para acessar membros da superclasse

Referencia a superclasse da subclasse em que é usado.

Essa aplicação tem a forma geral a seguir:

**super.membro**

É possível chamar a implementação de um método da superclasse usando a palavra super.

Exemplo

Na classe ContaEmpresa, a regra para saque é realizar o saque normalmente e descontar mais 2.0

```java
public class ContaEmpresa extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresa() {
    }

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            // descontada uma taxa de 10.0
            saldo += valor - 10.0;
        }
    }

    @Override
    public void saque(double valor) {
        super.saque(valor); // reutiliza código da superclasse
        saldo -= 2.0;
    }
}
```

```java
public class Program {

    public static void main(String[] args) {

        Conta conta = new Conta(100,"Alex",1000.0);
        conta.saque(200.0);
        System.out.println(conta.getSaldo());

        // upcasting
        Conta conta2 = new ContaPoupanca(101, "Maria",1000.0,0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaEmpresa(102,"Bob",1000.0,500.0);
        conta3.saque(200.0);
        System.out.println(conta3.getSaldo());
    }
}
```
### Exemplo 2

```java
public class Animal {
    private String nome;
    private int idade;

    public void emitirSom()
    {
        System.out.println("Animal emitindo som...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

```java
public class Cachoro extends Animal {

    public void correr()
    {
        System.out.println("Cachorro correndo!");
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("AU AU AU!");
    }
}
```

```java
public class Cavalo extends Animal {

    public void correr()
    {
        System.out.println("Cavalo correndo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("IRRRRIINN!");
    }
}
```

```java
public class Preguica extends Animal {

    public void subirArvore()
    {
        System.out.println("Preguiça subindo em arvores!");
    }

    @Override
    public void emitirSom() {
        System.out.println("AAAAAHHHHZZZZZ!");
    }
}
```

```java
public class TestaAnimal {

    public static void main(String[] args) {

        Animal animal = new Cachoro();
        animal.setNome("Rex");
        animal.setIdade(2);
        ((Cachoro) animal).correr(); // downcasting
        animal.emitirSom();
    }
}
```

### Exemplo 3

```java
public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Os funcionários comuns recebem 10% do valor
    // do salário de bonificação
    public double getBonificacao() {
        return this.salario * 0.10;
    }
}
```

```java
public class Gerente extends Funcionario {

    private int nroFuncGerenciados;
}
```

A classe Gerente herda o método getBonificação, porém gerentes recebem 15% de bonificação.

No Java, quando herdamos um método, podemos alterar seu comportamento. **Sobrescrevendo este método.**

```java
public class Gerente extends Funcionario {

    private int nroFuncGerenciados;

    @Override
    public double getBonificacao() {
        return this.salario * 0.15; // Erro! salario é private
    }
}
```

Deixamos explícito no código que o método foi sobrescrito da sua classe mãe. Fazemos isso colocando a anotação **@Override** em cima do método.

Imagine que o cálculo da bonificação do gerente fosse igual ao cálculo da bonificação do funcionário porém adicionando R$ 1000.

O método getBonificacao da classe Gerente poder chamar o metodo getBonificacao da classe funcionario utilizando a palavra chave **super**.

```java
public class Gerente extends Funcionario {

    private int nroFuncGerenciados;

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("João");
        gerente.setSalario(5000.0);
        System.out.println(gerente.getBonificacao());
    }
}
```

## Polimorfismo

O que guarda uma variável do tipo Funcionário? Uma referência para um objeto Funcionario, nunca o objeto em si.

Na herança, vimos que todo Gerente **é um** Funcionário, pois é uma extensão.

Podemos nos referir a um Gerente como sendo um Funcionario.

**Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.**

```java
Funcionario func = new Gerente();
func.setNome("Bob");
func.setSalario(5000.0);
func.getBonificacao(); // executa da classe Gerente
```

No Java a invocação de método será **decidida em tempo de execução**.

```java
public class ControleDeBonificacoes {

    private double totalDeBonificacoes;

    public void registra(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente gerente = new Gerente();
        gerente.setSalario(5000.0);
        controle.registra(gerente);

        Funcionario func = new Funcionario();
        func.setSalario(1000.0);
        controle.registra(func);

        System.out.println(controle.getTotalDeBonificacoes());
    }
}
```
Passamos um objeto Gerente para um método que recebe objetos Funcionario. Gerente **é um** Funcionario.
