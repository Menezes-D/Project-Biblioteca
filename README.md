Sistema de Gerenciamento de Biblioteca

📌 Sobre o Projeto

Este projeto consiste em um sistema de gerenciamento de biblioteca que permite o cadastro, consulta, edição e remoção de livros (CRUD).
O back-end foi desenvolvido em Spring Boot (Java) e o front-end em HTML, CSS e JavaScript, rodando via Live Server no VSCode.

🚀 Tecnologias Utilizadas

-> Back-end: Java com Spring Boot, Spring Data JPA, Hibernate
-> Banco de Dados: MySQL
-> Front-end: HTML, CSS, JavaScript 
-> Ferramentas: IntelliJ IDEA (back-end) e VSCode com Live Server (front-end)



🛠 Configuração do Back-end

1️⃣ Instalar Dependências
Certifique-se de que possui o Java 17+, Maven e MySQL instalados.

2️⃣ Configurar Banco de Dados
Crie um banco de dados no MySQL:
   CREATE DATABASE biblioteca_db;
   
3️⃣ Configurar application.properties
Abra src/main/resources/application.properties e configure as credenciais do MySQL (usuario e senha):


spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca_db
spring.datasource.username=usuario
spring.datasource.password=senha
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true


4️⃣ Rodar o Servidor
No IntelliJ IDEA, execute o projeto clicando em Run ou utilizando o terminal:
-> mvn spring-boot:run



🖥 Configuração do Front-end

1️⃣ Abrir no VSCode
Abra a pasta frontend/ no VSCode.

2️⃣ Rodar o Live Server
Com o arquivo index.html aberto, clique com o botão direito e selecione "Open with Live Server". O front-end será carregado no navegador.

📌 Funcionalidades

✅ Listar livros cadastrados
✅ Adicionar novos livros
✅ Editar informações de livros
✅ Remover livros do sistema



⚠ Possíveis Problemas e Soluções

❌ Erro de conexão com o banco de dados
-> Verifique se o MySQL está rodando.
-> Confirme se as credenciais no application.properties estão corretas.
-> Use SHOW DATABASES; no MySQL para confirmar se biblioteca_db foi criado.

❌ Front-end não exibe os livros
-> Certifique-se de que o back-end está rodando (http://localhost:8080).
-> Verifique se as chamadas de API no script.js estão corretas.



📂 Estrutura do Projeto

Biblioteca-CRUD
│── backend/ (Spring Boot - IntelliJ)
│   ├── src/main/java/br/com/fecaf
│   │   ├── controller/ (Controladores REST)
│   │   ├── database/ (Modelo do SQL)
│   │   ├── model/ (Entidades JPA)
│   │   ├── repository/ (Interfaces de acesso ao BD)
│   │   ├── service/ (Regras de negócio)
│   │   ├── App.java (Aplicação Run)
│   ├── src/main/resources
│   │   ├── application.properties (Configuração do BD)
│
│── frontend/ (HTML, CSS, JS - VSCode)
│   ├── index.html
│   ├── styles.css
│   ├── script.js




