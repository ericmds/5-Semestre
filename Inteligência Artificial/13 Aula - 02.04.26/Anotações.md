# PROLOG
* https://www.swi-prolog.org/
* PROLOG é uma linguagem de paradigma lógica, o programador implementa o que quer e quando quer
* Usa como motor de racíocinio o método de busca por PROFUNDIDADE (recursivo e de força bruta)
* Baseado em sentença, predicados, assertivas ou cláusulas
* O mais comum é usar PREDICADO, que utiliza relação entre os objetos da sentança
* Em PROLOG um argumento/parâmetro que pode ser: OBJETO, LITERAL, VARIÁVEL (a primeira letra é maíscula)
* Não possui nada de controle de restrição

---
```PROLOG
### fato no predicado jogador(nome, idade) 
jogador('Alexandre', 45).
jogador('Luiz Friess', 17).
jogador('Victor', 19).
jogador('Maria', 55).

### fato no predicado homem(nome)
homem('Alexandre).
homem('Luiz Friess').
homem('Victor').

# Regra no prediaco mulher(nome). :- -> significa se somente se | "," significa e | "_" significa
mulher(M) :- jogador(M,_),
             not(homem(M)).

# fato no predicado joga(nome, tipo)
joga('Alexandre', 'RPG').
joga('Luiz Friess', 'FPS').
joga('Victor', 'FPS').
joga('Victor', 'MMO').
joga('Maria', 'MMO').
joga('Maria', 'RPG').

# fato no predicado jogo(nomeJogo, tipo, classificacaoEtaria)
jogo('The Witcher 3', 'RPG', 18).
jogo('Bioshock', 'FPS', 16).
jogo('WOW', 'MMO', 0).

# refra no predicado recomendaRPG(nome, jogo)
recomendaRPG(Pessoa, Jogo) :- jogador(Pessoa, IdadeJogador),
                              joga(Pessoa, 'RPG'),
                              jogo(Jogo, 'RPG', IdadeCensura),
                              IdadeJogador >= IdadeCensura.
censura(Pessoa, Jogo) :- jogador(Pessoa, IdadeJogador),
                         joga(Pessoa, Tipo),
                         jogo(Jogo, Tipo, IdadeIndicativa),
                         IdadeJogador >= IdadeCensura.  
```
