# Ideia inicial
* Um cliente solicita que seja possivel acessar um formulário de produto
* Via de acesso: http://localhost:8080/produto/form
* Teremos: Controller, MOdel e View
* Controller verifica se possui algum Model de Produto
* Model devolve para a Controller o form de produto
* Controller manda para a view
* View renderiza HTML para o cliente com o form de produto

# Novo projeto
* Spring boot
* Maven
  * WEB
  * JPA
  * MySQL
  * Thymeleaf
  * DevTools
* Settings
  * Build, Execution, Deployment
    * Build Tools
      * Marcar como true: Any changes
    * Compiler
      * Marcar como true: Build project automatically

## No application.properties, colar:

### Update the database schema based on the entities create-drop / update
spring.jpa.hibernate.ddl-auto = update

### create database if not exists mysql true spring boot
spring.datasource.url=jdbc:mysql://localhost:3306/SpringCRUDThymeleaf?createDatabaseIfNotExist=true

### DB User
spring.datasource.username=root

### DB password
spring.datasource.password=laboratorio

---

Para verificar se está funcionando, crie um index no static
