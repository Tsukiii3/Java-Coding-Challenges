# Contains Duplicate

## Descrição

Dado um array de inteiros, verifique se existe algum valor duplicado.

Retorne:

- `true` caso exista pelo menos um elemento repetido.
- `false` caso todos os elementos sejam únicos.

### Exemplo

**Entrada**

```java
int[] nums = {1, 2, 3, 1, 4, 5};
```

**Saída**

```text
true
```

---

## Categoria

- Arrays
- HashMap

## Dificuldade

Easy

## Conceitos praticados

- Arrays
- HashMap
- Busca eficiente
- Complexidade de algoritmos

## Solução

A solução percorre o array armazenando os números já vistos em um `HashMap`.

Para cada elemento:

1. Verifica se ele já foi encontrado anteriormente.
2. Se sim, significa que existe um elemento duplicado.
3. Caso contrário, adiciona o número ao mapa e continua a busca.

## Complexidade

| Complexidade | Valor |
|--------------|-------|
| Tempo | **O(n)** |
| Espaço | **O(n)** |
---
