# Métodos de buscas heurísticas
* Dois custos
  * Custo real
    * Método: Subida de encosta e o A*
      * Se no problema o custo é um, eu não posso utilizar ele
      * Se não existe um custo real, não é possível utilizar subida de encosta e o A*
  * Custo estimado
    * Métodos: Guloso e o A*

# Métodos e busca em geral
* Gerar e testar
  * Gerar: gerar um novo estado CLONADO
  * Tester: ehValido, foiVisitado, ehMeta
* Modelagem
  * Estados -> Estrutura de Dados -> atributos/variáveis
  * Regras de Transição -> métodos
  * Restrições -> ifs e validações
  * Estrutura de Visitados -> Listas ou HashMaps
  * Função meta ou objetivo
* Objetios possuem endereço ou referência
  * Por exemplo,
    * Aluno a;
    * Aluno b;
    * metodo(a, b);
      * Se dentro do método eu alterar o valor de a ou b, ele vai alterar o valor do a e b da linha 22 e 23
      * Por isso temos que utilizar o clone
      * O correto seria assim
    * Aluno aTmp = a.clone();
    * Aluno bTmp = b.clone();

# Técnicas de IA
* Projetar e construir Sistemas de Comportamento Inteligênte
  * Base de conhecimento
    * Representar conhecimento e raciocinar na base
  * Motores de raciocínio
    * Métodos de busca
  * Aprendizado de máquina

## Base de Conhecimento
* O desafio é representar o conhecimento no computador
* Existe uma linguagem chamado **PROLOG**
  * É uma linguagem no contexto do **PARADIGMA LÓGICO** -> lógica de 1ª ordem

# PROLOG
* Linguagem no contexto do PARADIGMA LÓGICO - lógica de 1ª ordem
  * Dentro de uma sentença há parâmetros ou argumentos
    * Objeto: mateus, golfinho, mauricio
    * Literal: "Mateus", "Golfinho", "Mamífero"
    * Variável: palavra ou letra em maiusculo -> NÃO TEM TIPO e NEM TEM INSTANCIAÇÃO  
  * Sentenças ou assertivas ou predicados
    * FATOS - verdades incontestáveis na base
      * progenitor(joão, mateus). -> sentença
        * Predicado = progenitor
      * disciplina(alex,ia,cc,2026). -> sentença
        * Predicado = disciplina
      * eh(golfinho, mamifero, aquatico). -> sentença
        * Predicado = eh
      * eh(vaca, mamifero, terrestre). -> sentença
        * Predicado = eh
      * jogos(counterStrike, fps, 18). -> sentença
        * Predicado = jogos
    * REGRAS - hipóteses com uso de :- e variáveis
      * progenitor(joão, daiane)
      * progenitor(joao, mateus)
      * irmaos(A, B) :-
        * progenitor(Pai, A)
        * progenitor(Pai, B)
    * ?- irmaos(mateus, Q) 
        
### Paradigima de Programação
* Linguagens: C, C++, C#, Java, Python, SQL, Haskell, JS... seguem as linguagens Imperativo, lógico e funcional
  * Imperativo - Java, Python...
    * O que fazer
    * Como fazer
    * Quando
  * Lógico - SQL...
    * O que fazer
    * Quando fazer
  * Funcional - Haskell...
    * O que fazer
    * Quando fazer
    * Somente por funções
* Programação
  * Instruir
    * Instruções
    * Sequência
  * Equipamento
    * Ações 
