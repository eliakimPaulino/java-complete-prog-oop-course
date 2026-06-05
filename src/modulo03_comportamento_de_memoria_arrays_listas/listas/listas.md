# Listas em Java — Guia Completo para Desenvolvedores

## Introdução

Listas são uma das estruturas de dados mais importantes da programação. Em Java, elas permitem armazenar coleções de objetos de forma dinâmica, sem a necessidade de definir um tamanho fixo como ocorre com arrays.

Dominar listas é essencial porque elas aparecem em praticamente qualquer aplicação real:

* Sistemas de cadastro
* APIs REST
* Bancos de dados
* Aplicações desktop
* Aplicações web
* Aplicações mobile Android

Grande parte dos frameworks Java utiliza listas internamente.

---

# Arrays vs Listas

Antes de aprender listas, é importante entender a diferença para arrays.

## Array

```java
String[] nomes = new String[3];

nomes[0] = "Maria";
nomes[1] = "João";
nomes[2] = "Ana";
```

### Características

* Tamanho fixo
* Mais rápido
* Menor consumo de memória
* Não pode crescer dinamicamente

---

## Lista

```java
List<String> nomes = new ArrayList<>();

nomes.add("Maria");
nomes.add("João");
nomes.add("Ana");
```

### Características

* Tamanho dinâmico
* Fácil manipulação
* Mais flexível
* Estrutura mais utilizada em sistemas reais

---

# A Interface List

Em Java, List é uma interface.

```java
List<String> lista = new ArrayList<>();
```

Isso significa que normalmente programamos usando a interface e não a implementação.

Boa prática:

```java
List<String> lista = new ArrayList<>();
```

Evitar:

```java
ArrayList<String> lista = new ArrayList<>();
```

A primeira abordagem permite trocar a implementação facilmente.

---

# Principais Implementações

## ArrayList

Mais utilizada.

```java
List<String> lista = new ArrayList<>();
```

### Vantagens

* Acesso rápido por índice
* Melhor desempenho para leitura

### Desvantagens

* Inserções e remoções no meio são mais custosas

---

## LinkedList

```java
List<String> lista = new LinkedList<>();
```

### Vantagens

* Inserções e remoções frequentes

### Desvantagens

* Leitura mais lenta

---

## Vector

```java
Vector<String> lista = new Vector<>();
```

Pouco utilizado atualmente.

---

# Importando as Classes

```java
import java.util.List;
import java.util.ArrayList;
```

Ou:

```java
import java.util.*;
```

---

# Criando uma Lista

```java
List<String> nomes = new ArrayList<>();
```

Lista de inteiros:

```java
List<Integer> numeros = new ArrayList<>();
```

Lista de doubles:

```java
List<Double> precos = new ArrayList<>();
```

Lista de objetos:

```java
List<Produto> produtos = new ArrayList<>();
```

---

# Generics

O conteúdo entre `< >` define o tipo da lista.

```java
List<String>
List<Integer>
List<Double>
List<Produto>
```

Isso evita erros de tipo durante a compilação.

---

# Adicionando Elementos

## add()

```java
nomes.add("Maria");
nomes.add("João");
nomes.add("Ana");
```

Resultado:

```text
[Maria, João, Ana]
```

---

# Inserindo em uma Posição

```java
nomes.add(1, "Carlos");
```

Resultado:

```text
[Maria, Carlos, João, Ana]
```

---

# Tamanho da Lista

```java
System.out.println(nomes.size());
```

Saída:

```text
4
```

---

# Obtendo um Elemento

```java
System.out.println(nomes.get(0));
```

Saída:

```text
Maria
```

---

# Alterando um Elemento

```java
nomes.set(0, "Pedro");
```

Resultado:

```text
[Pedro, Carlos, João, Ana]
```

---

# Removendo Elementos

## Por índice

```java
nomes.remove(1);
```

---

## Por valor

```java
nomes.remove("João");
```

---

# Verificando Existência

```java
if(nomes.contains("Ana")){
    System.out.println("Existe");
}
```

---

# Descobrindo a Posição

```java
System.out.println(nomes.indexOf("Ana"));
```

Retorna:

```text
2
```

Se não encontrar:

```text
-1
```

---

# Limpando a Lista

```java
nomes.clear();
```

