Escalonador são executados pelo EScalonador de Curto Prazo
Possivelmente estão na fila de prontos para serem executados
Possui o objetivo de
  Aumentar a producao do sistema
  DIminuir o tempo de resposta aos usuarios
  MAnter o processor ocupado ao maximo
  DIminuir o tempo medio da fila
Uma fila nao necessariamente é implementado como FIFO
Pode ser
  Fila de prioridades
  Lista encadeada desordenada
  Arvore
Quais siuacao geram o processos?
<img width="702" height="318" alt="image" src="https://github.com/user-attachments/assets/04a2139a-8694-485f-aad9-92c8e4b2ae51" />
Cria um processo, vai para fila de pronto, quando estiver disponivel vai para fila de execucao, pode ocorrer uma prioridade e ir para a fila de em espera, retorna para fila de pronto e vai para execução e ao final encerrra
O escalonador pode ser
Preemptivo
  Interrupcoes habilitadas
  Execucao podem ser interrompidas
Nao preemptivo ou cooperatov
  só libera a cpu alocada quando terminar o processo

No escalonamento preemptivo 
  ha custo associado a coordenacao do acesso aos dados compartilhados
  Influencia no projeto do kernel do SO
    chamada ao sistema o kernel pode esta ocupado com outro processo
    podem gerar mudancas em dados compartilhados
    e necessario a conclusao de uma chamada ao sistema ou operacao i/o antes de fazer a troca de contexo
  devido ao escalonamento preeptivo alguns SO sao implementados de forma a esperar a conclusao de uma chamada ao sistema, oude e um bloo de opracoes antes de ser efetuada a troca
    simplicidade do kernel
    versoes do unix
    nao eficiente para sistema de tempo real
  possibilidade de habilitar/desabilitar as interrupcoes a fim de roteger uma secao de codigo

# Dispatcher = Executor
Módulo que dá o controle da CPU ao processo escalonado. Faz:
• passagem para o modo de usuário / supervisor;
• troca de contexto:
• Salva no descritor de processo ou na pilha do processo
• Ao ser restaurado, o Program Counter (PC) indica o ponto de continuação da
execução
• Mudança para posição adequada no programa do usuário conforme o Program
Counter (PC)

Critérios de Escalonamento
• São critérios utilizados para comparação de algoritmos / políticas de
escalonamento
• O escalonamento procura maximizar os seguintes critérios:
• Utilização de CPU: Deve ficar o maior tempo possível ocupada
• Throughput: Número de Processos terminados por unidade de tempo. Por
exemplo: 1 processo / hora; 10 processos / segundo

Critérios de Escalonamento
• O escalonamento procura minimizar os seguintes critérios:
• Tempo de Retorno: É o tempo entre a Submissão e a Conclusão do
Processo. Envolve o tempo na fila de prontos, em execução, usando
dispositivos...
• Tempo de Espera: Tempo esperando na fila de processos prontos (não
afeta operações de I/O)
• Tempo de Resposta: É o tempo entre a Submissão e a Primeira Resposta
do processo (não considera a velocidade do dispositivo de saída)
(diminuir um processo que esta na fila ou que esta na espera de um recurso)

Políticas de Escalonamento
• As políticas de escalonamento constituem-se em algoritmos de
escalonamento que selecionam quais processos devem utilizar a CPU em
determinado instante. As principais políticas são:
  First-Come, First-Served (FCFS) ou First-In, First-Out (FIFO)
  Shortest Job First (SJF) ou Shortest Job Next (SPN).
  Escalonamento por prioridade
  Round-Robin ou Revezamento Circular ou Fatia de Tempo

Políticas de Escalonamento
• Existem outros algoritmos de escalonamento como High Response Ratio
Next (HRRN), Shortest Remaining Time (SRT) e também a combinação de
mais de uma política de escalonamento, caracterizando os escalonadores
por:
• Múltiplas Filas
• Múltiplas Filas com realimentação

Algoritmos de Escalonamento
• Escalonamento First-Come, First-Served (FCFS) ou First-In, First-Out (FIFO)
• Escalonamento Shortest Job First (SJF)
• Escalonamento por Prioridade
• Escalonamento Round-Robin (Revezamento)
• Escalonamento por Múltiplas Filas
• Escalonamento por Múltiplas Filas com realimentação

