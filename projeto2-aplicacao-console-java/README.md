# Aula: Entendendo a Aplicação Console

Bem-vindo à nossa aula sobre a aplicação de console em Java! \
Neste documento, vamos explorar detalhadamente o código da classe `AplicacaoConsole`. \
Vamos entender o propósito de cada método, a funcionalidade do código e as melhores práticas utilizadas. 

#### Vamos começar!

## Visão Geral

A classe `AplicacaoConsole` permite ao usuário escolher entre diferentes operações para executar no console. \
As operações incluem inverter uma string, contar o número de vogais em uma string, \
somar os dígitos de um número e converter uma string para maiúsculas.

## Estrutura da Classe

### Constantes de Cores

```java
public static final String RESET = "\033[0m";
public static final String RED = "\033[0;31m";
public static final String GREEN = "\033[0;32m";
public static final String YELLOW = "\033[0;33m";
public static final String BLUE = "\033[0;34m";
```
Essas constantes são usadas para adicionar cores ao texto no console. \
Isso torna a interface mais amigável e ajuda a distinguir diferentes partes da saída. \
Por exemplo, `RESET` redefine a cor do texto, `RED` define a cor vermelha, `GREEN` define a cor verde, e assim por diante.

## Método `main`

### Explicação:

#### 1. Inicialização do Scanner:
```java
Scanner scanner = new Scanner(System.in);
```
Este objeto é usado para ler a entrada do usuário.

#### 2. Inicialização da Variável escolha:
```java
int escolha = -1;
```
Esta variável armazena a escolha do usuário. Inicialmente, é definida como -1.
- [Saiba mais aqui](../docs/variavel_escolha_usuario.md)

#### 3. Definição do Mapa de Operações:
````java
Map<String, Runnable> operacoes = Map.of(
        "1", () -> inverterString(scanner),
        "2", () -> contarVogais(scanner),
        "3", () -> somarDigitos(scanner),
        "4", () -> converterMaiusculas(scanner)
);
````
Este mapa associa cada escolha do usuário a uma operação específica, representada por um método.

#### 4. Loop Principal:
````java
while (escolha != 0) {
    // Exibição das opções
    // Leitura da escolha do usuário
    // Execução da operação correspondente
}
````
O loop continua até que o usuário escolha 0 para sair. \
Dentro do loop, as opções são exibidas, a escolha do usuário é lida, e a operação correspondente é executada.

#### 5. Fechamento do Scanner:
```java
scanner.close();
```
### Métodos de Operações
`inverterString` \
````java
private static void inverterString(Scanner scanner) {
   //Implementação
}
````
Este método solicita ao usuário uma string e a exibe invertida.

`contarVogais`
````java
private static void contarVogais(Scanner scanner) {
  //Implementação do método
}
````
Este método conta o número de vogais em uma string fornecida pelo usuário.

`somarDigitos`
````java
private static void somarDigitos(Scanner scanner) {

  //Implementação do método
}
````
Este método soma todos os dígitos de uma string de números fornecida pelo 

`converterMaiusculas`
````java
private static void converterMaiusculas(Scanner scanner) {
  //Implementação do método
}
````
Este método converte uma string fornecida pelo usuário para letras maiúsculas.

## Considerações Finais
Este código é uma excelente demonstração de como criar uma interface de usuário simples e interativa no console. \
Utilizamos boas práticas como o uso de Map para associar operações, Scanner para leitura da entrada do usuário, e métodos auxiliares para modularizar o código.

### Melhores Práticas Demonstradas:
#### 1. Uso de Constantes:
Utilizar constantes para cores facilita a manutenção e torna o código mais legível.

#### 2. Mapeamento de Operações:
Utilizar um Map para associar escolhas a operações simplifica a adição de novas operações no futuro.

#### 3. Leitura e Validação da Entrada do Usuário:
Verificar se a entrada do usuário é válida antes de prosseguir ajuda a evitar erros e melhora a experiência do usuário.

Espero que esta explicação detalhada tenha ajudado a entender cada parte do código. Bons estudos e boa programação!








