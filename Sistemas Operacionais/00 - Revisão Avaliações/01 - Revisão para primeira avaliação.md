# O que é um Sistema Operacional (SO)?
É o programa que fica entre o hardware e o usuário.  
Atua como:
- Gerenciador de recursos
- Controlador da execução de programas

## Funções principais
- Gerenciar CPU, memória, disco e dispositivos  
- Facilitar o uso do computador  
- Garantir eficiência e segurança  

## Visões do SO
- Visão do usuário → facilidade e desempenho  
- Visão do sistema → uso eficiente do hardware  

## Funções do SO
- Alocar recursos (CPU, memória, I/O)  
- Controlar execução de programas  
- Evitar erros e uso indevido  

## Kernel
- Parte do SO que está sempre em execução  
- Executa em modo privilegiado  

## Evolução dos Sistemas
1. **Sistemas Batch (lote)**  
   - Sem interação do usuário  
   - Execução sequencial de jobs  
   - CPU ficava ociosa  

2. **Multiprogramação**  
   - Vários programas na memória  
   - Melhor uso da CPU  
   - Introduz: escalonamento e gerência de memória  

3. **Time-Sharing (tempo compartilhado)**  
   - Vários usuários ao mesmo tempo  
   - Alternância rápida da CPU  
   - Sistema interativo  

4. **Sistemas modernos**  
   - Paralelos (vários processadores)  
   - Distribuídos (vários computadores)  
   - Tempo real (resposta dentro de prazo)  

---

# Estrutura do Sistema Operacional

## Componentes principais
- Gerência de CPU  
- Gerência de memória  
- Gerência de arquivos  
- Gerência de dispositivos (I/O)  
- Interface com usuário  

## Interrupções (muito importante)
Mecanismo essencial do SO.  

**O que é?**  
Sinal que interrompe o fluxo normal da CPU.  

**Tipos:**  
- Hardware (ex: teclado)  
- Software (system calls)  
- Exceções (erro, divisão por zero)  

**Fluxo:**  
1. Interrupção ocorre  
2. Estado atual é salvo  
3. Executa tratador  
4. Retorna execução normal  

## Modo Dual (Proteção)
- Modo usuário → restrito  
- Modo kernel (supervisor) → total acesso  

**Garante:**  
- Segurança  
- Controle do sistema  

## Chamadas de Sistema (System Calls)
Interface entre programa e SO.  

**Exemplo:**  
- criar processo  
- ler arquivo  
- escrever dados  

**Categorias:**  
- Processo  
- Arquivos  
- Dispositivos  
- Informação  
- Comunicação  

## Estrutura do SO
- Monolítico → tudo junto  
- Em camadas → organizado por níveis  
- Microkernel → núcleo mínimo  

**Microkernel:**  
- Mais seguro  
- Mais modular  
- Comunicação via mensagens  

---

# Processos

## Conceito
Processo = programa em execução.  

**Diferença:**  
- Programa → passivo  
- Processo → ativo  

## Estados do Processo
- Novo  
- Pronto  
- Executando  
- Esperando  
- Finalizado  

## PCB (Process Control Block)
Estrutura que guarda informações do processo:  
- Estado  
- PC (contador de programa)  
- Registradores  
- Memória  
- Informações de escalonamento  

**Essencial para prova.**

## Tipos de processos
- CPU-bound → usa mais CPU  
- I/O-bound → usa mais entrada/saída  

## Filas de escalonamento
- Fila de jobs  
- Fila de prontos  
- Fila de I/O  

## Escalonadores
- Longo prazo → controla quantos processos entram na memória  
- Curto prazo → escolhe quem usa a CPU  
- Médio prazo → remove processos da memória (swapping)  

## Criação de processos (Unix)
- `fork()` → cria processo filho  
- `exec()` → carrega novo programa  
- `wait()` → espera processo  
- `exit()` → termina processo  

## Comunicação entre processos (IPC)
- Troca de mensagens  
- Memória compartilhada  
- Sinais  

## Troca de Contexto
- Salvar estado atual  
- Carregar outro processo  

**Importante:** é overhead (custo).  

---

# Threads

## O que são Threads?
São fluxos de execução dentro de um processo.  

**Processo:** mais pesado  
**Thread:** mais leve  

## Características
Threads compartilham:  
- Código  
- Dados  
- Recursos  

