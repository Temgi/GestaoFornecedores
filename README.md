
# Gestão Fornecedores
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Temgi/GestaoFornecedores/blob/main/LICENSE) 

<p align="center">
<img src="https://img.shields.io/badge/STATUS-completo-blue?style=for-the-badge">
</p>

## 🧠 Sobre o Projeto
<p>Gestão de Fornecedores é uma Aplicação Web Componentizada, foi Construída Objetivando a Prática e a Consolidação dos Conhecimentos nas Tecnologias do JavaEE(Java, JSF, CDI, PrimeFaces, TomCat, Hibernate, Bean Validation, JPA e MySQL), Oriunda do Trabalho no Penultimo Semestre do Curso Técnico em Processamento de Dados.</p>

<p>A aplicação Consiste no Controle de Fornecedores, onde os dados são coletados na Interface Web, e depois são listados na própria Página, apresenta também uma Barra de Ferramentas com Pesquisa, Inclusão, Edição, Exclusão e Exportação para o Excel. Além disso o Aplicativo conta com os Recursos de Ordenação, Paginação, Componente de Messagem, Validação, Pesquisa, Componente de Calendário e Modal de Novo Cadastro. Resolvendo Assim o Problema de Organização e Controle de um Grande Volume de Fornecedores, Centralizando Tudo num Único Ponto de Maneira Fácil e Rápida para Usuário.</p>

<a href="http://app-java.ddns.net:8084/Fornecedores/GestaoEmpresas.xhtml" target="_blank" rel="noopener">Link do Projeto para Acesso Online</a>

## 📗 Sumário

* [Interface Web](#-interface-web)
* [Modelo Conceitual](#-modelo-conceitual)
* [Funcionalidades](#%EF%B8%8F-funcionalidades)
* [Modal Diálogo](#-modal-de-diálogo)
* [Estrutura de Classes](#-estrutura-de-classes)
* [Tecnologias Utilizadas](#-tecnologias-utilizadas)
* [Modelo Entidade Relacionamento](#-modelo-entidade-relacionamento) 
* [Como Executar o Projeto](#-como-executar-o-projeto)
* [Autor](#-autor)

## 💻 Interface Web
<br>

![Layout Web](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/LayoutWeb2.png)

## 🎨 Modelo Conceitual
<br>

![Modelo Conceitual](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/ModeloConceitual.png)

## ⚙️ Funcionalidades

- [x] Inclusão de Fornecedores
- [x] Ordenação
- [x] Paginação
- [x] Componente de Mensagem
- [x] Validação
- [x] Pesquisa de Fornecedores
- [x] Edição de Fornecedores
- [x] Exportação para o Excel
- [x] Componente de Calendário
- [x] Exclusão de Fornecedores
- [x]  Modal de Cadastro e Remoção

## 💡 Modal de Diálogo
<br>

![Modal 1](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/Modal1.png) ![Modal 2](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/Modal2.png)

## 🎯 Estrutura de Classes
<br>

![Estrutura de Classes](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/EstruturaClasses.png)

## 🚀 Tecnologias Utilizadas:
### Back-End
<ul>
        <li> Java</li>
        <li> JSF</li>
        <li> CDI (Context Dependency Injection)</li>
        <li> Thymeleaf</li>
        <li> Maven</li>
        <li> Apache TomCat(Servlet Container)</li>
        <li> JPA-Hibernate</li>
        <li> Bean Validation</li>
        <li> MySQL</li>
</ul>

### Front-End
<ul>
        <li>XHTML</li>
        <li>PrimeFaces</li>
        <li>AJAX</li>
</ul>

## 🔥 Modelo Entidade Relacionamento
<br>

![MER](https://github.com/Temgi/GestaoFornecedores/blob/main/assets/MER.png)


# Como Executar o Projeto

## Instalações
1-Baixar e Instalar o Java-JDK no Link Abaixo:
<br>
https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html
<br><br>
2-Configurar Variáveis de Ambiente do Java-JDK Conforme Link Abaixo:
<br>
https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-instalacao-do-java
<br><br>
3-Baixar e Instalar o MySQL no Link Abaixo:
<br>
https://dev.mysql.com/downloads/windows/installer/8.0.html
<br>
https://www.alura.com.br/artigos/mysql-do-download-e-instalacao-ate-sua-primeira-tabela
<br><br>

## Configuração Banco de Dados
1-Script SQL para Criação do Banco de Dados
~~~sql
CREATE SCHEMA `fornecedores`;
~~~
<br>

2-Script SQL para Popular Tabela EMPRESA
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

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (9, '41.952.519/0001-57', 'H-OFFICE', 'Mecânica HONDA Especializada', 'MEI', '2014-10-15', 6);

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id)
values (10, '16.134.777/0001-89', 'Cinemark', 'Cinemark Lazer e Entretenimento EIRELI ME', 'EIRELI', '2009-03-02', 10);
~~~
<br>

3-Script SQL para Popular Tabela RAMO_ATIVIDADE
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

## Execução e Deploy do Projeto

```bash
# Clonar Repositório
git clone https://github.com/Temgi/GestaoFornecedores.git

# Executar o Projeto
-Baixar e Descompactar o Apache TomCat 8.5.88
-Copiar o Arquivo [Fornecedores.war] dentro da Pasta target do Projeto [GestaoFornecedores]
-Colar na Pasta de Deploy do TomCat no Caminho C:\apache-tomcat-8.5.88\webapps
-Acessar a Pasta de Execução do TomCat no Caminho C:\apache-tomcat-8.5.88\bin
-Executar o Script [start.bat]
-Acessar no Chrome o Endereço: http://localhost:8080/Fornecedores/GestaoEmpresas.xhtml
```


## 📝 **Autor**

<table>
<tr>
<td align="center"><a href="https://github.com/Temgi"><img style="border-radius: 10%;" src="https://avatars.githubusercontent.com/u/8334174?v=4" width="80px;" alt="Foto de Rui Temgi Saraiva Azevedo no GitHub"/></a><br /></td>
</tr>
</table>

Rui Azevedo
<br>
Contatos:  <a href="https://www.linkedin.com/in/devruiazevedo/">LinkedIn</a> - <a href="https://wa.me/5511971973505?text=Olá.%20Estou%20Entrando%20em%20Contato%20a%20partir%20do%20Portfólio%20no%20GitHub.">WhatsApp</a> - <a href="#"> ruisaraivasp@gmail.com</a>
