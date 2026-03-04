# Chamadas ao Sistema

* As Chamadas ao Sistema (System Calls) fornecem a interface entre um processo e o sistema operacional
  * Interface de programação para os serviços fornecidos pelo SO
* System Calls
  * Instruções em assembly
  * Podem ser escritas em uma linguagem de mais alto nível, como C ou C++
  * Acessada pelos programas de alto nível por meio da API – Application Program Interface
  * Programa de alto nível → pode gerar outras chamadas
  * In-line
* É necessário o mecanismo de interrupções.
* API disponíveis aos compiladores pelos Sistemas Operacionais
* Exemplo API para manipulação de arquivos na Linguagem C
* Exemplo: Copiar 2 arquivos
  * 1º) Criar o novo arquivo copia.txt (Abrir - criando - em modo de ESCRITA)
  * 2º) Abrir o arquivo original.txt (em modo LEITURA)
  * 3º) Ler 1 linha no arquivo original.txt
  * 4º) Gerar 1 linha no arquivo copixa.txt
  * 5º) Fechar o arquivo original.txt
  * 6º) Fechar o arquivo copia.txt
<img width="435" height="502" alt="{DCF75E08-1C10-4032-9080-9587BB65B7FF}" src="https://github.com/user-attachments/assets/864d8bb3-1fda-47da-a219-4fb1eef0ec7b" />
<img width="612" height="361" alt="{66BF1357-011C-49EA-BAC7-52C8C6E8606D}" src="https://github.com/user-attachments/assets/4f321a5b-5994-4e21-9cc7-8ddf610b44e1" />

* Fonte: https://www.youtube.com/watch?v=dmHaiRxqghU

# Processos
* Primeiros sistemas: um programa por vez
* Atualmente Multiprogramação
  * muitos programas carregados na memória executados de forma concorrentemente
* Processos que executam concorrentemente, selecionados pela CPU a fim de tornar o computador mais produtivo
<img width="527" height="322" alt="image" src="https://github.com/user-attachments/assets/56c36983-d916-4e5e-8cad-231fbf42dc14" />

## Multiprogramação
### Mecanismo de Interrupções
* Permite que um controlador de periférico chame a atenção do processador
* Interrupção sinaliza a ocorrência de algum evento
* Desvia a execução da posição atual para uma outra rotina
* tratador de interrupção: realiza as ações necessárias em função da ocorrência da interrupção; quando termina volta à rotina interrompida (“sem que essa perceba”)
* Pode ser ativada por hardware ou software
* Alguns processadores salvam automaticamente os registradores quando ocorre uma interrupção; outros, salvam apenas alguns e a rotina de interrupção encarrega-se de salvar os demais.
* Controlador de periférico: conecta o periférico ao processador; traduz sinais ao dispositivo.
* Processador: ler, escrever dados, ler status do dispositivo, reiniciar, escrever comandos.
<img width="794" height="243" alt="image" src="https://github.com/user-attachments/assets/2074ba09-3cf0-4edc-8caf-ef0e6ccdbc54" />
* As interrupções possuem um tipo (0..255) definido pelos projetistas do sistema
  * Há uma relação de prioridades entre as interrupções
* Existem momentos em que não podem ocorrer interrupções (habilitar/desabilitar interrupções)
  * Evitar acesso a valores incorretos
#### Processo
* Unidade de Trabalho
* Programa em execução
* Processos
  * Sistema Operacional
  * Usuário
* CPU Multiplexada entre os processos
* Um programa por si só não é um processo
  * Programa
    * Entidade Passiva (disco)
  * Processo
    * Entidade Ativa
      * Program Counter indica próxima instrução
      * Possui um conjunto de recursos associados
#### Proteção entre processos
* Dois modos de operação
  * Usuário
    * Algumas instruções não podem ser executadas
  * Supervisor
    * Instruções privilegiadas
* As interrupções chaveiam o processador no modo supervisor
* Proteção de periféricos
* Proteção de memória

#### Diagrama de Estados de Um Processo (Ciclo de Vida)

<img width="770" height="613" alt="image" src="https://github.com/user-attachments/assets/58ceecb5-8192-41c3-a402-ac4021f14c85" />

<img width="770" height="613" alt="image" src="https://github.com/user-attachments/assets/59e3752e-f88a-4fe9-965f-6b1d80bd09d2" />

