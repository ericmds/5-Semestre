### 1 – Crie um programa com dois threads. As medidas de um terreno retangular devem ser lidas. Um thread deve calcular a área do terreno e outro o perímetro. Todos os resultados obtidos devem ser mostrados ao usuário.
```c
/* Crie um programa com dois threads. As medidas de um terreno retangular devem ser lidas. 
 * Um thread deve calcular a área do terreno e outro o perímetro. 
 * Todos os resultados obtidos devem ser mostrados ao usuário.
 */
 
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h> //para usar a função exit
#include <unistd.h> //para usar a função sleep 
```

### 2 – Escreva um programa formado por 3 threads, que executam um laço de repetição de N interações. Neste laço, cada thread imprime sua identificação. A partir da execução do programa, identifique como acontece o escalonamento dos threads.
```c
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define NUM_THREADS 3
#define N 5

void *mostraId (void *threadid) {
    long tid = (long) threadid;
    for (int i=0; i<N; i++) {
        printf("Thread %ld - iteracao %d\n", tid, i);
        sleep(1);
    }
    pthread_exit(NULL);
}

int main (int argc, char *argv[]) {
    pthread_t threads[NUM_THREADS];
    int rc;

    for (long i=0; i < NUM_THREADS; i++) {
        printf("Criando thread %ld\n", i);
        // Ajustado para 'mostraId' e 'threads'
        rc = pthread_create(&threads[i], NULL, mostraId, (void *)i);
        
        if (rc) {
            printf("Erro ao criar thread %ld\n", i);
            exit(-1);
        }
    }

    for (int i=0; i < NUM_THREADS; i++) {
        pthread_join(threads[i], NULL);
    }

    printf("Threads finalizadas!\n");
    return 0;
}
```

### 3 – Escreva um programa formado por várias threads, que executam um laço de repetição de N interações para incrementar em 1 uma variável compartilhada. Ao término da execução, verifique o valor final da variável compartilhada.

### 4 – Escreva um programa com duas threads que compartilham um vetor de inteiros tamanho 5 e uma outra variável inteira que conta quantos elementos há no vetor. Uma das threads escreve um dado no vetor e a outra remove um dado no vetor. A execução das threads é contínua.
* Verifique a execução do programa
* Os valores apresentados nos dados compartilhados são corretos
* Neste problema, as threads precisam ser sincronizadas?

### 5 – Considere o problema de somar dois vetores de tamanho N. Desenvolva um algoritmo que permita a criação de diferentes quantidades de threads para efetuar a soma de dois vetores e mostrar o vetor resultante.
* Efetue a medida do tempo de execução deste programa, usando a função gettimeofday, conforme o quadro 1.
* Compare a execução deste algoritmo com threads, com a execução do algoritmo da lista 2 (com processos). Qual versão mostrou menor tempo de execução?
* Neste problema, existiu acesso concorrente aos dados pelos diferentes fluxos de execução?
