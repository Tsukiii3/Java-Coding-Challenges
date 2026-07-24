# Insertion Sort

## Descrição

O Insertion Sort é um algoritmo de ordenação que constrói a lista ordenada gradualmente, inserindo cada elemento na posição correta entre os elementos já ordenados.

Seu funcionamento é semelhante à forma como organizamos cartas de baralho nas mãos: a cada novo elemento, ele é comparado com os anteriores e inserido na posição adequada.

### Exemplo

**Entrada**

```java
int[] arr = {5, 3, 2, 1, 4, 6, 8};
```

**Saída**

```text
1 2 3 4 5 6 8
```

---

## Categoria

- Sorting Algorithms

## Dificuldade

Easy

## Conceitos

- Arrays
- Laços de repetição
- Inserção ordenada
- Deslocamento de elementos
- Algoritmos de ordenação

## Solução

A solução percorre o array a partir do segundo elemento.

- O elemento atual é armazenado em uma variável (`key`).
- Enquanto existirem elementos maiores à esquerda, eles são deslocados uma posição para a direita.
- Quando a posição correta é encontrada, o elemento (`key`) é inserido.
- O processo é repetido até que todo o array esteja ordenado.

## Complexidade

Complexidade | Valor 
- Tempo (Melhor caso) | **O(n)**
- Tempo (Caso médio) | **O(n²)**
- Tempo (Pior caso) | **O(n²)**
- Espaço | **O(1)** 

---

## Status

Resolvido

**DATA 24/07/26**