Threads possuem:  
- PC  
- Registradores  
- Pilha  

## Vantagens
- Melhor desempenho  
- Menor custo  
- Paralelismo  
- Melhor resposta  

## Tipos de Threads
- Usuário → gerenciadas pela aplicação  
- Kernel → gerenciadas pelo SO  

## Modelos
- N:1 → várias threads → 1 thread kernel  
- 1:1 → cada thread = uma do kernel  
- M:N → combinação dos dois  

---

# Escalonamento

## O que é?
Escolher qual processo usa a CPU.  

**Objetivo:** maximizar desempenho.  

## Ciclos de CPU e I/O
Processo alterna entre CPU e I/O.  
Isso influencia o algoritmo de escalonamento.  

## Tipos de escalonamento
- Preemptivo → pode interromper processo  
- Não-preemptivo → processo só sai quando termina ou espera  

## Dispatcher
Responsável por:  
- Troca de contexto  
- Passar controle da CPU  

## Critérios de Escalonamento
- Maximizar: uso da CPU, throughput  
- Minimizar: tempo de espera, tempo de resposta, tempo de retorno  

## Algoritmos (cai muito)
1. **FCFS (FIFO)**  
   - Primeiro que chega, primeiro que executa  
   - Simples  
   - Pode gerar espera longa  

2. **SJF (Shortest Job First)**  
   - Executa o menor processo primeiro  
   - Ótimo (menor tempo médio de espera)  
   - Problema: não sabe o tempo exato  

3. **Prioridade**  
   - Processo com maior prioridade executa primeiro  
   - Problema: starvation (processo nunca executa)  
   - Solução: aging (envelhecimento)  

4. **Round Robin (RR)**  
   - Cada processo recebe um tempo (quantum)  
   - Preemptivo  
   - Justo  
   - Usado em sistemas interativos  

5. **Múltiplas Filas**  
   - Várias filas com diferentes prioridades  

6. **Múltiplas Filas com Realimentação**  
   - Processo muda de fila  
   - Mais eficiente  

---

# Lista 1
## 1. Como a operação do sistema operacional em Modo Dual funciona como mecanismo de proteção?
O modo dual é um mecanismo utilizado pelos sistemas operacionais para garantir a segurança e a integridade do sistema. Ele divide a execução em dois modos distintos: o modo usuário e o modo kernel (ou supervisor). No modo usuário, os programas possuem acesso limitado aos recursos do sistema, não podendo executar instruções críticas ou acessar diretamente o hardware. Já no modo kernel, o sistema operacional possui acesso total ao hardware e pode executar instruções privilegiadas.

Esse mecanismo funciona como proteção porque impede que programas de usuário realizem operações perigosas, como acessar diretamente a memória ou dispositivos de entrada e saída. Sempre que um programa precisa realizar uma operação sensível, ele deve solicitar ao sistema operacional por meio de uma chamada de sistema. Nesse momento, ocorre a mudança do modo usuário para o modo kernel, permitindo que o sistema execute a operação de forma segura. Assim, o modo dual evita falhas, acessos indevidos e possíveis danos ao sistema.

## 2. Qual a diferença entre interrupção e exceção?
A interrupção é um evento que ocorre de forma assíncrona e geralmente é causado por dispositivos externos ao processador, como teclado, mouse, disco ou temporizador. Ela interrompe temporariamente a execução do programa atual para que o sistema operacional trate o evento ocorrido.

Já a exceção é um evento síncrono, ou seja, ocorre durante a execução de uma instrução do próprio programa. Ela geralmente está associada a erros ou situações anormais, como divisão por zero, instrução inválida ou overflow.

Portanto, a principal diferença é que a interrupção é causada por eventos externos ao programa, enquanto a exceção é causada por problemas internos durante sua execução.

## 3. As memórias cache são úteis em quais situações? No projeto de um sistema operacional deve-se prever qual tipo de problema com cache?
A memória cache é útil em situações em que há acesso frequente aos mesmos dados ou instruções. Ela armazena temporariamente informações que são utilizadas com maior frequência, permitindo que o processador acesse esses dados de forma mais rápida do que se estivesse acessando diretamente a memória principal. Isso melhora significativamente o desempenho do sistema, principalmente em execuções repetitivas, como loops e cálculos intensivos.

