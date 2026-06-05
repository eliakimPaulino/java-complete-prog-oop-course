# O que é um Vetor em Programação?

Um **vetor** (também chamado de **array**) é uma estrutura de dados utilizada para armazenar vários valores do mesmo tipo em uma única variável.

Em vez de criar várias variáveis separadas, podemos armazenar todos os valores em um vetor e acessá-los através de um índice.

## Exemplo

Sem vetor:

```java
int nota1 = 8;
int nota2 = 7;
int nota3 = 9;
```

Com vetor:

```java
int[] notas = {8, 7, 9};
```

## Índices

Os elementos de um vetor são organizados por posições chamadas **índices**.

Em Java, o primeiro índice sempre é **0**.

```java
int[] notas = {8, 7, 9};

System.out.println(notas[0]); // 8
System.out.println(notas[1]); // 7
System.out.println(notas[2]); // 9
```

Representação:

| Índice | Valor |
|---------|---------|
| 0 | 8 |
| 1 | 7 |
| 2 | 9 |

## Criando um Vetor

### Definindo o tamanho

```java
int[] numeros = new int[5];
```

O vetor possui espaço para 5 números inteiros.

### Inicializando com valores

```java
int[] numeros = {10, 20, 30, 40, 50};
```

## Alterando Valores

```java
int[] numeros = {10, 20, 30};

numeros[1] = 25;

System.out.println(numeros[1]); // 25
```

## Percorrendo um Vetor

### Usando for

```java
int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### Usando foreach

```java
int[] numeros = {10, 20, 30, 40, 50};

for (int numero : numeros) {
    System.out.println(numero);
}
```

## Propriedade length

A propriedade `length` informa quantos elementos existem no vetor.

```java
int[] numeros = {10, 20, 30};

System.out.println(numeros.length); // 3
```

## Vantagens dos Vetores

- Organizam dados relacionados.
- Reduzem a quantidade de variáveis necessárias.
- Facilitam a repetição de operações usando laços.
- Melhoram a legibilidade do código.

## Limitações dos Vetores

- Possuem tamanho fixo após a criação.
- Armazenam apenas elementos do mesmo tipo.
- Inserções e remoções podem ser menos flexíveis do que em listas.

## Resumo

Um vetor é uma estrutura de dados que armazena vários elementos do mesmo tipo em posições sequenciais de memória. Cada elemento pode ser acessado por meio de um índice, começando em 0. É uma das estruturas mais básicas e importantes da programação.