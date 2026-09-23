# Cesta Inteligente (TCC)

Trabalho de Conclusão de Curso: um sistema para montar a cesta de compras mais barata possível
dentro de um orçamento, a partir de uma lista de itens desejados (com restrições opcionais, como
marca obrigatória ou quantidade mínima), comparando preços entre produtos de um supermercado.

## Domínio

- **Simulação**: um orçamento e uma lista de itens desejados para um supermercado.
- **Item desejado**: um item do catálogo, com quantidade desejada e uma restrição opcional
  (obrigatoriedade, marca obrigatória, quantidade mínima, gramatura obrigatória).
- **Resultado da otimização**: valor total, troco estimado e os itens efetivamente escolhidos
  (produto, quantidade, preço unitário, subtotal) para uma simulação.

## Stack

- Java 21
- Spring Boot 4
- Spring Data JPA
- PostgreSQL (dev/prod) · H2 (test)
- Gradle

## Status atual

Fase de modelagem de domínio: as entidades JPA e os repositories estão implementados
(`Supermercado`, `Produto`, `Categoria`, `ItemCatalogo`, `Simulacao`, `ItemDesejado`,
`RestricaoItem`, `ResultadoOtimizacao`, `ItemResultado`). A camada de API REST, os services e o
algoritmo de otimização da cesta ainda não foram implementados.

## Rodando localmente

```bash
./gradlew bootRun
```

Perfil padrão: `dev` (ver `application-dev.properties` para a configuração do PostgreSQL).

## Testes

```bash
./gradlew test
```