No entanto, no projeto de um sistema operacional, é necessário considerar o problema da coerência de cache. Esse problema ocorre quando existem múltiplas cópias de um mesmo dado armazenadas em diferentes caches, especialmente em sistemas multiprocessados. Nesse caso, uma alteração feita em um dado pode não ser refletida imediatamente em outras cópias, gerando inconsistência. Assim, o sistema operacional deve prever mecanismos para garantir que os dados armazenados na cache estejam sempre consistentes com a memória principal.

## 4. Uma chamada ao sistema operacional pode ser fator desencadeante de outras interrupções no sistema operacional? Dê um exemplo.
Sim, uma chamada ao sistema operacional pode desencadear outras interrupções. Isso ocorre porque, ao solicitar um serviço ao sistema operacional, o processo pode envolver o uso de dispositivos de entrada e saída, que funcionam de forma assíncrona.

Por exemplo, quando um programa realiza uma chamada de sistema para ler um arquivo do disco, o sistema operacional inicia a operação de leitura. Quando o dispositivo de disco termina essa operação, ele envia uma interrupção de hardware ao processador para informar que os dados estão prontos. Dessa forma, uma chamada ao sistema pode resultar em uma ou mais interrupções durante sua execução.

## 5. Considere os Sistemas Operacionais Modernos. Apresente as características que estes sistemas operacionais incorporaram dos sistemas operacionais para mainframes.
Os sistemas operacionais modernos herdaram diversas características dos sistemas utilizados em mainframes. Entre essas características estão a multiprogramação, que permite a execução de vários processos simultaneamente, e o compartilhamento de recursos, como CPU e memória, entre múltiplos usuários.

Além disso, os sistemas modernos incorporaram o conceito de tempo compartilhado, possibilitando que vários usuários interajam com o sistema ao mesmo tempo. Também herdaram técnicas avançadas de gerenciamento de memória, escalonamento de processos e controle de entrada e saída. Essas características foram fundamentais para o desenvolvimento dos sistemas operacionais atuais, tornando-os mais eficientes, seguros e capazes de atender múltiplos usuários simultaneamente.

## 6. É correto afirmar que devido à Multiprogramação há uma menor utilização do processador? Justifique.
Não, essa afirmação está incorreta. A multiprogramação tem justamente o objetivo de aumentar a utilização do processador. Em um sistema multiprogramado, vários processos ficam carregados na memória ao mesmo tempo. Quando um processo precisa aguardar uma operação de entrada e saída, o sistema operacional pode escalonar outro processo para utilizar a CPU.

Dessa forma, a CPU raramente fica ociosa, pois sempre há algum processo pronto para ser executado. Isso aumenta a eficiência do sistema e melhora o desempenho geral. Portanto, a multiprogramação contribui para uma maior utilização do processador, e não menor.

## 7. A partir do conceito de processo, justifique o escalonamento de processos.
Um processo é um programa em execução que necessita de recursos do sistema, especialmente da CPU, para realizar suas tarefas. Em sistemas modernos, vários processos podem estar ativos ao mesmo tempo, competindo pelos mesmos recursos.

Como a CPU é um recurso limitado, não é possível executar todos os processos simultaneamente em sistemas com um único processador. Por isso, é necessário um mecanismo que determine qual processo deve ser executado em determinado momento. Esse mecanismo é o escalonamento de processos.

O escalonamento permite organizar o uso da CPU de forma eficiente, garantindo que todos os processos tenham oportunidade de execução, melhorando o desempenho do sistema e evitando que processos fiquem indefinidamente sem executar.

## 8. Diferencie um SO monotarefa de um SO multitarefa, indicando as principais características no projeto destes sistemas.
Um sistema operacional monotarefa é aquele que permite a execução de apenas um processo por vez. Nesse tipo de sistema, quando um programa está em execução, nenhum outro pode ser executado até que o primeiro termine. Esse modelo é mais simples, porém menos eficiente, pois não aproveita bem os recursos do sistema.

Já um sistema operacional multitarefa permite a execução de vários processos simultaneamente. Isso é possível graças ao escalonamento de processos, que alterna rapidamente a execução entre diferentes tarefas. Esse tipo de sistema é mais complexo, pois exige mecanismos de controle, como gerenciamento de memória, proteção entre processos e escalonamento eficiente.

Assim, a principal diferença está na capacidade de execução: sistemas monotarefa executam apenas um processo por vez, enquanto sistemas multitarefa permitem a execução concorrente de vários processos.

