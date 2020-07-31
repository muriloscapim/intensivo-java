# Tipos de dados e operadores

Java é uma linguagem fortemente tipada.

Em uma linguagem fortemente tipada os seus objetos/variáveis tem um tipo bem definido e precisa ser informado em sua declaração.

Exemplo de linguagem que não é fortemente tipada: PHP, JavaScript.

Em JavaScript não é preciso definir o tipo das variáveis ao declará-las, pode ser alterado dinamicamente.

```javascript
var fruta = "Banana";
```
Já em Java:
```java
String fruta = "Banana";
```

# Tipos primitivos da linguagem Java

O Java possui dois tipos de dados que são dividos tipos em por valor (tipos primitivos) e tipos por referência.

Java contém dois tipos de dados: orientados a objetos e não orientados a objetos.

Os tipos orientados a objetos são definidos por classes.

Tipos de dados primitivos não são objetos.

Tipos de dados primitivos em Java

| Tipo | Significado |
| - | - |
|boolean | Representa os valores verdadeiro/falso |
| byte | Inteiro de 8 bits |
| char | Caractere |
| double | Ponto flutuante de precisão dupla |
| float | Ponto flutuante de precisão simples |
| int | Inteiro |
| long | Inteiro longo |
| short | Inteiro curto |

Java especifica um intervalo e um comportamento para cada tipo primitivo que todas as implementações da JVM devem suportar. (portabilidade)

## Inteiros

Java define quatro tipos inteiros: **byte, short, int e long**.

| Tipo | Tamanho em bits | Intervalo |
| - | - | - |
| byte | 8 | -128 a 127 |
| short | 16 | -32.768 a 32.767 |
| int | 32 | -2.147.483.648 a 2.147.483.647 |
| long | 64 | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |

O tipo inteiro mais usado é o int. Quando precisar de um inteiro com intervalo maior, use o long.

## Ponto flutuante

Os tipos de ponto flutuante podem armazenar números com componentes fracionários.

Há dois tipos de ponto flutuante, **float** e **double** que armazenam números de precisão simples e dupla, respectivamente.

O tipo float tem 32 bits e o tipo double tem 64 bits.

## Caracteres

Uma variável de caractere pode receber um valor com o caractere entre aspas simples.

```java
char ch;
ch = 'x';
```

Char é um tipo de 16 bits sem sinal (não representa valores negativos).

Um tipo númerico com sinal é subconjunto dos inteiros (números positivos e negativos), enquanto sem sinal é subconjunto dos naturais (números inteiros positivos (não-negativos)).

```java
public class Main {
    public static void main(String[] args) {

        char ch = 'x';

        ch++; // um char pode ser incrementado
        System.out.println(ch);

        ch = 90; // um char pode receber um valor inteiro
        System.out.println(ch); // valor ASCII da letra z
    }
}
```
## Booleano

O tipo **boolean** representa os valores verdadeiro/falso. Java usa as palavras reservadas true e false.

# Strings

Um string é uma cadeia de caracteres.

Em Java, strings são objetos, da classe String.

Maneiras de criar um objeto String chamado str que contém um string de caracteres.

String str = new String("Hello");

String str = "Java strings are powerful.";

## Operando com strings

A classe **String** contém vários métodos que operam com strings.

|||
|-|-|
| boolean **equals(str)** | Retorna verdadeiro se o string chamador tiver a mesma sequência de caracteres de str. |
| int **length()** | Obtém o tamanho de um string. |
| char **charAt(index)** | Obtém o caractere do índice especificado por index. |
| int **compareTo(str)** | Retorna menor do que zero se o string chamador for menor do que str, maior do que zero se o string chamador for maior do que str e zero se os strings forem iguais. |
| int **indexOf(str)** | Procura no string chamador o substring especificado por str. Retorna o índice da primeira ocorrência ou -1 em caso de falha. |
| int **lastIndexOf(str)** | Procura no string chamador o substring especificado por str. Retorna o índice da última ocorrência ou -1 em caso de falha. |

