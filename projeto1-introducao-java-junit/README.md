# Projeto 1: Introdução ao Java e Testes JUnit

Bem-vindo ao nosso primeiro projeto na jornada para dominar Java! 🌟

## Objetivo

Neste projeto, vamos dar os primeiros passos no mundo do Java, aprendendo como escrever código e, simultaneamente, \
garantindo que ele funcione corretamente com testes automatizados usando JUnit. \
Vamos criar uma pequena calculadora que faz operações simples, como somar, subtrair, multiplicar e dividir números.

## O que vamos aprender?

- Estrutura básica de um programa Java
- Criação de classes e métodos
- Uso do Maven para gerenciamento de dependências
- Introdução ao JUnit para testes unitários

## Estrutura do Projeto
projeto1-introducao-java-junit/\
├── src/\
│ ├── main/\
│ │ └── java/\
│ │ └── org/\
│ │ └── example/\
│ │ └── matematica/\
│ │ └── OperacoesMatematicas.java\
│ └── test/\
│ └── java/\
│ └── matematica/\
│ └── OperacoesMatematicasTest.java\
└── pom.xml\
└── README.md

## Passo 1: Estrutura Básica de um Programa Java

### Conceitos Básicos

Vamos começar com a estrutura básica de um programa Java. \
Cada programa Java é composto por classes e métodos. \
Uma classe é como uma planta de construção que define a estrutura e o comportamento de um objeto. \
Um método é uma função definida dentro de uma classe que realiza uma tarefa específica.

### Classe 'OperacoesMatematicas'

Vamos criar uma classe chamada `OperacoesMatematicas` que tem quatro métodos: `somar`, `subtrair`, `multiplicar` e `dividir`.

- **somar**: Recebe dois números e retorna a soma deles.
- **subtrair**: Recebe dois números e retorna a subtração deles.
- **multiplicar**: Recebe dois números e retorna a multiplicação deles.
- **dividir**: Recebe dois números e retorna a divisão deles. Se o divisor for zero, lança uma exceção.

## Passo 2: Testes Unitários com JUnit

### Introdução ao JUnit

JUnit é uma biblioteca em Java usada para criar e rodar testes automatizados. \
Testes são importantes porque nos ajudam a garantir que nosso código está funcionando corretamente.

### Classe 'OperacoesMatematicasTest'

Criamos uma classe `OperacoesMatematicasTest` para testar cada método da classe `OperacoesMatematicas`.

- **testeSoma**: Verifica se a soma de dois números está correta.
- **testeSubtracao**: Verifica se a subtração de dois números está correta.
- **testeMultiplicacao**: Verifica se a multiplicação de dois números está correta.
- **testeDividisao**: Verifica se a divisão de dois números está correta.
- **testeDividisaoPorZero**: Verifica se a exceção é lançada ao tentar dividir por zero.
- **testeSomaFalha**: Verifica se a soma de dois números está diferente do esperado.
- **testeSubtracaoFalha**: Verifica se a subtração de dois números está diferente do esperado.
- **testeMultiplicacaoFalha**: Verifica se a multiplicação de dois números está diferente do esperado.
- **testeDividisaoFalha**: Verifica se a divisão de dois números está diferente do esperado.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/andersonteixeira/aprendizado-java.git
   cd aprendizado-java/projeto1-introducao-java-junit

2. Execute os testes com Maven:
   ```bash
   mvn test
