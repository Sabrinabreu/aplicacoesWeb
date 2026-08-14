# Sistema de Galeria de Imagens

Um sistema web completo para upload, gerenciamento, busca e visualização de imagens.

## Tecnologias Utilizadas

### Front-End
* **Framework:** Next.js 13 / React 18 / TypeScript
* **Estilização:** Tailwind CSS
* **Formulários e Validação:** Formik + Yup

### Back-End
* **Framework:** Spring Boot 4 (Java 25)
* **Segurança:** Spring Security + JJWT
* **Persistência de Dados:** Spring Data JPA

### Banco de Dados & Infraestrutura
* **Banco de Dados:** PostgreSQL
* **Autenticação:** Token JWT (Algoritmo HS256), arquitetura *stateless*, com tempo de expiração de **60 minutos**.
* **Empacotamento & Containers:** Docker / docker-compose executando **4 serviços**:
  1. `app` (Front-end Next.js)
  2. `sbootapp` (Back-end Spring Boot)
  3. `db` (Banco de Dados PostgreSQL)
  4. `pgadmin` (Interface para gerenciamento do banco)

---

## Requisitos do Sistema

O sistema foi desenvolvido estritamente com base nos seguintes Requisitos Funcionais (RF):

### Autenticação e Gestão de Usuários
* **RF01:** O sistema deve permitir que um visitante crie uma conta informando nome, e-mail e senha.
* **RF02:** O sistema deve impedir o cadastro de um e-mail já existente.
* **RF03:** O sistema deve permitir que um usuário cadastrado se autentique com e-mail e senha.
* **RF04:** O sistema deve emitir um token de acesso (JWT) após autenticação bem-sucedida.
* **RF05:** O sistema deve permitir que o usuário autenticado encerre sua sessão.

### Gerenciamento de Imagens
* **RF06:** O sistema deve permitir que o usuário autenticado publique uma nova imagem, informando nome, tags e arquivo.
* **RF07:** O sistema deve validar o formato (`PNG`, `JPEG`, `GIF`) e o tamanho do arquivo antes do envio.

### Busca e Visualização
* **RF08:** O sistema deve permitir que o usuário pesquise imagens por nome, por tag e/ou por extensão.
* **RF09:** O sistema deve exibir as imagens encontradas em formato de galeria, com nome, extensão, tamanho e data de upload.
* **RF10:** O sistema deve permitir a visualização da imagem em tamanho real a partir da miniatura.

### Interface e Feedback
* **RF11:** O sistema deve notificar o usuário sobre sucesso ou falha de cada operação realizada.

---

## Como Executar o Projeto

### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
* [Docker]
* [Docker Compose]
* [Node.js]
* [Postgre]

### Clonando o Repositório (Git bash)
```bash
git clone https://github.com/Sabrinabreu/aplicacoesWeb.git
cd aplicacoesWeb
```

### Suba os containers:
   Na raiz do projeto (onde se encontra o arquivo `docker-compose.yml`), execute:
   ```bash
   docker compose up --build
   ```

### Portas para acesso:
   * **Front-End:** `http://localhost:3000`
   * **pgAdmin (banco `db`):** `http://localhost:15432`

---
## Desenvolvedores
Sabrina Abreu
