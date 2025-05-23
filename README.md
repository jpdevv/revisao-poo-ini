# Sistema de Gestão Acadêmica

## 📚 Sobre o Projeto
Este é um sistema de gestão acadêmica desenvolvido em Java que permite o gerenciamento de disciplinas e estudantes. O projeto segue uma arquitetura em camadas (MVC) e implementa diversos conceitos de Programação Orientada a Objetos.

## 🎯 Funcionalidades

### Gestão de Disciplinas
- Cadastrar nova disciplina
- Editar disciplina existente
- Remover disciplina
- Listar todas as disciplinas
- Geração automática de código para cada disciplina

### Gestão de Estudantes
- Cadastrar novo estudante
- Editar dados do estudante
- Remover estudante
- Listar todos os estudantes

### Vinculação Estudante-Disciplina
- Adicionar estudante à disciplina
- Remover estudante da disciplina

## 🏗️ Arquitetura do Projeto

### 📂 Estrutura de Diretórios
```
src/
├── business/
│   └── services/
│       ├── ConvertionService.java
│       ├── DisciplineService.java
│       ├── PrinterService.java
│       ├── ReaderService.java
│       ├── StudentService.java
│       ├── ValidationDisciplineService.java
│       └── ValidationStudentService.java
├── model/
│   ├── entities/
│   │   ├── Discipline.java
│   │   └── Student.java
│   └── repositories/
│       ├── DisciplineRepository.java
│       └── StudentRepository.java
└── presentation/
    ├── controller/
    │   ├── DisciplineController.java
    │   └── StudentController.java
    └── views/
        ├── DeleteView.java
        ├── ListView.java
        ├── Main.java
        ├── MenuView.java
        └── RegistryView.java
```

### 🔍 Detalhamento das Camadas

#### 📱 Presentation (Interface com Usuário)
- **Views**: Responsáveis pela interação com o usuário
  - `MenuView`: Exibe o menu principal do sistema
  - `RegistryView`: Gerencia os formulários de cadastro
  - `ListView`: Exibe listagens
  - `DeleteView`: Gerencia exclusões

- **Controllers**: Coordenam as ações entre Views e Services
  - `DisciplineController`: Gerencia operações de disciplinas
  - `StudentController`: Gerencia operações de estudantes

#### 💼 Business (Regras de Negócio)
- **Services**: Implementam a lógica de negócio
  - `DisciplineService`: Gerencia operações com disciplinas
  - `StudentService`: Gerencia operações com estudantes
  - `ValidationDisciplineService`: Valida dados de disciplinas
  - `ValidationStudentService`: Valida dados de estudantes
  - `ConvertionService`: Realiza conversões de tipos
  - `PrinterService`: Gerencia saídas no console
  - `ReaderService`: Gerencia entradas do usuário

#### 📊 Model (Dados)
- **Entities**: Classes que representam os objetos do sistema
  - `Student`: Representa um estudante
  - `Discipline`: Representa uma disciplina

- **Repositories**: Gerenciam o armazenamento dos dados
  - `StudentRepository`: Armazena dados dos estudantes
  - `DisciplineRepository`: Armazena dados das disciplinas

## 🚀 Como Executar

1. Certifique-se de ter o Java JDK instalado
2. Clone este repositório
3. Navegue até o diretório do projeto
4. Compile o projeto:
```bash
javac -d bin src/**/*.java
```
5. Execute o programa:
```bash
java -cp bin presentation.views.Main
```

## 🛠️ Tecnologias Utilizadas

- Java 17
- Programação Orientada a Objetos
- Arquitetura MVC
- ArrayList para armazenamento em memória

## 📝 Validações do Sistema

### Disciplinas
- Nome da disciplina não pode ser nulo ou vazio
- Nome do professor não pode ser nulo ou vazio
- Carga horária deve ser maior que zero
- Código é gerado automaticamente

### Estudantes
- Matrícula não pode ser nula ou vazia
- Nome não pode ser nulo ou vazio
- Email não pode ser nulo ou vazio
- Endereço não pode ser nulo ou vazio

## 👥 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request