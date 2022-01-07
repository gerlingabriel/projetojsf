# projetojsf

Esse projeto serve para relembrar os conveitos que aprendi no início dos estudos de JAVA. Com estrutura MVC prefento realizar um projeto com tela de Login e tela para um CRUD de Uusuário com tabela mostrando itens add cadastrado.
Esse Projeto será feito por etapas e com tempo que eu dipor, segue abaixo qual etapa estarei:
* 1 - Crud no teste e pessoa :point_up:
* 2 - Crud no teste de Telefone
* 3 - Configuração da tela login
* 4 - Realizar tratamento na tela de Login
* 5 - Configurar tela CRUD
* 6 - Realizar tratamento na tela CRUD
* 7 - Configurações finais.

### Informações do Sistema

Como é projeto simples usarei para banco de dados H2 e outras ferramentas como: Hibernate, JPA, JSF, Boostrap, JQuery, Ajax.

# mavenquickstart

[![Build Status](https://travis-ci.org/condessalovelace/mavenquickstart.svg?branch=master)](https://travis-ci.org/condessalovelace/mavenquickstart) ![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=br.com%3Amavenquickstart&metric=alert_status)

Esse projeto ilustra a estrutura gerada através da utilização do arquétipo Quickstart do Maven utilizando o JDK11.

### Construção

Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
```

O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

## Configuração

Para executar o projeto, é necessário utilizar o Eclipse, para que o mesmo identifique as dependências necessárias para a execução no repositório .m2 do Maven. Uma vez importado o projeto, será criado um arquivo *.classpath* que irá informar qual a classe principal para a execução.

### Servidor Web

Para executar o servico na web será utilizando o TOMCAT na porta 8080 (depende de configurações) para subir a aplicação e assim testar no navegador.