First-Come, First-Served (FCFS) ou First-In, First-Out (FIFO)
• É o algoritmo mais simples de implementar: o Processo que solicita a CPU
primeiro, recebe primeiro, ou seja, conforme os processos vão chegando são
inseridos no fim da fila de prontos.
• É implementado por uma FIFO: um processo entra na fila de processos
prontos e seu PCB é ligado ao final da fila.
• O processo utiliza CPU até o término do processamento, ou realize uma
chamada ao sistema. Quando a CPU é liberada, ela é alocada ao processo
que está no início da fila.
• O processo que entra em execução é removido da fila de prontos.
•  Geralmente, apresenta tempo de espera longo, pois não favorece os
processos I/O bound. Exemplo:
<img width="491" height="233" alt="image" src="https://github.com/user-attachments/assets/eaba4f06-dbab-475d-b52a-55d4d2798ab7" />
(para executar o P3, que levaria 3 segundos, como ele é o ultimo a entrar, ele vai ter que esperar toda a execucao, demorando no total de 26 minutos)

First-Come, First-Served (FCFS) ou First-In, First-Out (FIFO)
• Situação Dinâmica:
• Um Processo limitado pela CPU: obtém e detém a CPU.
• Muitos Processos limitados por I/O: terminam sua operação de I/O e passam para Prontos
• Dispositivos de I/O ociosos
• Processo limitado pela CPU termina e passa para operação de I/O
• Todos os Processos limitados I/O são executados pois tem surtos curtos de CPU
• Executam rapidamente e voltam para a fila de I/O
• CPU ociosa
• Processo limitado pela CPU mais uma vez vai para fila de prontos e retorna para a CPU
• Processos limitados por I/O esperam na fila de prontos até a CPU estar disponível

Shortest Job First - SJF (Menor processo primeiro)
• Para cada processo é associada a duração de seu próximo ciclo de surto de
CPU
• Quando a CPU está disponível, o processo a ser escalonado é o que tem
surto de menor duração.
• Se houver empate, usa-se o escalonamento FCFS
• É um algoritmo ótimo (algo bom, busca a melhor solução dentro do processamento)
• Tempo de Espera Médio e mínimo
<img width="597" height="342" alt="image" src="https://github.com/user-attachments/assets/2ba100bb-5e97-4a0d-b5f0-66f2d18c1670" />

Shortest Job First - SJF
• Problema
• Para o escalonamento de CPU (escalonador de curto prazo) não existe
como saber a duração do próximo ciclo de surto de CPU
• Em sistemas batch, o usuário pode especificar esse tempo quando
submete o job
• Pode-se fazer uma previsão: espera-se que o próximo ciclo de surto de
CPU seja semelhante em duração aos anteriores

Escalonamento por Prioridade
• SJF é um caso de escalonamento por prioridade:
• A prioridade é dada aos processos de menores ciclos de surtos de CPU
• Na política de escalonamento por Prioridade, uma prioridade é associada a
cada processo e a CPU é alocada ao processo de mais alta prioridade.
• Se houver empate, o escalonamento FCFS é utilizado

Escalonamento por Prioridade
• Prioridades
• São definidas em faixas de valores:
• 0..10
• 0..255
• É pré-definido se a prioridade mais alta é determinada pelo maior ou menor número
• Consideraremos o menor número como sendo a prioridade mais alta

Escalonamento por Prioridade
• As Prioridades podem ser:
• Interna
• Representam alguma quantidade mensurável para calcular a prioridade do
processo (tempo, memória, arquivos abertos, razão entre surtos I/O e CPU)
• Externa
• Definida por critérios externos ao Sistema Operacional (importância do
processo, tipo, quantidade paga pelo uso no computador, departamento...)

<img width="615" height="327" alt="image" src="https://github.com/user-attachments/assets/da2c899e-b62e-4540-9ebb-b1566f0221b3" />

Escalonamento por Prioridade
• Pode ser não-preemtivo ou preemptivo.
• Por exemplo, na seguinte situação: um processo chegou no sistema durante a
execução de outro e o processo que chegou tem prioridade mais alta
• No escalonamento não-preemptivo:
• o processo é colocado no início da fila, pois tem prioridade mais alta;
• No escalonamento preemptivo:
• o processo em execução é interrompido e a CPU é alocada ao novo processo.
(preemprivo pode ser interrompido nao preemptivo nao pode ser interrompido
troca de contexto tem gasto também)

