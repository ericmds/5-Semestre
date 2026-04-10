# INTELIGÊNCIA ARTIFICIAL (IA)

## Definição
Inteligência Artificial (IA) é a área da computação que utiliza técnicas, métodos e algoritmos para construir sistemas com comportamento inteligente.

---

## Estrutura de um Sistema Inteligente
Um sistema com comportamento inteligente é composto por:

- Base de conhecimento (fatos, regras, experiências)
- Raciocínio automatizado (dedução e indução)
- Aprendizado de máquina (reconhecimento de padrões)

---

## Tipos de Problemas Ideais para IA
- Diagnóstico (análise, reconhecimento, tomada de decisão)
- Problemas baseados em sequência de passos (“empacotamento”)

---

## Conceitos Importantes

### Tipos de Problemas que IA Resolve
- Problemas com muitas restrições
- Problemas que exigem especialistas
- Problemas sem estado final claro
- Problemas que exigem passo a passo da solução

---

### Subáreas da IA

#### Métodos de Busca
- Motores de raciocínio:
  - Força bruta (cega)
    - profundidade
    - amplitude
  - Heurísticos
    - guloso
    - subida de encosta
    - A*

#### Outras áreas
- Redes neurais
- Sistemas multiagentes
- Representação de conhecimento (ex: Prolog)
- Processamento de linguagem natural

---

### Características de Problemas Complexos
- Muitas restrições
- Estado final desconhecido

---

## Modelagem de Problemas em IA

Para resolver problemas com IA, deve-se modelar:

1. Estados
   - inicial
   - intermediários
   - final (objetivo)

2. Regras de transição
   - ações possíveis (métodos)

3. Restrições
   - validação dos estados

4. Visitados
   - lista, árvore ou hash

5. Função objetivo (meta)
   - verifica se chegou na solução

---

## Observação Importante
A validação deve começar verificando erros e restrições, não acertos.

---

## Problema das N Rainhas

### Objetivo
Colocar N rainhas em um tabuleiro NxN sem que se ataquem.

### Modelagem

#### Estado
- Matriz NxN:
  - 0 → vazio
  - 1 → rainha
- Variável:
  - qtdRainhas

#### Estado Inicial
- Tabuleiro vazio

#### Estado Final
- qtdRainhas == N

#### Regras de Transição
- Inserir rainha em posição vazia

#### Restrições
- Não pode haver mais de uma rainha:
  - na linha
  - na coluna
  - nas diagonais

## Métodos de Busca

### Força Bruta (Busca Cega)
- Maior custo computacional
- Maior consumo de memória
- Sempre encontra a melhor solução (completude garantida)

#### Profundidade (DFS - Depth First Search)
- Estrutura: pilha
- Percorre um ramo inteiro antes de voltar
- Não garante a melhor solução
- Encontra a primeira solução possível
- Menor consumo de memória

Características:
- Pode entrar em caminhos muito longos ou infinitos
- Pode ser implementado com recursão
- Realiza poda de estados inválidos

---

#### Amplitude (BFS - Breadth First Search)
- Estrutura: fila
- Percorre a árvore por níveis
- Encontra todas as soluções possíveis
- Garante a melhor solução (em número de passos)
- Alto consumo de memória

Características:
- Mais utilizado em problemas clássicos
- Expande todos os nós de um nível antes de avançar

---

### Heurísticas (Busca Informada)
- Menor custo computacional
- Utiliza informações adicionais (dicas)
- Não garante a melhor solução (depende da heurística)

---

#### Subida de Encosta (Hill Climbing)
- Baseada em profundidade
- Estrutura: pilha (ou recursão)
- Utiliza custo real g(n)
- Sempre tenta melhorar a solução atual

Características:
- Pode ficar presa em máximos locais
- Não garante solução ótima
- Simples e rápida

---

#### Guloso (Greedy Search)
- Baseado em amplitude
- Estrutura: fila
- Utiliza custo estimado h(n)
- Escolhe sempre o menor custo estimado

Características:
- Foca apenas no objetivo
- Pode ignorar caminhos melhores a longo prazo
- Não garante solução ótima

---

#### A* (A estrela)
- Baseado em amplitude
- Estrutura: fila (normalmente fila de prioridade)
- Combina custo real e estimado

Função:
f(n) = g(n) + h(n)

Onde:
- g(n): custo real acumulado
- h(n): custo estimado até o objetivo

Características:
- Mais completo e eficiente
- Garante solução ótima (se h(n) for admissível)
- Maior custo computacional

---

## Processo de Exploração de Estados

Para cada novo estado gerado:

1. Verificar se é válido (restrições)
2. Verificar se já foi visitado
3. Verificar se é estado objetivo

---

## Estruturas Utilizadas

- Pilha → busca em profundidade
- Fila → busca em amplitude
- Fila de prioridade → A*
- Lista / Hash → controle de visitados

---

## Critérios de Avaliação de Algoritmos de Busca

- Completude:
  - Garante encontrar solução se existir

- Complexidade de tempo:
  - Quantidade de nós explorados

- Complexidade de memória:
  - Quantidade de memória utilizada

- Qualidade da solução:
  - Se a solução encontrada é a melhor possível

---

# Modelagem do Problema
1) **Estados:** 
    - estado inicial :
        - Ce = 3,Me = 3, Cd = 0 , Md = 0, barco = 'e'
            - todos canibais e missionários na mesma margem, nesse caso todos iniciaram na esquerda 
        - variáveis do tipo int que representam a quantidade de canibais e missionarios em cada margem do rio 
            - Ce = total de canibais na margem esquerda
            - Cd = total de canibais na margem direita
            - Me = total de missionarios na margem esquerda
            - Md = total de missionarios na margem direita
        - variavel do tipo char 
            - barco = localizar em que lado esta o barco
2) **Regras de Transição:**
    - canibalSozinho
    - missionarioSozinho
    - doisCanibais
    - doisMissionarios
    - canibalMissionario
3) **Restrições:**
    - Número de canibais NUNCA pode ser maior que o número de missionários, se tiver algum, em uma das margem
        - if(Me > 0 && Ce > Me) return false
        - if(Md >0 && Cd > Md)  return false
    - não pode ter numero de canibais ou missionario menor que zero ou maior que 3
        - if (Ce < 0 || Ce > 3 || Cd < 0 || Cd > 3) return false;
        - if (Me < 0 || Me > 3 || Md < 0 || Md > 3) return false;
4) **Visitados:**
    - armazena os estados que já foram visitados
    - os estados já visitados ficam armazenados em um string de concatenação das 5 variaveis do problema na ordem (Ce,Cd,Me,Md,barco)
5) **Função Objetivo:**
    - Ce = 0, Me = 0, Cd = 3, Md = 3;
        - que todos tenham atravessado para outra margem