```Java
public class StringDemo {

    public static void main(String[] args) {

        String str = "abcde FGHIJ ABC abc DEFG    ";

        System.out.println(str.equals("abcde"));
        System.out.println("Tamanho do string: " + str.length());
        System.out.println("Caractere do índice: " + str.charAt(4));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim()); // remove espaços dos cantos
        System.out.println(str.substring(2)); // gera uma nova string a partir do caractere c
        System.out.println(str.substring(2,9)); // gera uma nova string de c até H
        System.out.println(str.replace('a','x'));
        System.out.println(str.replace("abc","y"));
        System.out.println(str.indexOf("bc")); // primeira posição do substring bc
        System.out.println(str.lastIndexOf("bc")); // última ocorrência

        String s = "batata maçã limão";

        // separa a string e joga cada palavra em um vetor
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
```

O conteúdo de um objeto **String** após ser criado não pode ser alterado. (imutável)
Se você precisar de um string que seja a variação de outro já existente, terá de criar um novo string.

# Variáveis

As variáveis são declaradas com uso da seguinte forma de instrução:

*tipo nome-var;*

Para atribuir um valor a uma variável por uma instrução de atribuição:

```java
int count = 10;
char ch = 'x';
float f = 5.75f;
```
# Escopo de variáveis

O Java permite que as variáveis sejam declaradas dentro de qualquer bloco de código.

* Um bloco começa com uma chave de abertura e termina com uma chave de fechamento.

> **O bloco define um escopo**.

Um escopo determina que objetos estarão visíveis para outras partes do programa.

Os escopos mais importantes em Java são os definidos por uma classe e por um método.

O escopo definido por um método começa com sua chave de abertura. Se tiver parâmetros, eles também fazem parte do escopo do método.

**As variáveis declaradas dentro de um escopo não podem ser acessadas fora desse escopo.**

Os escopos podem ser aninhados. Se você criar um bloco de código, **o escopo externo engloba o escopo interno.**

Ou seja, os objetos declarados no escopo externo podem ser acessados dentro do escopo interno.

No entanto, o inverso não é verdadeiro. Objetos declarados dentro do escopo interno não podem ser acessados fora dele.

* Exemplo no IntelliJ

```java
class ScopeDemo {
    public static void main(String args[]) {
        int x;
        x = 10;

        if (x == 10){ // inicia um novo escopo
            
            int y = 20; // conhecida apenas nesse bloco

            // tanto x quanto y são conhecidas aqui
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        y = 100; // Erro! y está fora do seu escopo

        // x é conhecida aqui
        System.out.println("x is " + x);
    }
}
```
# Operadores

Um operador é um símbolo que solicita ao compilador que execute uma operação matemática ou lógica.
Java tem os operadores aritméticos, bitwise, relacionais e lógicos.

## Operadores aritméticos

Java define os operadores aritméticos:

| Operador | Significado |
| - | - |
| + | Adição |
| - | Subtração |
| * | Multiplicação |
| / | Divisão |
| % | Módulo |
| ++ | Incremento |
| -- | Decremento |

## Incremento e decremento

O operador de incremento adiciona 1 a seu operando e o de decremento subtrai 1.

Exemplo:

x = x + 1 é o mesmo que x++

x = x - 1 é o mesmo que x--

Tanto o operador de incremento quanto o de decremento podem preceder ou vir após o operando.

Exemplo: x = x + 1 pode ser escrito como ++x (pré-fixo) ou como x++ (pós-fixo)

:point_right: Quando um operador de incremento ou decremento precede seu operando, é executada a operação correspondente antes de obter o valor do operando.

Se o operador vier após o seu operando, será obtido o valor do operando antes de ser incrementado ou decrementado.

```java
public class IncDecDemo {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = ++x; // incrementa depois atribui
        System.out.println(y);

        x = 10;
        y = x++; // atribui depois incrementa
        System.out.println(y);
    }
}
```
## Operadores relacionais e lógicos

