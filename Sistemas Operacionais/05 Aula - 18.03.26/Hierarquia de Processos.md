// Example program
#include <sys/types.h>
#include<unistd.h>
#include<stdio.h>
#include <iostream>
#include <string>

int medidasTerrenoRetangular(int x, int y) 
{
    return x * y;
}
    

int main()
{
    pid_t procID;
    procID = fork();
    
    if (procID < 0)
    {
        printf("Erro na criacao do novo processo!\n");
        return -1;
    }
    
    else if (procID == 0)
    {
    printf("Processo filho | PID = %d\n", getpid() );    
    }
    
    
  std::string name;
  std::cout << "What is your name? ";
  getline (std::cin, name);
  std::cout << "Hello, " << name << "!\n";
}
