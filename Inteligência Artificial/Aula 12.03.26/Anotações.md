# I.A. Generativa
* Entender o que é: L.L.M. - Large Linguage Model
  * Qual é o L.L.M. da Meta, OpenAI, ....
  * L.L.M. maior -> base maior
* Entender o que é: Transformers - Transformers

## H.W em IA
* 1º) RAM
* 2º) CPU/GPU -> RAM

## S.C.I.
* I.A.
  * Base de Conhecimento (L.M.M - Large Linguage Model, Transformers)
  * Motor Raciocínio
  * Aprendizado

# SUDOKU
* Matriz 9x9 - int
  * Box 3x3
* Total de vazio = 0, para saber se chegou no estado final
<img width="694" height="633" alt="{C10A4F99-A001-498D-B38F-4D3F1E2F6DA2}" src="https://github.com/user-attachments/assets/b8e473c7-0aa8-4556-9bd8-1501d178958a" />

* Regras
  * Tentar inserir numero (1 a 9) no primeiro slot livre

* Restrições
  * 1º) Avaliar linha
  * 2º) Avaliar coluna
  * 3º) Avaliar box

* E0 = Matriz c/ nº aleatórios
  * Inicial em tempo de programação
  * Inicial vindo do arquivo

* Ef = totalVazio == 0 && nenhuma restrição ferida 