## 9. Caracterize o que é um processo em Sistemas Operacionais. Inclua nesta caracterização o bloco descritor de processo.
Um processo é a instância de um programa em execução. Ele representa uma entidade ativa que utiliza recursos do sistema, como CPU, memória e dispositivos de entrada e saída. Cada processo possui seu próprio espaço de endereçamento e um conjunto de informações necessárias para sua execução.

O sistema operacional gerencia os processos por meio de uma estrutura chamada Bloco de Controle de Processo (PCB). O PCB armazena informações importantes sobre o processo, como seu estado atual, o contador de programa, os registradores do processador, informações de memória, dados de escalonamento e status de entrada e saída.

O PCB é essencial para o funcionamento do sistema, pois permite que o sistema operacional controle a execução dos processos, realize trocas de contexto e mantenha o controle sobre os recursos utilizados por cada processo.

## 10. Quais são os estados que um processo pode assumir durante seu ciclo de vida? Descreva os eventos que fazem com que um processo mude de estado. Faça uma relação com as várias filas existentes no sistema.
Durante seu ciclo de vida, um processo pode assumir os seguintes estados: novo, pronto, em execução, em espera e finalizado.

O processo inicia no estado novo, quando é criado. Em seguida, passa para o estado pronto, onde aguarda na fila de prontos para ser executado. Quando o escalonador seleciona esse processo, ele passa para o estado de execução. Se durante a execução o processo precisar realizar uma operação de entrada e saída, ele vai para o estado de espera, onde aguarda a conclusão dessa operação. Após a finalização da operação de entrada e saída, ele retorna ao estado pronto. Por fim, quando termina sua execução, o processo entra no estado finalizado.

Esses estados estão diretamente relacionados às filas do sistema. A fila de prontos contém os processos que aguardam a CPU, enquanto as filas de dispositivos de entrada e saída contêm os processos que estão esperando por operações de I/O. O sistema operacional gerencia essas filas para garantir a execução eficiente dos processos.

## 11. A execução de um processo alterna entre surto de CPU e surto de I/O. Em um ambiente multiprogramado, como deve ser realizado o escalonamento dos processos I/O bound e CPU bound?

Em um ambiente multiprogramado, o escalonamento deve ser feito de forma a equilibrar processos do tipo CPU bound e I/O bound. Processos CPU bound utilizam intensamente o processador, enquanto processos I/O bound passam grande parte do tempo aguardando operações de entrada e saída.

Para otimizar o desempenho do sistema, é importante que esses dois tipos de processos sejam combinados. Quando um processo I/O bound entra em espera, um processo CPU bound pode utilizar a CPU. Isso evita que o processador fique ocioso e melhora a utilização dos dispositivos de entrada e saída.

Portanto, um bom escalonamento busca manter um equilíbrio entre esses tipos de processos, garantindo eficiência e melhor desempenho geral do sistema.

## 12. O que é o scheduler? Quais os tipos existentes e suas principais atribuições?
O scheduler, ou escalonador, é o componente do sistema operacional responsável por selecionar qual processo será executado pela CPU em determinado momento.

Existem três tipos principais de escalonadores. O escalonador de longo prazo é responsável por selecionar quais processos serão admitidos no sistema e carregados na memória, controlando o grau de multiprogramação. O escalonador de curto prazo escolhe, entre os processos prontos, qual será executado pela CPU, sendo executado com alta frequência. Já o escalonador de médio prazo atua removendo processos da memória e armazenando-os temporariamente, com o objetivo de reduzir a carga do sistema e melhorar o desempenho.

Cada tipo de escalonador possui uma função específica, contribuindo para o gerenciamento eficiente dos processos no sistema operacional.

## 13. Caracterize os sistemas operacionais fracamente acoplados e fortemente acoplados.
Os sistemas fortemente acoplados são aqueles em que múltiplos processadores compartilham a mesma memória, o mesmo barramento e geralmente o mesmo relógio. Nesse tipo de sistema, a comunicação entre os processadores é rápida, pois ocorre diretamente pela memória compartilhada. Esses sistemas são comuns em arquiteturas multiprocessadas.

Por outro lado, os sistemas fracamente acoplados são formados por computadores independentes que não compartilham memória ou relógio. A comunicação entre eles ocorre por meio de redes, utilizando troca de mensagens. Esses sistemas são conhecidos como sistemas distribuídos e oferecem maior flexibilidade e escalabilidade, porém com maior custo de comunicação.

