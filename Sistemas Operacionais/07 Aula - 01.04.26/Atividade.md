### 1 – Crie um programa com dois threads. As medidas de um terreno retangular devem ser lidas. Um thread deve calcular a área do terreno e outro o perímetro. Todos os resultados obtidos devem ser mostrados ao usuário.

### 2 – Escreva um programa formado por 3 threads, que executam um laço de repetição de N interações. Neste laço, cada thread imprime sua identificação. A partir da execução do programa, identifique como acontece o escalonamento dos threads.

### 3 – Escreva um programa formado por várias threads, que executam um laço de repetição de N interações para incrementar em 1 uma variável compartilhada. Ao término da execução, verifique o valor final da variável compartilhada.

### 4 – Escreva um programa com duas threads que compartilham um vetor de inteiros tamanho 5 e uma outra variável inteira que conta quantos elementos há no vetor. Uma das threads escreve um dado no vetor e a outra remove um dado no vetor. A execução das threads é contínua.
* Verifique a execução do programa
* Os valores apresentados nos dados compartilhados são corretos
* Neste problema, as threads precisam ser sincronizadas?

### 5 – Considere o problema de somar dois vetores de tamanho N. Desenvolva um algoritmo que permita a criação de diferentes quantidades de threads para efetuar a soma de dois vetores e mostrar o vetor resultante.
* Efetue a medida do tempo de execução deste programa, usando a função gettimeofday, conforme o quadro 1.
* Compare a execução deste algoritmo com threads, com a execução do algoritmo da lista 2 (com processos). Qual versão mostrou menor tempo de execução?
* Neste problema, existiu acesso concorrente aos dados pelos diferentes fluxos de execução?
