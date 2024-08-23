# Java Básico

## Hello World
Para criar um programa, devemos ter uma classe principal, que deve ser **pública**, possuir um **método estatico main**
De modo que segue esse exemplo:
- Criar o arquivo HelloWorld.java
- Abrir o editor e escrever:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

> O nome da **classe** deve ser o mesmo do **arquivo**, já que o compilador do Java -> pega a classe que possui o nome do arquivo e chama o método main para iniciar o programa

## Compilar o código
- Os códigos Java devem ser compilados, já que a linguagem compilada, e o seu compilador é o `javac`:

```bash
javac HelloWorld.java
```

## Executar
- Com o código compilado, basta rodar o arquivo compilado:
```bash
HelloWorld
```

## Código:
[HelloWorld.java](../../modulos/basico/aula00/src/HelloWorld.java)

---

[00 - intro.md](00%20-%20intro.md) <- Anterior | Próximo -> [02 - saida.md](02%20-%20saida.md)