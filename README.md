# Atividades Java / SpringBoot

As atividades de 1 a 4 são feitas em Java 11.

# Importante
Para executar as atividades feitas em java "puro", basta executar os comandos de compilacao e execução no terminal o arquivo contendo a função main().

Ex.:
```java
$ javac Exercicio.java 
$ java Exercicio
```
## Exercício 1

O construtor inicializa os valores já setados na instanciação da classe dentro do arquivo principal `ResultadoEleicao.java` que deverá ser compilado e executado.

## Exercício 2

A classe `BubbleSort.java` implementa tanto o algoritmo de ordenação quanto o de impressão. Na classe `OrdernarVetor.java`, será feita a atribuição dos valores do vetor e a chamada dos métodos de ordenação e impressão.

## Exercício 3

Dentro de`Fatorial.java` é feito o cálculo do fatorial de forma iterativa pois possui maior performance se comparado a sua forma recursiva. Dentro de `CalcularFatorial.java` é recebido o valor de entrada digitado pelo usuário e em seguida a chamada do método para realizar o procedimento.

## Exercício 4

Em `Multiplos.java` está a estrutura necessária para o cálculo de números múltiplos de 3 e 5 que sejam menores que o número digitado pelo usuário. Já em `CalcularMultiplos.java` está localizado na função principal, os métodos de receber entrada de usuário e chamada para efetivar o cálculo.

## Exercício 5
> Aproveitando para conhecer um pouco sobre frameworks Java, área a qual não tive contato anteriores, tentei realizar a criação do CRUD utilizando o SpringBoot, utilizado juntamente com Spring Data JPA, MySQL como nosso banco de dados e Hibernate para o mapeamento dos dados.

Para executar o projeto, é necessário que possua o Maven e o MySql (utilizado versão 8) instalado.
O MySQL será responsável por armazenar os dados da aplicação. Não é necessário criar nenhuma tabela pois a aplicação fará automaticamente. É preciso apenas que o banco esteja conectado a máquina local e que o mesmo tenha login e senha `root`. Esses dados podem ser alterados no arquivo:
-  `/src/main/resources/application.properties`

É necessário instalar as dependências do projeto e só depois, executar o mesmo. Para isso navegue até a raiz do projeto onde se encontra o arquivo `pom.xml` com configurações e injeção de dependência e execute:
```
$ mvn install
$ mvn spring-boot:run
```

O projeto foi configurado e rodado em ambiente Linux (Ubuntu 20.04) e os comandos podem variar se executado em outro sistema operacional. Eles podem ser executados pela interface do Eclipse com Spring Tool Suite 4 instalado. A aplicação utiliza a versão 11 do Java e 2.5.1 do Spring Boot.

### Testando a aplicação

Para efeito de testes de requisição http, podem ser utilizados o _Insomnia_ ou _Postman. Para requisições *POST* ou *PUT*, deverá ser passado um *JSON* no body do software.
Ex.:
```JSON
{
	"veiculo":"nomeDoVeiculo",
	"marca":"marcaDoVeiculo",
	"ano": 2021,
	"descricao": "descricaoDoVeiculo",
	"vendido": true
}
```
Os endpoints para cada tipo de requisição podem ser encontrados dentro de:
`/src/main/java/com/tales/magalhaes/controller/VeiculoController.java`

São eles:

GET
---
- Retorna todos os veiculos cadastrados
	- [/veiculos](http://localhost:8080/veiculos)

- Retorna a quantidade de veículos não vendidos
	- [/veiculos/naovendidos](http://localhost:8080/veiculos/naovendidos)

- Retorna um veiculo por ID
	- [/veiculos/{id}](http://localhost:8080/veiculos/{id})

- Retorna os veículos cadastrados entre duas datas

	- [/veiculos/decada](http://localhost:8080/veiculos/decada)

- Retorna a quantidade de veículos por marca

	- [/veiculos/marca](http://localhost:8080/veiculos/marca)

- Retorna os veículos cadastrados na ultima semana

	- [/veiculos/ultimasemana](http://localhost:8080/veiculos/ultimasemana)

POST
---
- Cria novos veículos

	- [/veiculos](http://localhost:8080/veiculos)

DELETE
---
- Remove veículos da lista

	- [/veiculos/{id}](http://localhost:8080/veiculos/{id})

PUT
---
- Atualiza TODOS os dados de um veículo

	- [/veiculos/{id}](http://localhost:8080/veiculos/{id})


### Testes Unitários

Devido ao uso do Data JPA Spring, testes unitários são desnecessários pela forma como foi arquiteturada a aplicação. Neste caso, seria ideal realizar testes de integração.

