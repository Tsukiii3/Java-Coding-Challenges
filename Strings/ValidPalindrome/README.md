# Valid Palindrome

## Descrição
Verifique se uma string é um palíndromo, ou seja, se ela permanece igual quando lida de trás para frente.

A comparação deve ignorar diferenças entre letras maiúsculas e minúsculas.

Exemplos:

"Radar" → Palíndromo

"Java" → Não é palíndromo


## Categoria
Strings

## Dificuldade
Easy

## Conceitos
- Strings
- StringBuilder
- Manipulação de texto
- Comparação de Strings

## Complexidade
- Tempo: O(n)
- Espaço: O(n)

## Abordagem
A solução cria uma nova string invertida utilizando `StringBuilder.reverse()` e compara com a string original utilizando `equalsIgnoreCase()`.

## Status
✅ Resolvido

**Data:** 12/07/2026
