# Bubble Sort

## Descrição

O Bubble Sort é um algoritmo de ordenação que percorre o array diversas vezes, comparando elementos vizinhos e trocando suas posições quando estão na ordem incorreta.

A cada passagem, o maior elemento "borbulha" para o final do array, até que todos os elementos estejam ordenados.

### Exemplo

**Entrada**

```java
int[] arr = {3,7,5,2,1,8};
```

**Saída**

```text
1
2
3
5
7
8
```

---

## Categoria

- Sorting Algorithms

## Dificuldade

Easy

## Conceitos

- Arrays
- Laços de repetição
- Comparação de elementos
- Troca de valores
- Algoritmos de ordenação

## Solução

A solução utiliza dois laços de repetição:

- O primeiro controla o número de passadas pelo array.
- O segundo compara elementos vizinhos (`arr[j]` e `arr[j + 1]`).
- Sempre que dois elementos estão fora de ordem, eles têm suas posições trocadas.
- Após cada passagem, o maior elemento restante é colocado em sua posição correta no final do array.

## Complexidade

Complexidade | Valor 
- Tempo (Melhor caso) | **O(n)**
- Tempo (Caso médio) | **O(n²)**
- Tempo (Pior caso) | **O(n²)**
- Espaço | **O(1)** 

---

## Status

Resolvido
