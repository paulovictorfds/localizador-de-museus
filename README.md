# ![Java Projects Logo](https://cdn-icons-png.flaticon.com/128/226/226777.png) Projeto Localizador de Museus ![Java Projects Logo](https://cdn-icons-png.flaticon.com/128/226/226777.png)

![Java](https://img.shields.io/badge/Java-17%2B-blue)  
📌 Projeto desenvolvido como parte da avaliação do módulo de **Java** do curso de Desenvolvimento Web da Trybe.  

Este projeto utiliza **Java, Spring Boot, Maven e Docker** para criar uma API que facilita a busca por museus próximos com base na localização geográfica do usuário.

## 🚀 Funcionalidades

- **Cadastro de Museus**: Adicionar novos museus ao sistema.  
- **Localização de Museus Próximos**: Buscar museus mais próximos com base nas coordenadas geográficas.  
- **Consulta de Museus Específicos**: Buscar museus pelo ID.  

## 📁 Estrutura do Código

A aplicação é baseada na arquitetura MVC, onde um **Controller** gerencia as rotas e interações com o serviço de museus.

```java
@RestController
@RequestMapping("/museums")
public class MuseumController {
    // Código omitido para brevidade...
}
```

## 🛠️ Tecnologias Utilizadas

- **Java 17+** - Linguagem principal  
- **Spring Boot** - Desenvolvimento de APIs REST  
- **Maven** - Gerenciamento de dependências  
- **Docker** - Containerização  
- **JUnit** - Testes automatizados  

## ⚙️ Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **Java 17+**  
- **Maven** (`mvn -version`)  
- **Docker** (caso queira rodar via container)  

## ▶️ Como Executar

### 🔹 Usando Maven

```sh
git clone https://github.com/paulovictorfds/localizador-de-museus.git
cd localizador-de-museus
mvn clean install
mvn spring-boot:run
```

### 🔹 Usando Docker

```sh
docker build -t localizador-museus .
docker run -p 8080:8080 localizador-museus
```

## 🛠️ Exemplo de Uso

### 🔍 Buscar todos os museus

```sh
curl -X GET http://localhost:8080/museums
```

### ➕ Cadastrar um novo museu

```sh
curl -X POST http://localhost:8080/museums \
     -H "Content-Type: application/json" \
     -d '{ "name": "Museu Nacional", "latitude": -15.7801, "longitude": -47.9292 }'
```
