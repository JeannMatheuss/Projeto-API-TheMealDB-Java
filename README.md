# Consulta de Receitas

Este é um programa em Java que permite ao usuário buscar receitas pelo nome utilizando a API pública do [TheMealDB](https://www.themealdb.com/). O programa retorna informações detalhadas sobre a receita buscada em formato JSON.

## Funcionalidades

- Solicita ao usuário o nome de uma receita.
- Realiza uma requisição HTTP para obter informações sobre a receita.
- Exibe os detalhes da receita no formato retornado pela API.

## Requisitos

- **Java 11 ou superior**: O programa utiliza a classe `HttpClient`, introduzida no Java 11.
- **Conexão com a Internet**: Necessária para realizar a requisição à API do TheMealDB.

## Como executar

1. Certifique-se de ter o Java 11 ou superior instalado.
2. Compile o programa com o seguinte comando:
   ```bash
   javac Principal.java
