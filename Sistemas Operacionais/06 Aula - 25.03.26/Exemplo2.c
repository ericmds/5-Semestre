/* 
   Exemplo de criação de threads com POSIX Threads (Pthreads).
   Este exemplo cria duas threads que executam concorrentemente a função mostraCidade.
*/

#include <pthread.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// A função a seguir é executada por cada uma das threads.
// Em Pthreads, a função deve:
// - Retornar void*
// - Receber um argumento do tipo void* (ponteiro genérico)
//
// Caso seja necessário passar mais de um dado para a thread,
// deve-se utilizar estruturas (struct)./* 
   Exemplo de criação de threads com POSIX Threads (Pthreads).
   Este exemplo cria duas threads que executam concorrentemente a função mostraCidade.
*/

#include <pthread.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// A função a seguir é executada por cada uma das threads.
// Em Pthreads, a função deve:
// - Retornar void*
// - Receber um argumento do tipo void* (ponteiro genérico)
//
// Caso seja necessário passar mais de um dado para a thread,
// deve-se utilizar estruturas (struct).
void* mostraCidade(void* arg) {
    const char* nome = (const char*) arg; // conversão de void* para const char*

    int aux1, aux2, aux3, count;

    // Define a quantidade de iterações conforme o nome da cidade
    if (strcmp(nome, "Santa Maria") == 0)
        count = 50;
    else
        count = 100;

    // Loop de execução da thread
    for (aux1 = 0; aux1 < count; aux1++) {
        printf("%d %s\n", aux1, nome);

        // Simula um atraso sem bloquear a thread (busy wait)
        for (aux2 = rand() / 10000; aux2 > 0; aux2--)
            for (aux3 = 10; aux3 > 0; aux3--);
    }

    pthread_exit(NULL); // finaliza a thread
}

// A função main representa a thread principal do programa.
// A partir dela, criamos novas threads com pthread_create.
int main() {

    pthread_t thUm, thDois; // uma variável para cada thread

    // Criação das threads:
    // 1º argumento: identificador da thread
    // 2º argumento: atributos (NULL = padrão)
    // 3º argumento: função a ser executada
    // 4º argumento: parâmetro passado para a função (void*)
    pthread_create(&thUm, NULL, mostraCidade, (void*) "Santa Maria");
    pthread_create(&thDois, NULL, mostraCidade, (void*) "Porto Alegre");

    // A thread principal espera o término das threads criadas
    // Como não precisamos do valor de retorno, usamos NULL
    pthread_join(thUm, NULL);
    pthread_join(thDois, NULL);

    printf("Fim da thread principal\n");

    return 0;
}
void* mostraCidade(void* arg) {
    const char* nome = (const char*) arg; // conversão de void* para const char*

    int aux1, aux2, aux3, count;

    // Define a quantidade de iterações conforme o nome da cidade
    if (strcmp(nome, "Santa Maria") == 0)
        count = 50;
    else
        count = 100;

    // Loop de execução da thread
    for (aux1 = 0; aux1 < count; aux1++) {
        printf("%d %s\n", aux1, nome);

        // Simula um atraso sem bloquear a thread (busy wait)
        for (aux2 = rand() / 10000; aux2 > 0; aux2--)
            for (aux3 = 10; aux3 > 0; aux3--);
    }

    pthread_exit(NULL); // finaliza a thread
}

// A função main representa a thread principal do programa.
// A partir dela, criamos novas threads com pthread_create.
int main() {

    pthread_t thUm, thDois; // uma variável para cada thread

    // Criação das threads:
    // 1º argumento: identificador da thread
    // 2º argumento: atributos (NULL = padrão)
    // 3º argumento: função a ser executada
    // 4º argumento: parâmetro passado para a função (void*)
    pthread_create(&thUm, NULL, mostraCidade, (void*) "Santa Maria");
    pthread_create(&thDois, NULL, mostraCidade, (void*) "Porto Alegre");

    // A thread principal espera o término das threads criadas
    // Como não precisamos do valor de retorno, usamos NULL
    pthread_join(thUm, NULL);
    pthread_join(thDois, NULL);

    printf("Fim da thread principal\n");

    return 0;
}
