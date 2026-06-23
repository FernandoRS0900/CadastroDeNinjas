# 🥷 Cadastro de Ninjas

API REST para cadastro e gerenciamento de usuários desenvolvida em Java com Spring Boot, como parte do curso **Java10x**. O projeto aplica na prática conceitos fundamentais de desenvolvimento back-end: criação de endpoints, mapeamento de entidades e operações CRUD.

> 🚧 Projeto em desenvolvimento ativo.

---

## 🎯 Objetivo

Consolidar os fundamentos do desenvolvimento back-end com Java e Spring Boot, praticando a criação de APIs REST com operações completas de criação, leitura, atualização e remoção de dados.

---

## 🛠️ Tecnologias utilizadas

| Tecnologia | Finalidade |
|---|---|
| Java 17 | Linguagem principal |
| Spring Boot | Framework back-end |
| Spring Data JPA | Mapeamento e persistência de entidades |
| H2 Database | Banco de dados em memória para desenvolvimento |
| Maven | Gerenciamento de dependências |

---

## 📋 Funcionalidades

- [x] Cadastro de ninja (POST)
- [x] Listagem de todos os ninjas (GET)
- [x] Busca por ID (GET)
- [ ] Atualização de cadastro (PUT)
- [ ] Remoção de ninja (DELETE)
- [ ] Validações de entrada
- [ ] Documentação dos endpoints (Swagger)

---

## 🚀 Como rodar o projeto

```bash
# Clone o repositório
git clone https://github.com/FernandoRS0900/CadastroDeNinjas.git

# Acesse a pasta
cd CadastroDeNinjas

# Execute o projeto
./mvnw spring-boot:run
```

O banco H2 sobe automaticamente com a aplicação. Para acessar o console do H2:

```
URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Usuário: sa
Senha: (deixe em branco)
```

---

## 📌 Status do projeto

- [x] Estrutura base com Spring Boot
- [x] Mapeamento de entidade com JPA
- [x] Banco H2 configurado
- [x] Endpoints de criação e listagem
- [ ] CRUD completo
- [ ] Validações
- [ ] Documentação Swagger

---

## 👨‍💻 Autor

**Luiz Fernando R. de Souza**
Estudante de Engenharia de Software — UniCesumar
Desenvolvedor Back-end Java em formação

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/luiz-fernandorodrigues-de-souza)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/FernandoRS0900)
