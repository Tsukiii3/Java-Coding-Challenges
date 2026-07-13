# Binary Search

## Descrição

Dado um array de inteiros ordenado em ordem crescente e um valor alvo (`target`), encontre o índice do elemento.

Retorne:

- O índice do elemento, caso ele exista.
- `-1` caso o elemento não seja encontrado.

### Exemplo

**Entrada**

```java
int[] nums = {1, 2, 3, 4, 5, 6};
int target = 5;
```

**Saída**

```text
4
```

---

## Categoria

- Binary Search

## Dificuldade

Easy

## Conceitos praticados

- Busca Binária
- Arrays
- Divisão e Conquista
- Complexidade Logarítmica

## Solução

A busca binária divide o array ao meio a cada iteração.

- Se o elemento do meio for o alvo, retorna seu índice.
- Se o alvo for maior, continua a busca na metade direita.
- Se o alvo for menor, continua na metade esquerda.

## Complexidade
- Tempo **O(log n)**
- Espaço  **O(1)** 

---

## Status

✅ Resolvido

**DATA 13/07/26**
