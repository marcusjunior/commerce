Transire Commerce

 - Demonstração de um CRUD de Produtos utilizando Spring Boot e Angular via Web Service

O que há aqui?
 - Este projeto foi baseado no Spring Boot, e utiliza as seguintes tecnologias:
    - Maven
    - Spring Core
    - Spring Data (Hibernate & MySQL 5.7)
    - Spring MVC (Tomcat)
    - Thymeleaf
    - Angular
    
Instalação:
 - Java: Este projeto foi criado utilizando o Maven, basta importa-lo e realiza o build para resolver as dependências
   - Requisitos:
     - Java 1.8
     - MySQL 5.7

 - Angular: Realizar a instalação do Angular-cli e executar o comando npm install para resolver as dependências
   - Requisitos:
     - Angular 5
   
 Para testes com o Angular 6, para portar o códito basta utilizar os comandos abaixo:
 
  - npm install --save-dev @angular/cli@v6.0.0-rc.4
 
  - ng update @angular/cli --migrate-only
 
Configuração do Banco de Dados 

 - Criar o banco de dados "transirecommerce" e ajustar seu usuário e senha do banco no arquivo /resources/application.properties

Utilização:

 - Backend:
   - Após realizar o build do projeto java, deve-se executar o arquivo Boot.java para subir a aplicação.
 
 - Frontend:
   - Esta aplicação contém 2 frontends para demosntração, em Thymeleaf e Angular

 - URI Thymeleaf (Java):
   - http://localhost:8080

 - URI Angular (JS):
   - http://localhost:4200

Para subir a aplicação Angular utilizar o comando "ng serve" na raíz do projeto

 
 
  
