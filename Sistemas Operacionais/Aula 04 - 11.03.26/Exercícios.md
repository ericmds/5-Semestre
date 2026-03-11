# Exercício 1
* Compile e execute o código a seguir, nomeando o fonte como processo.c.
* Identifique a finalidade de cada chamada ao sistema utilizada
* A) Quais os valores de PID para cada processo?
* OBS) Para ver a árvore, abre um novo terminal e digite
  * pstree
  * top
```cpp
#include <sys/types.h>
#include<unistd.h>
#include<stdio.h>
int main()
{
pid_t procID;
procID = fork();
if (procID < 0)
{
printf("Erro na criação do novo processo\n");
return -1;
}
else if (procID == 0)
{
printf("Processo filho - para o FILHO o fork devolveu %d\n", procID);
printf("Processo filho - PID = %d\n", getpid());
return 1;
}
else
{
printf("Processo Pai - para o PAI o fork devolveu %d\n", procID);
printf("Processo Pai - PID = %d\n", getpid());
w
return 1;
}
}
```
* A)O valor do PID do pai é de 4881 e do filho é 4882

# Exercicio 2
* Compile e execute o código a seguir, nomeando o fonte como processo2.c .
* Como acontece a execução deste código?
```cpp
#include <sys/types.h>
#include<unistd.h>
#include<stdio.h>
int f1(int x)
{
printf("x = %d", x);
}
int main()
{
pid_t procID;
procID = fork();
if (procID < 0)
{
printf("Erro na criacao do novo processo\n");
return -1;
}
else if (procID == 0)
{
printf("Processo filho - PID = %d\n", getpid());
f1(100);
printf("\nFilho executou a funcao f1 do Pai...\n");
return 1;
}
else
{
wait(NULL);
printf("\nProcesso Pai - PID = %d\n", getpid());
f1(50);
printf("\nPai executou a funcao f1...\n");
return 1;
}
}
```
* Basicamente o filho tem acesso ao mesmo código do pai, portanto a função f1 pertence ao pai, mas o filho tem acesso a essa função, por isso ele consegue executar a função do pai
```cpp
Processo filho - PID = 5392
x = 100
Filho executou a funcao f1 do Pai...

Processo Pai - PID = 5391
x = 50
Pai executou a funcao f1...
```

# Exercício 3
* Compile e execute o código a seguir, nomeando o fonte como processo3.c
* Obs.: na função execl, o primeiro argumento indica o caminho e o nome do arquivo a ser executado; os demais são argumentos que podem ser passados ao programa chamado.
* Identifique as chamadas ao sistema utilizadas
```cpp
#include<sys/types.h>
#include<unistd.h>
#include<stdio.h>
#include<stdlib.h>
#include <wait.h>
 
int main()
{
       pid_t procID;
       procID = fork(); 
 
       if (procID < 0)
       {
             printf("Erro na criacao do novo processo\n");
             return -1;
       }
       else if (procID == 0)
            {
             printf("Processo3.c: Processo filho - PID = %d\n", getpid());
             execl("./processo2", "0", "0", NULL);
             //execl("./procTwo", (char *)NULL);
             //execl("/bin/ls", "ls", "-l", (char *)NULL);
             // execl("/bin/ps", "ps", "-aux", (char *)NULL);
             exit(0);
             printf("Processo3.c: Filho executou o programa \"processo2.c!\"...\n");
             sleep(3);
             }
            else
            {
              wait(NULL);
              printf("Processo3.c: Processo Pai - PID = %d\n", getpid());
              return 1;
            }
}
```
* Basicamente o que está aconecendo nessa chamada é que esse código não possui nenhuma lógica implementada, mas ao usar "execl("./processo2", "0", "0", NULL);" ele executa o programa processo2.c e utiliza a função f1. Nesse programa o pai tem PID 5978 e o Filho 5979 e ao chamar o execl o programa do processos2.c roda e o pai do progama2.c tem PID 5979 e o filho 5980
