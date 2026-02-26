# Relembrando - Inteligência Artifical
* Área da Ciência da Computação ---→ Metodologia e técnicas/métodos (coisas diferente)
  * Para construir base de conhecimento, projetar e construir **SISTEMAS DE COMPORTAMENTO INTELIGÊNTE**
    * **BASE DE CONHECIMENTO - (PROLOG; SMA; RNA)**
      * Estruturada
        * banco de dados
      * Não Estruturada
        * fatos
        * regras
        * experiências
    * **MOTORES DE RACIOCÍNIO (MÉTODOS DE BUSCA; SMA)**
      * Dedução ou Indução
        * Profundidade e largura (força bruta)
        * Subida de encosta, gulosa, A*, Algoritmos Genéticos (heurísticos)
          * Dica, na computaão é heurística. Pode ser admissível ou inadmissível (boa ou ruim)
    * **APRENDIZADO DE MÁQUINA** OU **RECONHECIMENTO PADRÕES POR AMOSTRAS** (RNA)
      * Repetição e volume de amostras

  * TIPOS DE PROBLEMAS ADEQUADOS PARA I.A.
    * Diagnóstico - reconhecimento de padrões (substituir o especialista)
    * "Empacotamento" - descobrir o estado final e/ou os passos até o estado final

# MOTORES DE RACIOCÍNIO
* Algoritmo que buscam soluções de problema
  * busca de força bruta (mais processamento e mais consumo de memória)
    * SEMPRE SE CHEGA NA MELHOR SOLUÇÃO
  * busca de heurística (menos processamento e menos consumo de memória)
    * NEM SEMPRE SE CHEGA NA SOLUÇÃO MELHOR (depende da heurística)
* Solucionar um problema com métodos de busca exige a modelagem em:
  * estados
  * regras de transição
  * restrições
  * visitados (listas ou hash)
  * função objetivo (saber se o sistema atingiu a solução) 