Escalonamento por Prioridade
• Problema: Bloqueio por tempo indefinido ou starvation ou postergação
indefinida
• Processos de baixa prioridade podem ficar esperando pela CPU
indefinidamente.
• Solução
• Técnica de Envelhecimento (conhecida como aging): consiste em
aumentar gradativamente a prioridade dos processos que estão na fila de
Prontos durante muito tempo, para favorecer sua execução.

Escalonamento Round – Robin (RR) ou Revezamento Circular ou Fatia de Tempo
• Adequado para Sistemas de Tempo Compartilhado
• É o escalonamento FCFS acrescido da preempção para alternar entre os processos
• O sistema define um quantum de tempo (fatia)
  • 10, 100 ms
• O processador percorre a Fila de Prontos, alocando os processos por um intervalo
de tempo de até um quantum.
• É mantido por FIFO: novos processos são adicionados ao final da fila
(quantum definica de quanto tempo ele vai processar
so executa no tempo predefinidio, se nao terminou ate o tempo acabar volta para fila ate chegar sua vez novamente)

<img width="826" height="426" alt="image" src="https://github.com/user-attachments/assets/48462f65-8e7c-4afc-99cd-5ec2a30c84bc" />

Escalonamento Round – Robin (RR)
• 1 - Surto de CPU de menos de um quantum
• O próprio processo libera CPU
• O próximo processo é escalonado
• 2 - Surto de CPU excede um quantum
• Temporizador esgotará o tempo de execução do processo atual
• Acontece Interrupção do SO
• Há Troca de contexto dos processos
• Processo interrompido vai para o final da fila de prontos
• O próximo processo é escalonado

<img width="737" height="421" alt="image" src="https://github.com/user-attachments/assets/38e47936-c458-40b8-9e92-b18a3391dd0b" />

Escalonamento Round – Robin (RR)
• O Algoritmo Round-Robin é preemptivo
• Se houver n processos na Fila de Prontos e q quantum
• Então
• Cada processo terá 1/n do tempo da CPU em lotes de no máximo q
unidades de tempo
• Cada processo deve esperar no máximo (n-1)q unidades de tempo até o
próximo quantum

Escalonamento Round – Robin (RR)
• Desempenho depende do tamanho do quantum
• Se o quantum for muito grande -> ficará semelhante ao FCFS
• Se o quantum for muito pequeno -> compartilhamento de processador ->
como se cada um dos n processos tivesse seu próprio processador
executando a 1/n da velocidade real do processador (execução com
travamentos: executa e para, executa e para...)
• Tempo de Retorno também depende do tamanho do quantum

Escalonamento por Múltiplas Filas
• Utilizado em casos onde os processos podem ser classificados em diferentes grupos
como por exemplo:
• Processos de Primeiro Plano (interativos)
• Podem ter prioridade em relação aos outros processos
• e
• Processos de Segundo Plano (batch)
• Possuem diferentes tempos de resposta, portanto podem ter escalonamentos
distintos

Escalonamento por Múltiplas Filas
• A fila de processos prontos é dividida em várias filas separadas por um dos critérios:
• Prioridade
• Tamanho
• Tipo
• Cada fila possui seu próprio algoritmo de escalonamento
• Deve haver escalonamento entre as filas
• Geralmente Preemptivo de Prioridade Baixa (fila do primeiro plano pode ter prioridade absoluta sobre a de segundo plano)
• ou
• O tempo é fracionado entre as filas

<img width="835" height="446" alt="image" src="https://github.com/user-attachments/assets/486911de-68c1-40b8-9e9d-9338bac96dff" />

Escalonamento por Múltiplas Filas com realimentação
• No caso anterior, os processos não se movem entre as filas. Apesar de
apresentar um baixo custo de escalonamento, não é um processo flexível.
• Nesse escalonamento
• Processo se move entre as filas
• Processos são separados por diferentes ciclos de surtos de CPU

• Se um processo utilizar surto de CPU excessivo, é movido para uma fila de
menor prioridade
• Logo: os processos limitados por I/O estão nas filas de prioridade mais alta
• Possui técnica de Envelhecimento: processo que espera demais em uma fila
de baixa prioridade passa para uma fila de maior prioridade

<img width="835" height="446" alt="image" src="https://github.com/user-attachments/assets/4bd0d1ed-8884-4b65-b4ef-9194be6c3140" />

Escalonamento por Múltiplas Filas com realimentação
• Executa todos os processos das filas nessa sequência
F0 → F1 → F2
• Se chegar um processo na F1, interrompe o da F2. O mesmo acontece se
chegar um processo na F0
• F2 somente executa quando F0 e F1 estiverem vazias












  
