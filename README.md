# 🏫 Universidade API

API REST desenvolvida em **Spring Boot** com integração ao **MariaDB** para o gerenciamento de cursos e alunos.

---

## 🚀 Tecnologias Utilizadas
- ☕ Java 17+
- 🌱 Spring Boot 3
- 🧩 Spring Data JPA
- 🐬 MariaDB (via XAMPP)
- 📦 Maven
- 🔍 Postman (para testes)

---

## 🗂️ Estrutura das Entidades

### 📘 Curso
```json
{
  "id": 1,
  "nome": "Engenharia de Software",
  "cargaHoraria": 3600
}

## 🎓 Aluno

{
  "id": 1,
  "nome": "Lilian Martins",
  "email": "lilian@email.com",
  "cursoId": 1
}


## 🔧 Endpoints Principais

Método	Endpoint	Descrição
GET	/cursos	Lista todos os cursos
POST	/cursos	Cadastra um novo curso
PUT	/cursos/{id}	Atualiza um curso existente
DELETE	/cursos/{id}	Exclui um curso
---
🎓 Alunos
Método	Endpoint	Descrição
GET	/alunos	Lista todos os alunos
POST	/alunos	Cadastra um novo aluno
PUT	/alunos/{id}	Atualiza um aluno existente
DELETE	/alunos/{id}	Exclui um aluno
---
## ⚙️ Como Executar o Projeto

1. Inicie o **XAMPP** e verifique se o **MySQL** está rodando.

2. Crie o banco de dados no **MariaDB**:

   ```sql
   CREATE DATABASE universidade;

3. No arquivo application.properties, configure as credenciais:

spring.datasource.url=jdbc:mariadb://localhost:3306/universidade
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4.Execute o projeto pelo IntelliJ (classe principal DemoApplication).

5.Teste os endpoints no Postman em:

http://localhost:8080

##📘 Exemplo de Requisição (POST /cursos)

{
  "nome": "Engenharia de Software",
  "cargaHoraria": 3600
}


✨ Autor

## Lilian Martins

