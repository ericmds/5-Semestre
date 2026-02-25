# Estudo Dirigido (aula anterior)

## 1. Caracterize um sistema de computação moderno
### Sistema de Computação Moderno
* <img width="725" height="672" alt="{FE76592C-01B5-4526-BED0-D3D58F8BB24A}" src="https://github.com/user-attachments/assets/51b9d086-2885-40c7-86c5-88748838779a" />


## 2. Quais a etapas de inicialização do computador?
### Inicialização
1. Exercício da BIOS - Teste de ...
2. Carregamento do BOOTLOADER
3. Primeiro processo do SO é iniciado: INIT
4. SO espera por 1 evento

## 3. O que é interrupção? Como os Sistemas Operacionais tratam as interrupções?
### Tratamento de interrupção (erros, eventos)
<img width="610" height="535" alt="{87716F10-0BEB-4886-B6D2-3288A003DCC0}" src="https://github.com/user-attachments/assets/9ffc81dc-6a9c-4bea-a996-8ecbf83ba9fe" />

1. Pausa do processamento
2. Nº IRQ → Tratador de interrupções (SO)
3. Chaveamento/troca de contexto
   * Salvar o contexo da escução
   * Carrega ou restaura o contexo da próxima execução
4. Buscar na TABELA ou VETOR DE INTERRUPÇÕES o endereço da rotina para tratar a IRQ.
   * | IRQ | Rotina |
     | -----------|--------- |
     |...|...|
     |...|...|
     
6. Carregar a rotina e tratar a interrupção

## 4. Defina I/O síncrona e I/O assíncrona. Qual permite melhor uso da CPU?
### I/O síncrona e I/O assíncrona

## 5. Qual a finalidade da DMA – Direct Memory Access?
### DMA = Acesso Direto à Memória

## 6. Como funciona a RAM? Qual o ciclo básico de execução de uma instrução?
### RAM
#### Ciclo de execução de uma instrução
1. Busca 1 instrução na RAM
2. Decodificar a instrução
3. Buscar os operandos na RAM
4. Executar a instrução
<img width="850" height="786" alt="{B7118629-B28A-489D-8A9E-D4C7DC5B9A8D}" src="https://github.com/user-attachments/assets/b1cccefb-e62a-43ce-9891-8a186769e20f" />

## 7. Caracterize a estrutura de armazenamento de um sistema de computação
<img width="858" height="573" alt="{ED85F27E-EF60-4214-87D4-4CE491E3AB7C}" src="https://github.com/user-attachments/assets/ea4ee1bf-8c68-4e9b-bc86-04f22b90911d" />

## 8. Em que consiste o uso de cache?
### Dados recentemente usados são armazenados na **CACHE** (compatibilizar a velocidade da CPU e RAM)
* Coerência e consistência de cache

## 9. Caracterize os diferentes tipos de proteção de hardware suportados em um sistema de computação.
<img width="764" height="185" alt="{0FA99A0B-8302-4CE0-9CA1-7E56C9CE2DCC}" src="https://github.com/user-attachments/assets/053d5a40-0b47-4188-a38f-a68f89cd5279" />
#### Memória Principal
* Proteção de espaço de enderaçamento de cada tarefa
  * Para cada tarefa, 2 registradores na CPU necessário para controlar o espaço de uma tarefa na memória
    * Registrador Base e o Registrador limite
      * Registrador Base: armazena o primeiro processo da tarefa na memória
      * Registrador Limite: armazena o tamanho da tarefa

#### CPU
* Impedir que um programa monopolize a CPU, como isso?
  * Com um **temporizador** de hardware, periodicamente interrompe a CPU
    
#### I/O
* Instruções privilegiadas

#### Modo Dual de Operação
* Modo supervisor, monitor, Karnel
  * Todas as intruções do processador podesse ser executados (instruções priviligiadas)
* Modo usuário
  * Algumas instruções disponíveis

---

# Estrutura do Sistema Operacional

## Mecanismo de Interrupções
* Sinalizar ocorrência de eventos
* Tratador de interrupção
* Interrupção pode ser ocasionado por hardware, software ou por uma exceção
  * Exceções: Interrupção ocorrida por erros. Ex: overflow, instrução ilegal, divisão por zero..
* Vetor de Interrupções
* Execução de interrupção
  * Transfere o controle para o tratador (salva o contexto de execução)
  * Desvia controle para o tratador
  * Retorna execução (restaura contexto de execução)
