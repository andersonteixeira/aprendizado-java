## Porque utilizamos a variável `escolha` inicializada com `-1`?

A variável `escolha` é inicializada com `-1` para garantir que o loop principal (`while (escolha != 0)`) seja executado pelo menos uma vez antes de qualquer condição de saída ser verificada. \
Vamos explorar isso em mais detalhes.

### Por que `-1`?
```java
int escolha = -1;
```

### 1. Garantia de Execução Inicial:

- Se `escolha` fosse inicializada com `0`, a condição do loop `while (escolha != 0)` não seria verdadeira, e o loop nunca seria executado.
- Ao inicializar `escolha` com `-1`, garantimos que a condição `escolha != 0` seja verdadeira na primeira execução, permitindo que o menu de opções seja exibido ao usuário pelo menos uma vez.

### 2. Controle do Fluxo do Programa:

- Inicializar escolha com um valor diferente de 0 permite que o programa controle corretamente a interação do usuário com o menu.
- O valor `0` é reservado para a condição de saída. Portanto, usar qualquer valor diferente de `0` (como `-1`) para inicialização assegura que a saída do loop só ocorrerá quando o usuário explicitamente escolher `0`.

## Fluxo de Execução
Aqui está uma visão detalhada de como o fluxo de execução funciona com a inicialização de `escolha` com `-1`:

### 1. Inicialização:
- `int escolha = -1;`

### 2. Primeira Verificação da Condição do Loop:
- `while (escolha != 0)`
- Como `escolha` é `-1`, a condição é verdadeira, e o loop é executado.

### 3. Exibição do Menu:
- O menu de opções é exibido ao usuário.

### 4. Leitura da Escolha do Usuário:
- O programa lê a escolha do usuário e atualiza a variável `escolha`.

### 5. Execução da Operação Escolhida:
- Se a `escolha` não for `0`, a operação correspondente é executada.
- Se a `escolha` for `0`, o loop termina.

### 6. Loop Continuar ou Terminar:
- O loop continua enquanto `escolha` for diferente de `0`.
- Quando o usuário escolhe `0`, o loop termina, e o programa exibe a mensagem de encerramento.

## Exemplo de Fluxo
Suponha que o usuário deseja inverter uma string. Aqui está o que acontece:

### 1. Inicialização:
- `escolha = -1`

### 2. Primeira Verificação do Loop:
- `while (escolha != 0)` é verdadeiro, então o loop começa.

### 3. Exibição do Menu:
- O menu é exibido.
- O usuário vê as opções e escolhe `1`.

### 4. Leitura da Escolha:
- `escolha = scanner.nextInt();` atualiza `escolha` para `1`.

### 5. Execução da Operação:
- `operacoes.getOrDefault("1", ...)` executa `inverterString(scanner)`.

### 6. Próxima Iteração do Loop:
- O loop recomeça com `escolha` agora sendo `1`.
- O menu é exibido novamente até que o usuário escolha `0`.

### 7. Encerramento:
- Quando o usuário escolhe `0`, `escolha` é atualizada para `0`, e o loop termina.

### Resumo
Inicializar a variável `escolha` com `-1` é uma técnica para assegurar que o loop do menu seja executado pelo menos uma vez,
permitindo que o usuário interaja com o programa e escolha uma operação. \
Isso garante um fluxo de controle eficaz e a correta execução do programa.