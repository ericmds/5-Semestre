# Exercícios de Prolog
## Domínio: Sistema Escolar
1. **Pré-requisitos:** Crie fatos disciplina(nome) e pre_requisito(Anterior, Posterior). Escreva uma regra pode_cursar(Aluno, Disciplina) que verifica se o aluno já completou os requisitos necessários.
2. **Aprovação:** Com fatos nota(Aluno, Disciplina, Valor), crie a regra aprovado(Aluno, Disciplina) (nota >= 7.0) e reprovado(Aluno, Disciplina) (nota < 7.0).
```prolog
/* disciplina(nome) */
disciplina("Inteligência Artificial").
disciplina("Estrutura de Dados").
disciplina("Algoritmos B").

/* pre_requisito(Anterior, Posterior) */
pre_requisito("Algoritmos B", "Estrutura de Dados").
pre_requisito("Estrutura de Dados", "Inteligência Artificial").

/* ja_cursou(Aluno, Disciplina) */
ja_cursou("Freitas", "Algoritmos B").
ja_cursou("Éric", "Algoritmos B").
ja_cursou("Vanessa", "Algoritmos B").
ja_cursou("Henriques", "Estrutura de Dados").
ja_cursou("Luiza", "Estrutura de Dados").
ja_cursou("Frazzon", "Estrutura de Dados").

/* pode_cursar(Aluno, disciplina)
 * se ja cursou o pre requisito
 * o pre requisito da disciplina
 */ 
pode_cursar(Aluno, Disciplina) :-
  ja_cursou(Aluno, Pre),
  pre_requisito(Pre, Disciplina).

/* nota(Aluno, Disciplina, Nota) */
nota("Freitas", "Algoritmos B", 4).
nota("Éric", "Algoritmos B", 9).
nota("Vanessa", "Algoritmos B", 9).
nota("Henriques", "Estrutura de Dados", 5).
nota("Luiza", "Estrutura de Dados", 9).
nota("Frazzon", "Estrutura de Dados", 9).
nota("Éric", "Estrutura de Dados", 9).

/* aprovado(Aluno, Disciplina)
 * nota do aluno na disciplina
 * valor da nota >= 7
 */
aprovado(Aluno, Disciplina) :-
    nota(Aluno, Disciplina, Valor),
    Valor >= 7.

reprovado(Aluno, Disciplina) :-
    nota(Aluno, Disciplina, Valor),
    Valor < 7.
```
