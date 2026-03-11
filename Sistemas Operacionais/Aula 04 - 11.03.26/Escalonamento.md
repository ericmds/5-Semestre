# Processos

## Definição

## Ciclo de Vida

## Escalonamento de Processos

### Filas de Escalonamento

### Escalonador (scheduler)
* Responsável por selecionar o processo (nas várias filas) que será alocado na CPU
* Processos migram entre as várias filas de escalonamento durante sua vida
* Possui três tipos, o que define cada tipo é a frequência de que são chamados
  * Escalonador de Longo Prazo
  * Escalonador de Médio Prazo
  * Escalonador de Curto Prazo
<img width="898" height="523" alt="{CD0AD2CB-0EA6-4A2A-B63E-0DD5C00DBD29}" src="https://github.com/user-attachments/assets/84d4a229-b93c-4363-848e-3092bf216a89" />

#### Escalonador de Longo Prazo
* Seleciona processos e os carrega na memória para execução
* É executado com muito menos frequência
* Deve selecionar processos com cuidado a fim de balancear a carga do sistema
* Controla o grau de multiprogramação
  * Controla quantos processos estão na fila
  * O grau estável no sistema, seria quando um processo sai do sistema, outro entra
*  Chamado somente quando os processos saem do sistema
*  Seleciona uma boa combinação de
  * Processos I/O Bound
  * Processos CPU Bound
* Muitos I/O Bound: Fila de prontos vazia
* Muitos CPU Bound: Fila de I/O vazia; dispositivos sem uso
  
#### Escalonador de Médio Prazo
* Basicamente quando a memória RAM está "sobrecarregada", a Memória de Médio faz um Swapping da Memória Ram para o Disco Rígido, colocando dados "inuteis" no disco rígido para liberar um pouco de memória RAM e depois ele coloca essas dados na memória novamente

#### Escalonador de Curto Prazo

### Descritor de Processo ou PCB - Process Control Block
<img width="862" height="418" alt="{1703A8B4-194E-4C76-9AC9-46D57F96D621}" src="https://github.com/user-attachments/assets/7e2fa9cf-2d19-4338-bf23-3ecf0267d9d6" />

#### Contador de Programa (PC)
* É o que está na fila
#### Ponteiro da Pilha (SP)

### Operações nos Processos
* Quando é feito o processo fork() ele cria um processo filho, como se ele se duplicasse na memória
* 