# Lista 2 - Threads

## 1) Por que as threads são consideradas mais leves que processos?
As threads são consideradas mais leves que processos porque exigem menos recursos do sistema operacional tanto em termos de memória quanto no custo de gerenciamento. Um processo possui seu próprio espaço de endereçamento, incluindo código, dados e recursos próprios, enquanto as threads compartilham esses elementos dentro de um mesmo processo.

No que diz respeito à memória, várias threads de um mesmo processo compartilham a mesma área de código e dados, sendo necessário apenas manter estruturas individuais menores, como o contador de programa, registradores e pilha. Isso reduz significativamente o consumo de memória em comparação com múltiplos processos.

Além disso, a troca de contexto entre threads é mais rápida do que entre processos. Isso ocorre porque, ao trocar entre threads, não é necessário alterar o espaço de memória completo, apenas as informações específicas da thread. Já na troca entre processos, o sistema precisa trocar todo o contexto de memória, tornando a operação mais custosa.

## 2) Papel do PC e da pilha em uma thread
O contador de programa (Program Counter – PC) é responsável por indicar qual será a próxima instrução a ser executada pela thread. Ele garante a continuidade da execução correta do fluxo de instruções.

A pilha (stack), por sua vez, é utilizada para armazenar informações temporárias da execução da thread, como chamadas de funções, parâmetros, variáveis locais e endereços de retorno. Cada thread possui sua própria pilha, permitindo que execute funções de forma independente das outras.

Assim, o PC controla a sequência de execução, enquanto a pilha mantém o contexto necessário para a execução das funções da thread.

## 3) Dois benefícios do multithreading
Um dos principais benefícios do uso de multithreading é a melhoria na capacidade de resposta das aplicações. Como diferentes partes do programa podem ser executadas simultaneamente, o sistema consegue continuar respondendo ao usuário mesmo quando uma thread está realizando uma tarefa demorada.

Outro benefício importante é o melhor aproveitamento dos recursos do sistema, especialmente da CPU. Em sistemas com múltiplos núcleos, diferentes threads podem ser executadas em paralelo, aumentando o desempenho geral da aplicação.

## 4) Exemplo prático de uso de threads
Um exemplo prático é um navegador web. Enquanto uma thread é responsável por carregar o conteúdo de uma página, outra thread pode ser responsável pela interface gráfica do usuário.

Isso melhora a experiência do usuário porque ele pode continuar interagindo com o navegador, como clicar em botões ou rolar a página, mesmo enquanto o conteúdo ainda está sendo carregado. Sem o uso de threads, o navegador ficaria travado até o carregamento completo da página.

## 5) Threads e múltiplos processadores
As threads permitem que diferentes partes de um programa sejam executadas simultaneamente em múltiplos processadores ou núcleos. Cada thread pode ser atribuída a um núcleo diferente, possibilitando execução paralela real.

Isso aumenta o desempenho, pois várias tarefas podem ser processadas ao mesmo tempo, reduzindo o tempo total de execução. Dessa forma, as threads são fundamentais para aproveitar plenamente o poder de processamento de sistemas multicore.

## 6) Threads de usuário vs threads de kernel
As threads de usuário são gerenciadas por bibliotecas no espaço do usuário, sem conhecimento direto do sistema operacional. Isso torna sua criação e gerenciamento mais rápidos, pois não envolve chamadas ao kernel. No entanto, apresentam limitações, como o fato de que, se uma thread realizar uma operação bloqueante, todas as outras threads do processo também podem ser bloqueadas.

Já as threads de kernel são gerenciadas diretamente pelo sistema operacional. Isso permite maior controle e possibilita o uso de múltiplos processadores, garantindo paralelismo real. Entretanto, possuem maior custo de criação e troca de contexto, pois envolvem chamadas ao sistema.

## 7) Modelos de multithreading
### a) Modelo N:1 (many-to-one)
Nesse modelo, várias threads de usuário são mapeadas para uma única thread do kernel. Todo o gerenciamento é feito no espaço do usuário.

Uma limitação importante é que, se uma thread realizar uma operação bloqueante, todas as outras threads também ficam bloqueadas, pois o kernel vê apenas uma única thread.

