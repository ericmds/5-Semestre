* Permite a execução de programas que não são carregados completamente

* Tanto a Pagi...

> Paginação é pegar o que eu tenho na memória e paginar na memória virtual

* Tabela de páginas
  * Há um bit de validação de cada página - V e I
  * V = página válida - página carregada na memória
  * I = página inválida
* Ao acontecer um acesso à memória...
  * Busca tabela de ágina
  * Bit V * faz o mapeamento para endereço físico
  * ...
* Ao ocorrer FALTA DE PÁGINA, o SO
  * Suspende o processo e seu PCB vai para a "fila de processos esperados por página lógica"
  * ...
> Chegou lá, lotou a memória, para e fica esperando (travou o PC)

## Paginação por Demanda

## Substituição de Páginas na Memória
* Ao acontecer Page Fault (Falta de Página), há necessidade de uma página livre na memória física
* Para isso
  * ...
 
## Algoritmo Ótimo
* O algoritmo de substituição de página ótimo é o que coloca a falta de página em um futuro mais longe
  * Menor taxa de falta de páginas
* Conhecido com OPT ou MIN
* Consiste...

## FIFO ou FCFS
* A página escolhida para ser substituída (página vítima) é a página qye está há mais tempo na memória
* A MMU deve ter uma lista com os númerods das páginas lógicas. Quando uma página é carregada na memória, seu número é colocado no final da lista
* Desempenho ruim - não considera se a página foi acessada
* Exemplo
  * Rotina de Inicialização
  * Rotina de bibliotecas

## LRU (Least Recently Used)
* Aproximação do Algoritmo Ótimo
* Escolhe a página que há mais tempo não é usada (acessada)
* Considera que páginas acessadas recentemente por um processo serão novamente acessadas por ele num futuro próximo
* Exige suporte de hardware (registradores adicionais)
  * alto custo para manter na tabela de páginas...

## Buffer de Páginas
* Usado em conjunto com um algoritmo de substituição de páginas
* Pode ser usado mesmo quando a MMU não implementa o bit de referência
* ...
* A página indicada pelo apontador é marcada como inválida, atualizada no disco e incluída no conjunto de páginas livres, porém seu conteúdo não é alterado

## Alocação de Página

## Thrashing
* O tratamento de falta de página é o mais lento que o acesso normal à memória
* Quando um processo possui um número muito pequeno de páginas...
* 
