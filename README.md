# 🔐 MyPass

## 🧩 Tecnologias e Dependências

- **Java:** Linguagem principal do projeto.
- **Maven:** Ferramenta de automação de build e gerenciamento de dependências.
- **Insomnia:** Ferramenta de testes de API REST.
- **Spring Web:** Módulo do Spring responsável pela criação de aplicações web, incluindo suporte a RESTful APIs.
- **Spring Boot DevTools:** Ferramenta que facilita o desenvolvimento, oferecendo recursos como reinicialização automática e live reload.
- **Spring Data JPA:** Abstração da persistência de dados que simplifica a implementação de repositórios usando JPA.
- **Spring Security:** Framework que fornece autenticação, autorização e outras medidas de segurança para proteger a aplicação.
- **Lombok:** Biblioteca que gera automaticamente getters, setters, construtores e outros métodos com anotações simples.
- **H2 Database:** Banco de dados relacional em memória, ideal para testes e desenvolvimento local.
- **OAuth2 Resource Server:** Módulo do Spring Security que permite que a aplicação atue como um servidor de recursos protegido por tokens OAuth 2.0, garantindo acesso seguro às APIs.

---

## 🚀 Como Usar

1. **Clone o Repositório:**

   ```bash
   https://github.com/RodrygoYamasaki/mypass.git
   ```
   
2. **Utilize a IDE de sua escolha (IntelliJ, VS Code, Eclipse, etc.)**
3. **Executar a aplicação:**

   ```bash
   mvn spring-boot:run
   ```

4. **Testar a API: Use o Insomnia para enviar requisições HTTP.**

   ```bash
   GET http://localhost:8080/pass
   ```

   ```bash
   POST http://localhost:8080/login
   ```
   