* Chamada de Sistema
  * Processo usuário solicita serviços ao sistema operacional
    * Interrupções de software (traps)

## Proteção
* O sistema operacional deve garantir a correta utilização dos recursos computacionais e propiciar a execução das aplicações nocomputador.
* Para isto, é necessário mecanismos de proteção para que as aplicações não consigam acessar o hardware diretamente e sim, que isto seja mediado pelo sistema operacional.
* Há diferentes modos de execução (privilégios), que constituem oModo Dual de operação:
  * Modo supervisor, privilegiado, sistema, monitor ou kernel
  * Modo usuário
 
## Modo Dual de Operação
* Arquitetura de processadores oferecem mecanismos para diferenciar dois modos de operação
  * Modo Supervisor (privilegiado)
    * Modo de execução sistema operacional (instruções privilegiadas)
    * Execução de todas as instruções do processador
* Modo Usuário
  * Execução dos processos usuários
  * Somente um subconjunto de instruções do processador, registradores e portas de E/S estão disponíveis.
  * Caso o código em execução tentar executar uma instrução não disponível, será gerada uma exceção.
* Chaveamento de modos
  * Interrupção (modo usuário → modo supervisor) - malloc
  * Instrução (modo supervisor → modo usuário)

## Proteção de memória
* Falado em aula, no estudo dirigido
## Proteção de CPU
* Falado em aula, no estudo dirigido

## CHAMADAS AO SISTEMA
* Aula que vem

## Estrutura do Sistema
* Sistema Operacional deve ser dividido em pequenos componentes e não ser um sistema monolítico
* Principais componentes:
  * **Núcleo**
    * Kernek => Gerência do Processador e Gerência da RAM e Comunicação
  * **Drivers**: códigos específicos para acessar os dispositivos físicos. Ex.: discos rígidos IDE, SCSI, portas USB, placas de vídeo
  * **Códigos de inicialização**: reconhecer, testar e configurar os dispositivos instalados. Carregar o núcleo do SO e iniciar a execução.
  * **Programas utilitários**: funcionalidades complementares do SO

## Kernel do SO
#### É a parte do SO executada com interrupções desabilitadas e no modo privilegiado

#### Nos trechos críticos não há interrupção
* Por exemplo, no momento da inserção de um processo na fila de prontos

#### O Kernel pode ser monolítico
* Quanto todos os componentes do SO são executados com interrupções desabilitadas e no modo privilegiado
* Toda e qualquer parte do SO é executada de maneira indivisível
  * Cada trap (chamada ao sistema) ou interrupção desabilita o sistema de interrupções

#### Desvantagens
* Pode haver muita espera
* Complexidade da estrutura de organização do kernel

#### O Kernel é um pequeno monitor monolítico que recebe o controle quando ocorrem chamadas ao sistema ou interrupções

#### Os serviços são implementados fora do kernel
* Por processos específicos
* Um processo para controlar o dispositivo = driver de dispositivo

#### Mantém o descritor do processo e implementa funções para sincronização e comunicação

#### Pode ser microkernel ou monitor monolítico

#### Como os componentes são combinados e interconectados
* Estrutura simples
* Camadas
* Microkernels
* Módulos

#### Sistemas sem estrutura bem definida
* Iniciaram pequenos, simples e limitados  cresceram
* Exemplo: MS-DOS
  * fornecer funcionalidade máxima no menor espaço possível (limitação hardware: Intel 8088 não fornece modo dual e proteção de hardware)  não foi dividido em módulos
  * Hardware base ficou acessível
  * Programas aplicativos podem acessar as rotinas básicas de I/O para escrever diretamente na tela e nas unidades de disco

## Estrutura Simples
<img width="696" height="429" alt="{B8C1FC30-B61E-4D0B-9985-7207B859AD19}" src="https://github.com/user-attachments/assets/e7a9f80a-3fb5-4ebc-b6e4-3e67282b1e5e" />

## Estrutura do Unix
#### O UNIX originalmente foi limitado pela funcionalidadede hardware
#### Dividido em duas partes
* Kernel
  * Inclui Interfaces e drives de dispositivos (adicionados com a evolução)
  * No Unix, kernel é o que está abaixo da interface de chamadas ao sistema e acima do hardware
  * Fornece: sistema de arquivos, escalonamento de CPU, gerência de memória, funções do sistema operacional através de chamadas ao sistema
