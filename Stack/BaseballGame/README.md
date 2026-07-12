# Baseball Game

## Descrição
Simule um jogo de pontuação onde cada operação representa uma ação no placar.

Cada operação pode ser:

- Um número: adiciona uma nova pontuação.
- `"C"`: remove a última pontuação registrada.
- `"D"`: adiciona o dobro da última pontuação.
- `"+"`: adiciona a soma das duas últimas pontuações.

Ao final, retorne a soma de todas as pontuações válidas.

Exemplo:

Entrada:

["5","2","C","D","+"]


Processo:

5 → [5]
2 → [5,2]
C → [5]
D → [5,10]

→ [5,10,15]

Resultado:
30

---

## Categoria
Stack

## Dificuldade
Easy

## Conceitos
- Stack
- LIFO (Last In, First Out)
- Push e Pop
- Manipulação de Arrays
- Estruturas de Dados

## Complexidade
- Tempo: O(n)
- Espaço: O(n)

## Abordagem
A solução utiliza uma Stack para armazenar as pontuações.

Cada operação é analisada individualmente:

- Números são adicionados usando `push()`.
- `"C"` remove o último elemento usando `pop()`.
- `"D"` acessa o último elemento usando `peek()` e adiciona o dobro.
- `"+"` utiliza os dois últimos valores da Stack para calcular a nova pontuação.

Ao final, todos os valores armazenados na Stack são somados para obter o resultado final.

## Status
✅ Resolvido

**Data:** 12/07/2026