### Operadores relacionais

| Operador | Significado |
|-|-|
| == | Igual a |
| != | Diferente de |
| > | Maior que |
| < | Menor que |
| >= | Maior ou igual a |
| <= | Menor ou igual a |

### Operadores lógicos

| Operador | Significado |
|-|-|
| & | AND |
| I | OR |
| ˆ | XOR (exclusive OR) |
| II | OR de curto-circuito |
| && | AND de curto-circuito |
| ! | NOT |

O resultado dos operadores relacionais e lógicos é um valor boolean.

### Tabela verdade

| p | q | p & q | p I q | p ^ q | !p |
| - | - | - | - | - | - |
| Falso | Falso | Falso | Falso | Falso | Verdadeiro |
| Verdadeiro | Falso | Falso | Verdadeiro | Verdadeiro | Falso |
| Falso | Verdadeiro | Falso | Verdadeiro | Verdadeiro | Verdadeiro |
| Verdadeiro | Verdadeiro | Verdadeiro | Verdadeiro | Falso | Falso |

### Operadores lógicos de curto-circuito

Os operadores **&&** e **||** param de analisar a expressão assim que percebem que não ocorrerá mudança no resultado.

Em uma operação AND, se o primeiro operando for falso, o resultado será falso não importando o valor do segundo operando.

Em uma operação OR, se o primeiro operando for verdadeiro, o resultado da operação será verdadeiro.

Nesses casos não há necessidade de avaliar o segundo operando.

Economizamos tempo e um código mais eficiente é produzido.

Seus equivalentes & e | sempre avaliam cada operando, a versão de curto-circuito && e || só avalia o segundo operando quando necessário.

* Exemplo no IntelliJ

```java
public class OperatorsDemo {

    public static void main(String[] args) {

        int x = 5;
        int y = 3;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);

        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 4);
        System.out.println(!(x > 3 && x < 10));
    }
}
```

# Atribuições abreviadas

Java fornece operadores de atribuição abreviada que simplificam a codificação de certas instruções de atribuição.

x = x + 10;

Com o uso da atribuição abreviada:

x += 10;

A instrução x = x - 100 é igual a:

x -= 100;

### Operadores aritméticos e lógicos de atribuição abreviada

|||||
| - | - | - | - |
| += | -= | *= | /= |
| %= | &= | I= | ˆ= |

# Conversão de tipos

Em programação, é comum atribuir um tipo de variável a outro tipo. Ex: atribuir um valor int a uma variável float.

```java
int i;
float f;

i = 10;
f = i; // assign an int to a float
```
Nem todos os tipos são compatíveis e nem todas as conversões de tipos são automáticas.

As conversões de tipos automáticas não atendem todas as necessidades de programação, pois só se aplicam a conversões onde os dois tipos são compatíveis e o tipo de destino for maior que o de origem.

Nos outros casos devemos fazer um **cast**.

O cast é uma instrução dada ao compilador para a conversão de um tipo em outro. Uma conversão de tipos explícita.

Exemplo, converter o tipo do resultado da expressão x/y que é double para int.

```java
double x, y;

(int) (x / y) 
```
>Os parênteses que delimitam x/y são necessários. Senão o cast para int só seria aplicado a x e não ao resultado da divisão.

>O cast explicíto é necessário pois não há conversão automática de double para int.

>Por exemplo, no cast de um long para um short, informações serão perdidas se o valor de tipo long for maior do que o intervalo do tipo short.

:point_right: Quando um valor de ponto flutuante é convertido para um tipo inteiro, a parte fracionária é truncada.

Exemplo de cast no IntelliJ

