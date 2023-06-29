
# Gestão Fornecedores
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Temgi/GestaoFornecedores/blob/main/LICENSE) 

# Sobre o Projeto

<a href="http://app-java.ddns.net:8084/Fornecedores/GestaoEmpresas.xhtml" target="_blank" rel="noopener">Acesso ao Projeto Online</a>


Gestão de Fornecedores é uma Aplicação Web Componentizada, foi Construída Objetivando a Prática e a Consolidação dos Conhecimentos nas Tecnologias do JavaEE(Java, JSF, CDI, PrimeFaces, TomCat, Hibernate, Bean Validation, JPA e MySQL), Oriunda do Trabalho no Penultimo Semestre do Curso Técnico em Processamento de Dados.

A aplicação Consiste no Controle de Fornecedores, onde os dados são coletados na Interface Web, e depois são listados na própria Página, apresenta também uma Barra de Ferramentas com Pesquisa, Inclusão, Edição, Exclusão e Exportação para o Excel. Além disso o Aplicativo conta com os Recursos de Ordenação, Paginação, Componente de Messagem, Validação, Pesquisa, Componente de Calendário e Modal de Novo Cadastro. Resolvendo Assim o Problema de Organização e Controle de um Grande Volume de Fornecedores, Centralizando Tudo num Único Ponto de Maneira Fácil e Rápida para Usuário.

## Layout Web
![Layout Web](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/LayoutWeb2.png)

## Modelo Conceitual
![Modelo Conceitual](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/ModeloConceitual.png)

## Funcionalidades

1. Inclusão de Fornecedores
2. Ordenação
3. Paginação
4. Componente de Mensagem
5. Validação
6. Pesquisa de Fornecedores
7. Edição de Fornecedores
8. Exportação para o Excel
9. Componente de Calendário
10. Exclusão de Fornecedores
11. Modal de Cadastro e Remoção

## Modal de Diálogo
![Modal 1](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/Modal1.png) ![Modal 2](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/Modal2.png)

## Estrutura de Classes
![Estrutura de Classes](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/EstruturaClasses.png)

# Tecnologias Utilizadas
## Back End
- Java
- JSF
- CDI (Context Dependency Injection)
- JPA / Hibernate
- TomCat (Servlet Container)
- Maven
- Bean Validation
- MySQL
## Front End
- XHTML
- PrimeFaces
- AJAX

## Modelo Entidade Relacionamento
![MER](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/MER.png)



# Como Executar o Projeto

## Back-End
1-Baixar e Instalar o Java-JDK no Link Abaixo:
<br>
https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html
<br><br>
2-Configurar Variáveis de Ambiente do Java-JDK Conforme Link Abaixo:
https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-instalacao-do-java
<br><br>
3-Baixar e Instalar o MySQL no Link Abaixo:
<br>
https://dev.mysql.com/downloads/windows/installer/8.0.html
<br><br>
4-Script SQL para Criação do Banco de Dados
~~~sql
CREATE SCHEMA `fornecedores`;
~~~
<br>

5-Script SQL para Popular Tabela EMPRESA
~~~sql
insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (1, '70.311.193/0001-87', 'Mercado do João', 'João Mercado e Distribuidor de Alimentos Ltda', 'LTDA', '2009-03-02', 1);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (2, '52.822.994/0001-25', 'Fale Mais', 'Fale Mais Telecom S.A.', 'SA', '1997-12-10', 2);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (3, '41.952.519/0001-57', 'Maria de Souza da Silva', 'Maria de Souza da Silva', 'MEI', '2014-10-15', 3);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (4, '16.134.777/0001-89', 'Gomes Inovação', 'José Fernando Gomes EIRELI ME', 'EIRELI', '2009-03-02', 4);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (5, '70.311.193/0001-87', 'Dr. Consulta', 'Dr. Consulta Exames e Consultas Ltda', 'LTDA', '2009-03-02', 8);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (6, '52.822.994/0001-25', 'Soft Impress', 'Impress e Serviços S.A.', 'SA', '1997-12-10', 5);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (7, '41.952.519/0001-57', 'CNA Inglês e Espanhol', 'Escola de Idiomas CNA', 'MEI', '2014-10-15', 9);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (8, '16.134.777/0001-89', 'CVC Turismo', 'CVC Viagens e Turismo EIRELI ME', 'EIRELI', '2009-03-02', 7);
~~~
<br>

6-Script SQL para Popular Tabela RAMO_ATIVIDADE
~~~sql
INSERT INTO ramo_atividade (id, descricao) VALUES (1, 'Distribuição de alimentos');
INSERT INTO ramo_atividade (id, descricao) VALUES (2, 'Telecomunicações');
INSERT INTO ramo_atividade (id, descricao) VALUES (3, 'Vestuário');
INSERT INTO ramo_atividade (id, descricao) VALUES (4, 'Lavanderia');
INSERT INTO ramo_atividade (id, descricao) VALUES (5, 'Gráfica');
INSERT INTO ramo_atividade (id, descricao) VALUES (6, 'Mecânica');
INSERT INTO ramo_atividade (id, descricao) VALUES (7, 'Turismo');
INSERT INTO ramo_atividade (id, descricao) VALUES (8, 'Saúde');
INSERT INTO ramo_atividade (id, descricao) VALUES (9, 'Educação');
INSERT INTO ramo_atividade (id, descricao) VALUES (10, 'Lazer');
~~~
<br>

Pré-requisitos: Java 11

```bash
# Clonar Repositório
git clone https://github.com/Temgi/GestaoFornecedores.git

# Entrar na pasta do Projeto GestaoFornecedores
cd GestaoFornecedores

# executar o projeto
-Baixar e Descompactar o Apache TomCat 8.5.6
-Copiar o Arquivo [Fornecedores.war] dentro da Pasta do Projeto GestaoFornecedores
-Colar na Pasta de Deploy do TomCat no Caminho C:\apache-tomcat-8.5.88\webapps
-Acessar a Pasta de Execução do TomCat no Caminho C:\apache-tomcat-8.5.88\bin
-Executar o Script start.bat
```


## Front-End
Pré-requisitos: npm / yarn


# Autor

Rui Azevedo

https://www.linkedin.com/in/devruiazevedo/