### b) Modelo 1:1 (one-to-one)
Cada thread de usuário corresponde a uma thread do kernel. Isso permite que múltiplas threads sejam executadas simultaneamente em diferentes processadores.

Esse modelo permite paralelismo real porque o sistema operacional pode escalonar cada thread separadamente em diferentes núcleos.

### c) Modelo M:N (many-to-many)
Nesse modelo, várias threads de usuário são mapeadas para um número menor ou igual de threads de kernel.

Ele combina vantagens dos modelos anteriores, pois permite paralelismo e, ao mesmo tempo, reduz o custo de gerenciamento, já que nem todas as threads precisam de correspondência direta com o kernel.

## 8) Modelo onde uma thread bloqueia todas

Esse problema ocorre no modelo N:1 (many-to-one).

Isso acontece porque todas as threads de usuário são gerenciadas como uma única thread pelo sistema operacional. Assim, se uma thread realiza uma operação bloqueante, o kernel bloqueia a única thread existente, fazendo com que todas as outras também parem de executar.

## 9) Métodos sleep() e join()
O método sleep() é utilizado para fazer com que uma thread pause sua execução por um determinado período de tempo. Durante esse período, a thread não utiliza a CPU, permitindo que outras threads sejam executadas.

Já o método join() é utilizado para fazer com que uma thread espere a finalização de outra. Isso é útil quando uma tarefa depende do resultado de outra thread.

Por exemplo, uma thread pode realizar um cálculo, e outra thread pode usar join() para aguardar o término desse cálculo antes de continuar sua execução.

## 10) Método synchronized
Um método synchronized é aquele que permite acesso exclusivo a um recurso compartilhado por apenas uma thread por vez. Isso significa que, enquanto uma thread estiver executando esse método, as outras threads devem esperar.

Isso é importante para evitar problemas de concorrência, como inconsistência de dados, que podem ocorrer quando várias threads acessam e modificam os mesmos dados simultaneamente. O uso de synchronized garante a integridade dos dados em aplicações multithread.

## 11) Funções pthread_create, pthread_join e pthread_exit
A função pthread_create é utilizada para criar uma nova thread em programas escritos em C utilizando a biblioteca POSIX Threads. Ela define qual função será executada pela thread.

A função pthread_join é utilizada para fazer com que uma thread espere a finalização de outra, permitindo sincronização entre elas.

Já a função pthread_exit é utilizada para finalizar a execução de uma thread, podendo retornar um valor que pode ser recuperado posteriormente por outra thread.

## 12) Diferença entre concorrência e paralelismo
Concorrência refere-se à capacidade de um sistema de lidar com várias tarefas ao mesmo tempo, mesmo que não estejam sendo executadas simultaneamente. Isso ocorre por meio da alternância rápida entre tarefas.

Já o paralelismo ocorre quando várias tarefas são executadas realmente ao mesmo tempo, utilizando múltiplos processadores ou núcleos.

No contexto de threads, a concorrência pode existir mesmo em sistemas com um único processador, enquanto o paralelismo exige hardware com múltiplos núcleos para execução simultânea.

# Lista 3 - Escalonamento
## 1. Quais os principais objetivos do escalonamento de processos?
Os principais objetivos do escalonamento de processos são garantir o uso eficiente dos recursos do sistema, especialmente da CPU, e melhorar o desempenho geral do sistema operacional. O escalonamento busca manter o processador ocupado o maior tempo possível, evitando períodos de ociosidade.

Além disso, procura aumentar o throughput, que é a quantidade de processos concluídos por unidade de tempo, e reduzir o tempo de espera dos processos na fila de prontos. Outro objetivo importante é diminuir o tempo de retorno, que corresponde ao tempo total desde a submissão até a conclusão do processo, e também reduzir o tempo de resposta percebido pelo usuário em sistemas interativos.

Por fim, o escalonamento também deve garantir justiça entre os processos, evitando que alguns fiquem indefinidamente sem acesso à CPU.

## 2. Preemptivo vs Não-preemptivo
O escalonamento preemptivo é aquele em que o sistema operacional pode interromper um processo que está em execução para alocar a CPU a outro processo. Essa interrupção geralmente ocorre por meio de eventos como o término de um quantum de tempo ou a chegada de um processo com maior prioridade.

Já o escalonamento não-preemptivo é aquele em que o processo, uma vez que obtém a CPU, continua executando até terminar sua execução ou até entrar em estado de espera, como em uma operação de entrada e saída. Nesse tipo de escalonamento, não há interrupção forçada pelo sistema operacional.