```java
public class CastDemo {
    public static void main(String[] args) {
        double x, y, d;
        long l;
        byte b;
        int i;
        char ch;

        l = 100123285L;
        d = l; // conversão automática de long para double

        d = 100123285.0;
        l = d; // Erro! Não há conversão automática de double para long
        l = (long) d;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // converte double em int, trunca casas decimais
        System.out.println(i);

        i = 100;
        b = (byte) i; // Um byte pode conter o valor 100
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // Um byte não pode conter o valor 257
        System.out.println("Value of b: " + b);

        b = 88; // ASCII para X
        ch = (char) b; // Cast entre tipos incompatíveis
        System.out.println("ch: " + ch);
    }
}
```

# Precedência de operadores

![Captura de Tela 2020-07-27 às 14 15 47](https://user-images.githubusercontent.com/56240254/88571290-ccf84480-d013-11ea-9545-44ab52f21c23.png)

# Instruções de controle

Instruções que controlam o fluxo de execução do programa: instruções de seleção: if e switch; instruções de iteração: que são os laços for, while e do-while; instruções de salto: break, continue e return.

## If/else

```java
if (condição)
{
    sequência de instruções
}
else 
{
    sequência de instruções
}
```

Se a expressão condicional for verdadeira, o bloco do if será executado, caso contrário, se houver, o else será executado. Nunca ambos serão executados.

A expressão condicional tem um resultado boolean.

## if-else-if

```java
if (condição)
{
    instrução;
} 
else if (condição)
{
    instrução;
}
else if (condição)
{
    instrução;
} 
else
{
    instrução;
}
```

As expressões condicionais são avaliadas de cima para baixo.

Assim que uma condição verdadeira é encontrada, a instrução associada a ele é executada e o resto da escada é ignorado.

Se nenhuma das condições for verdadeira, a instrução else é executada.

## Switch

A instrução switch fornece uma ramificação com vários caminhos. O programa faz uma seleção entre várias alternativas.

O valor de uma expressão é verificado sucessivamente em uma lista de constantes.

Quando uma ocorrência é encontrada, a sequência de instruções é executada.

```java
switch(expressão)
{
    case constante1:
        sequência de instruções;
        break;
    case constante2:
        sequência de instruções;
        break;
    case constante3:
        sequência de instruções;
        break;
    default:
        sequência de instruções;
}
```

Se nenhuma instrução case for correspondente, a instrução default é executada.

A instrução **break** faz o fluxo sair da instrução switch.

A instrução executará o próximo case se não houver uma instrução break.

## Instruções switch aninhadas

```java
switch(ch1)
{
    case 'A':
        switch(ch2)
        {
            case 'A':
                instruções;
                break;
            case 'B':
                instruções;
                break;
        } // fim do switch interno
    break;
    case 'B':
        instruções;
        break;
}
```

## Laço for

```java
for (inicialização; condição; iteração)
{
    sequência de instruções;
}
```

Inicialização é uma instrução de atribuição que configura o valor inicial da *variável de controle do laço*, contador que controla o laço.

A condição é uma expressão booleana que determina se o laço será ou não repetido.

A expressão de iteração define o valor da variável de controle do laço, sempre que o laço for repetido.

**O laço for continuará sendo executado enquanto a condição for verdadeira.**

**Quando a instrução for falsa, o laço terminará e a execução passará para a instrução posterior a ele.**

## Laço while

```java
while (condição)
{
    sequência de instruções;
}
```

**O laço se repete *enquanto* a condição é verdadeira.**

Quando a condição se torna falsa, a execução passará para a instrução posterior ao laço.

Precisamos fazer com que a condição se torne falsa, para não criar um laço infinito.

## Laço do-while

Os laços for e while testam a condição no início do laço, **o laço do-while verifica sua condiçao no fim do laço.**

**Um laço do-while será sempre executado pelo menos uma vez.**

```java
do 
{
    sequência de instruções;
} while (condição);
```

## Break

É possível interromper a execução de um laço com o uso da instrução break.

Quando uma instrução break é atingida, o laço é encerrado e o controle do programa passa para as instruções posteriores ao laço.

```java
public class MyClass {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }  
  }
}
```

## Continue

A instrução continue desvia a execução atual do laço para a próxima iteração.

```java
public class MyClass {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }  
  }
}
```
