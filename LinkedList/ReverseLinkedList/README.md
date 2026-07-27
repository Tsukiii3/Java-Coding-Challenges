# Reverse Linked List

## Descrição

O **Reverse Linked List** é um problema clássico de estruturas de dados que consiste em inverter a ordem dos nós de uma lista encadeada (*Linked List*).

A solução percorre a lista apenas uma vez, alterando as referências entre os nós até que a lista esteja completamente invertida.

## Exemplo

### Entrada

```text
1 -> 2 -> 3 -> 4 -> null
```

### Saída

```text
4 -> 3 -> 2 -> 1 -> null
```

## Categoria

Linked List

## Dificuldade

Easy

## Conceitos

* Linked Lists
* Manipulação de referências
* Estruturas de dados
* Laços de repetição
* Algoritmos iterativos

## Solução

A solução utiliza três referências:

* **previous**: armazena o nó anterior.
* **current**: representa o nó atual da lista.
* **next**: salva temporariamente o próximo nó antes da inversão.

Durante cada iteração:

1. O próximo nó é armazenado em `next`.
2. O ponteiro do nó atual é invertido para apontar para o nó anterior.
3. `previous` avança para o nó atual.
4. `current` avança para o próximo nó.

Ao final da execução, `previous` passa a representar o novo início da lista invertida.

## Complexidade
 Complexidade  | Valor 
- Tempo (Melhor caso) | O(n)
- Tempo (Caso médio)  | O(n)
- Tempo (Pior caso)   | O(n)
- Espaço              | O(1)  

## Status

Resolvido

**DATA:** 27/07/26