#### Programas de sistema
<img width="771" height="318" alt="{9D564DA4-AE2D-4820-A8F9-75EF5AD6D324}" src="https://github.com/user-attachments/assets/6ade7bfd-d21a-454a-ad3c-6f1da10677e0" />

## Camadas
* Forma de modularização de um sistema
* Uma camada de sistema operacional
  * é uma implementação de um objeto abstrato
  * Consiste em estruturas de dados e rotinas que podem ser chamadas por camadas superiores
* As camadas são construídas de forma que somente utilizem os serviços das camadas de nível mais baixo
  * Simplifica a verificação e depuração do sistema
* Menos eficientes devido à hierarquia de camadas; Permite controle maior do hardware, em relação à abordagem simples
* A primeira camada pode ser depurada sempreocupação com o resto do sistema, porque utilizasomente o hardware básico para implementar suasfunções
* E assim sucessivamente!
* Dificuldade: definição adequada das camadas
* Tendem a ser menos eficientes que outros tipos → emcada camada, os parâmetros podem ser modificados,os dados precisam ser transferidos... custos sãoacrescentados → maior tempo na chamada aosistema

### Exemplos
* OS/2
  * Acrescentou camadas, operações multitarefas e emmodo dual
  * Não permite ao usuário acesso aos recursos de baixonível
  * Sistema operacional tem mais controle sobre ohardware e programas em execução
* MULTICS
* Windows NT (parcialmente)
  * Implementa camada inferior de abstração dohardware (HAL – Hardware Abstraction Layer)
<img width="631" height="404" alt="{AAD24856-5CDF-4135-8803-F7C994F91813}" src="https://github.com/user-attachments/assets/fabc95d0-2cec-4a6c-8bdf-197320fe1f75" />

## Microkernel ou Micronúcleo
* Expansão do Unix, o kernel tornou-se grande e difícil degerenciar
* 1980 – Sistema Operacional Mach – Carnegie MellonUniversity
  * Abordagem Microkernel
    * Implementa somente os componentes essenciais do SO no Kernel; os demais são implementados como programas de sistema e de usuário
    * Retirou-se do kernel o código de “alto nível”
    * Os componentes do SO comunicam-se internamente por meio de trocas de mensagens
    * Kernel menor
    * Facilidade de manutenção
* Fornecem
  * Gerência mínima de memória e processos
  * Um recurso de comunicação entre programa do usuário eserviços que estão em execução também no espaço deusuário
* Proporcionam
  * Facilidade de expansão do sistema  novos serviços sãoadicionados ao espaço do usuário
  * Modificações facilitadas no kernel
  * Maior segurança e confiabilidade em caso de falhas
* Possibilitar a comunicação entre o programa cliente e os diversos serviços disponibilizados
  * Trocas de mensagens
  * O programa cliente e o serviço não interagem diretamente e sim via microkernel
* Sistemas baseados no kernel do Mach
  * UNIX Digital
  * Apple MacOS X
<img width="745" height="447" alt="{2716F734-D6DC-4588-8A93-73817084F765}" src="https://github.com/user-attachments/assets/25efa1b3-f2ff-4a9f-b049-d1e5eca7239d" />

## Módulos
* POO → Kernel modular
* Há um kernel básico e módulos carregáveisdinamicamente
* A interface entre os módulos é claramente definida
* Solaris, Linux, Mac OS X
* Flexibilidade

## Máquina Virtual
* VM da IBM
* O SO possibilita que um processo “possua” seu próprio processadorcom sua própria memória
  * Técnicas de escalonamento e memória virtual
* Cada processo recebe uma cópia do computador básico
* O computador físico compartilha seus recursos para que isto ocorra
  * Escalonamento de CPU pode criar a aparência que cada usuário possui seupróprio processador
* Atualmente, usada para portabilidade dos sistemas
* Vantagens:
  * Aos usuários e desenvolvedores
  * Isomamento dos recursos da Máquina Virtual
  * Testes
* Desvantagens:
  * Difícil de implementar
<img width="496" height="338" alt="{70409CFD-B03E-4FBF-97C0-B3A7F99F5430}" src="https://github.com/user-attachments/assets/945b9a46-dad9-4459-82f6-4aaf6ec020b7" />

## Considerações Finais
* Abordagens
  * Camadas
  * Microkernel
  * Módulos
  * Máquina Virtual
não são mutuamente exclusivas