A principal diferença entre os dois está na possibilidade de interrupção: no escalonamento preemptivo há maior controle e responsividade, enquanto no não-preemptivo há menor complexidade, porém menor flexibilidade.

## 3. Na política de escalonamento FCFS, considere a situação a seguir: 
Um processo CPU bound (P1) obtém e detém a CPU. Muitos processos I/O bound terminam sua operação de I/O e passam para o estado de prontos. O P1 passa para a operação de I/O. 
* Descreva como acontecerá a utilização da CPU e dos dispositivos. Apresente uma soluções 
para melhorar o uso dos recursos do sistema de computação. 

## 4. Quais são os critérios utilizados para comparar as diferentes políticas de escalonamento?
Os critérios utilizados para comparar diferentes políticas de escalonamento são baseados no desempenho e na eficiência do sistema. Entre os principais critérios estão a utilização da CPU, que deve ser maximizada para evitar ociosidade, e o throughput, que corresponde ao número de processos concluídos por unidade de tempo.

Além disso, busca-se minimizar o tempo de retorno, que é o tempo total entre a submissão e a conclusão do processo, e o tempo de espera, que representa o tempo que o processo permanece na fila de prontos aguardando a CPU. Outro critério importante é o tempo de resposta, que mede o intervalo entre a submissão do processo e a primeira resposta ao usuário.

Esses critérios são fundamentais para avaliar a qualidade de um algoritmo de escalonamento e sua adequação a diferentes tipos de sistemas.

## 5. Como é calculado o tempo de retorno e o tempo de espera dos processos?
* **Tempo de Retorno (Turnaround)** = tempo de conclusão – tempo de chegada
* **Tempo de Espera** = tempo de retorno – tempo de CPU


## 8. Favorecimento de processos curtos (FIFO, RR e Múltiplas Filas com Realimentação)
No algoritmo FIFO, não há favorecimento de processos curtos, pois os processos são executados na ordem de chegada. Isso pode fazer com que processos curtos fiquem aguardando por longos períodos caso estejam atrás de processos longos na fila.

No algoritmo Round Robin, há um certo equilíbrio, pois cada processo recebe uma fatia de tempo da CPU. Embora não favoreça diretamente processos curtos, estes tendem a terminar mais rapidamente por necessitarem de menos ciclos de CPU.

Já no escalonamento por múltiplas filas com realimentação, há um favorecimento significativo de processos curtos. Isso ocorre porque processos que utilizam pouco tempo de CPU permanecem em filas de maior prioridade, sendo executados mais rapidamente. Já processos longos vão sendo movidos para filas de menor prioridade. Esse modelo é mais eficiente para dar prioridade a tarefas rápidas e interativas.

# 10. O que é starvation? Quando pode acontecer? Qual a solução?
Starvation, ou inanição, é uma situação em que um processo fica indefinidamente aguardando para ser executado, sem nunca obter acesso à CPU. Isso ocorre quando o sistema continuamente favorece outros processos, impedindo que o processo em questão seja escalonado.

Esse problema pode acontecer em algoritmos de escalonamento por prioridade, onde processos com baixa prioridade podem nunca ser executados caso existam constantemente processos com prioridade mais alta chegando ao sistema.

Uma solução para esse problema é a técnica de envelhecimento, conhecida como aging. Nessa técnica, a prioridade de um processo aumenta gradualmente quanto mais tempo ele permanece esperando na fila, garantindo que eventualmente ele será executado.

## 11. Impacto do tamanho do quantum no Round Robin
No algoritmo Round Robin, o tamanho do quantum influencia diretamente o desempenho do sistema. Se for utilizado um quantum muito pequeno, imediatamente superior ao tempo necessário para a troca de contexto, haverá muitas trocas de contexto em um curto período de tempo. Isso gera um alto overhead, reduzindo a eficiência do sistema, pois a CPU passa mais tempo gerenciando processos do que executando tarefas úteis.

Por outro lado, se for utilizado um quantum muito grande, muito superior à média dos surtos de CPU dos processos, o comportamento do Round Robin se aproxima do algoritmo FIFO. Nesse caso, os processos podem monopolizar a CPU por longos períodos, prejudicando a responsividade do sistema e o atendimento a processos interativos.












