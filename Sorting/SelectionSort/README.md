# Selection Sort

## Descrição

O Selection Sort é um algoritmo de ordenação que percorre o array procurando o menor elemento da parte ainda não ordenada e o posiciona no início dessa seção.

A cada passagem, um novo elemento é colocado em sua posição definitiva, aumentando a parte já ordenada do array.

### Exemplo

**Entrada**

```java
int[] arr = {5, 3, 2, 1, 4, 8, 7};
```

**Saída**

```text
1 2 3 4 5 7 8
```

---

## Categoria

- Sorting Algorithms

## Dificuldade

Easy

## Conceitos

- Arrays
- Laços de repetição
- Busca pelo menor elemento
- Troca de valores
- Algoritmos de ordenação

## Solução

A solução utiliza dois laços de repetição:

- O primeiro define a posição que será preenchida com o menor elemento restante.
- O segundo percorre a parte ainda não ordenada do array em busca do menor valor.
- Após encontrar o menor elemento, é realizada apenas uma troca entre ele e a posição atual.
- Esse processo é repetido até que todo o array esteja ordenado.

## Complexidade

Complexidade | Valor 
- Tempo (Melhor caso) | **O(n²)**
- Tempo (Caso médio) | **O(n²)**
- Tempo (Pior caso) | **O(n²)**
- Espaço | **O(1)** 

---

## Status

Resolvido

**DATA  21/07/26**
