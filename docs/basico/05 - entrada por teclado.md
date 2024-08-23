# Indices

<!-- TOC -->
* [Indices](#indices)
* [Entrada por teclado](#entrada-por-teclado)
  * [Importando Scanner](#importando-scanner)
  * [Criando um Scanner](#criando-um-scanner)
  * [Entrando com um dado:](#entrando-com-um-dado)
<!-- TOC -->

# Entrada por teclado
<img height="250" src="../resources/cat-keyboard.gif" width="250"/>

Para isso usamos uma classe utilitaria do proprio Java, chamada `Scanner`
Ou seja, instanciamos um objeto do tipo `Scanner`

> Veja mais, sobre Objetos em: [Programação Orientada a Objetos]()

## Importando Scanner
- A primeira coisa que precisamos fazer é importar a classe `Scanner` no nosso arquivo:
```java
// Isso deve estar no começo do arquivo 
import java.util.Scanner;
```

## Criando um Scanner
- Depois vamos criar um objeto do tipo Scanner:
  - Usamos o `System.in` dentro dos parenteses do `new Scanner()` para indicar que é para ler a entrada do teclado
```java
public class EntradaTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    }
}
```

## Entrando com um dado:
- Chamamos determinado metodo do objeto Scanner criado, existem diversos metodo para ler um dado, e eles variam por causa do seu tipo (principalmente), já que existe tanto metodos para obter um int, float, double, etc
  - Como ao usar apenas o `entrada.nextInt()` não exibe mensagem nenhuma e o usuario não vai saber o que fazer, usamo o print para exibir o que o usuario deve fazer
  - O `nextInt()` vai pegar o proximo inteiro que ele encontrar ao usuario digitar
    - Para usar esse valor inteiro que é pego por ele, precisamos armazenar em uma variavel
```java
int numeroDigitado = 0;

System.out.println("Digite um numero: ");
numeroDigitado = entrada.nextInt();
```

## Código do programa
[EntradaTeclado.java](../../modulos/basico/aula04/src/EntradaTeclado.java)