---

# Verificando se Está Vazia

```java
if(nomes.isEmpty()){
    System.out.println("Lista vazia");
}
```

---

# Percorrendo com For Tradicional

```java
for(int i = 0; i < nomes.size(); i++){
    System.out.println(nomes.get(i));
}
```

---

# Percorrendo com For Each

Mais utilizado.

```java
for(String nome : nomes){
    System.out.println(nome);
}
```

---

# Lambda

```java
nomes.forEach(nome -> System.out.println(nome));
```

---

# Ordenando uma Lista

## Strings

```java
Collections.sort(nomes);
```

---

## Inteiros

```java
Collections.sort(numeros);
```

---

## Ordem Reversa

```java
Collections.sort(nomes, Collections.reverseOrder());
```

---

# Filtrando com Streams

Lista original:

```java
List<String> nomes = Arrays.asList(
    "Maria",
    "João",
    "José",
    "Ana"
);
```

Filtrando nomes com J:

```java
List<String> resultado = nomes.stream()
    .filter(x -> x.startsWith("J"))
    .toList();
```

Resultado:

```text
[João, José]
```

---

# Removendo com Predicate

```java
nomes.removeIf(x -> x.charAt(0) == 'J');
```

---

# Encontrando Elementos

```java
String nome = nomes.stream()
    .filter(x -> x.equals("Ana"))
    .findFirst()
    .orElse(null);
```

---

# Lista de Objetos

Classe:

```java
public class Produto {

    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
```

---

Criando a lista:

```java
List<Produto> produtos = new ArrayList<>();
```

Adicionando:

```java
produtos.add(new Produto("Notebook", 3500.0));
produtos.add(new Produto("Mouse", 100.0));
```

Percorrendo:

```java
for(Produto p : produtos){
    System.out.println(
        p.getNome() + " - " + p.getPreco()
    );
}
```

---

# Problema Comum: IndexOutOfBoundsException

Erro:

```java
nomes.get(10);
```

Quando a posição não existe.

Exemplo:

```java
List<String> nomes = new ArrayList<>();

nomes.add("Maria");

System.out.println(nomes.get(5));
```

Resultado:

```text
IndexOutOfBoundsException
```

Sempre valide:

```java
if(indice < nomes.size()){
    System.out.println(nomes.get(indice));
}
```

---

# Problema Comum: ConcurrentModificationException

Errado:

```java
for(String nome : nomes){
    nomes.remove(nome);
}
```

Correto:

```java
nomes.removeIf(nome -> nome.startsWith("A"));
```

---

# Conversão entre Array e Lista

## Array para Lista

```java
String[] vetor = {"A", "B", "C"};

List<String> lista = Arrays.asList(vetor);
```

---

## Lista para Array

```java
String[] vetor =
    lista.toArray(new String[0]);
```

---

# Boas Práticas

## Use Interface

```java
List<String> lista = new ArrayList<>();
```

---

## Evite Números Mágicos

Errado:

```java
lista.get(5);
```

Melhor:

```java
int indiceCliente = 5;
lista.get(indiceCliente);
```

---

## Prefira For Each

```java
for(String nome : nomes)
```

Mais legível.

---

## Valide Índices

Sempre valide antes de acessar posições.

---

# Complexidade (Visão Simplificada)

| Operação         | ArrayList |
| ---------------- | --------- |
| get()            | O(1)      |
| set()            | O(1)      |
| add() final      | O(1)      |
| remove() meio    | O(n)      |
| busca contains() | O(n)      |

---

# Resumo

Uma lista:

* Armazena vários objetos.
* Cresce dinamicamente.
* É baseada na interface `List`.
* Geralmente utiliza `ArrayList`.
* Permite adicionar, remover, alterar e pesquisar elementos.
* Pode armazenar tipos primitivos através dos wrappers (`Integer`, `Double`, `Boolean`, etc.).
* É uma das estruturas mais utilizadas em Java moderno.

## Métodos Mais Importantes

```java
add()
get()
set()
remove()
size()
contains()
indexOf()
clear()
isEmpty()
removeIf()
stream()
forEach()
```

Dominar esses métodos e saber trabalhar com listas de objetos, estará preparado para a maioria dos projetos Java de nível júnior e boa parte dos projetos profissionais.
