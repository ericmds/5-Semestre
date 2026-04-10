* Para um programa possuir "inteligência elevada", ele precisa ter:
  * Base de conhecimento
  * Raciocínio
  * Aprendizado ≅ Reconhecer padrões
* Quais tipos de problemas a IA resolve
  * Problemas que são necessários a presença de um "especialista", muitas vezes por conta da quantidade de restrições
  * Problemas em que não se sabe o estado final
  * Problemas em que se precisa saber o passo-a-passo da solução
* O que é I.A?
  * Área da Computação com metodologias, técnicas e algoritmos para resolver esses problemas
* Quais as principais subáreas da Inteligência Artificial
  * Métodos de busca - toda busca é um engine (motor)
    * Cegos ou força bruta: amplitude e profundidade
    * Heurísticos: Guloso, Subida de Encosta, A*, Algoritmos Genéticos
  * Redes Neurais
  * Sistemas Multiagentes
  * Representação de Conhecimento
  * Processo de Língua Natual
* Um sistema de comportamento inteligente possui:
  * Base de conhecimento
    * Fatos, regras, crenças e planos
  * Raciocínio Automatizado
    * Dedução
    * Indução
  * Aprendizado de Máquina
    * Treinamento por repetição
    * Amostras
* Que tipo de problema RNA resolve
  * Problemas de reconhecimento de padrões ou em que a presença do especialista é fundamental
* Quais as características que um problema apresenta quando ele tem alta complexidade?
  * Restrições
  * Desconhecimento do estado final
* No processo de modelagem da solução de problemas na área de IA, o que se deve modelar?
  * Estados Iniciais e Finais --> é uma possível solução, é um instante do processo de solução
    * Atributos
  * Regras de transição
    * Métodos
  * Lista de visitados
  * Função meta ou objetivo
 
---

# 🧠 1. O que é Inteligência Artificial?
Área da Ciência da Computação que desenvolve métodos, técnicas e algoritmos para resolver problemas complexos que exigem inteligência humana.
* 👉 Objetivo: construir **Sistemas de Comportamento Inteligente (SCI)**

# 🧩 2. Tipos de Problemas que IA resolve
- Problemas com muitas restrições
- Problemas sem solução direta
- Problemas com estado final desconhecido
- Problemas que exigem passo-a-passo
## Tipos:
- Diagnóstico (ex: medicina)
- Reconhecimento de padrões
- Planejamento ("empacotamento")
- Jogos e estratégias

# 🧠 3. Estrutura de um Sistema Inteligente
## 🧾 Base de Conhecimento
- Fatos
- Regras
- Experiências
## ⚙️ Motor de Raciocínio
- Dedução
- Indução
## 🤖 Aprendizado
- Treinamento por dados
- Reconhecimento de padrões
- 
# 📚 4. Subáreas da IA
- Métodos de Busca
- Representação de Conhecimento
- Algoritmos Genéticos
- Sistemas Multiagentes
- Redes Neurais
- PLN (Processamento de Linguagem Natural)

# 🔎 5. Métodos de Busca
## Busca Cega (Força Bruta)
- Profundidade (DFS → pilha)
- Largura (BFS → fila)

✔️ Garante solução  
❌ Alto custo

## Busca Heurística
### Custos:
- g(n): custo real
- h(n): custo estimado
- f(n) = g(n) + h(n)

## Métodos:
### ⛰️ Subida de Encosta
- Usa g(n)
- Pode parar em ótimo local
### 🎯 Guloso
- Usa h(n)
- Rápido, mas não garante melhor solução
### ⭐ A*
- Usa g(n) + h(n)
- Mais eficiente
### 🧬 Algoritmos Genéticos
- Evolução e seleção natural
- 
# 🧱 6. Modelagem de Problemas
- Estados
- Regras de transição
- Restrições
- Visitados
- Função objetivo
## Padrão:
Gerar → Testar → Validar → Repetir

# ♟️ 7. Problema das N Rainhas
- Tabuleiro NxN
- Objetivo: não haver conflitos

## Restrições:
- Linha
- Coluna
- Diagonal

# 🤝 9. Sistemas Multiagentes (SMA)

## 🎯 Definição:
Sistema composto por vários agentes inteligentes que interagem entre si.

## 📌 Características:
- Autonomia → cada agente toma decisões
- Comunicação → troca de informações
- Cooperação → agentes trabalham juntos
- Competição → agentes disputam recursos
- Comportamento emergente → solução surge da interação entre agentes

## 📌 Aplicações:
- Robótica
- Jogos
- Sistemas distribuídos
- Simulações

# 🧠 10. Redes Neurais Artificiais (RNA)

## 🎯 Objetivo:
Resolver problemas de reconhecimento de padrões

## 📌 Exemplos:
- Reconhecimento facial
- Diagnóstico médico
- Classificação de dados

## 📌 Funcionamento:
- Entrada → dados
- Camadas ocultas → processamento
- Saída → resultado

## 📌 Características:
- Aprendem com exemplos
- Ajustam pesos
- Necessitam grande volume de dados

# 🤖 11. IA Generativa

## 📌 Conceitos:

### LLM (Large Language Models)
- Modelos treinados com grandes volumes de texto
- Capazes de gerar respostas coerentes

### Transformers
- Arquitetura moderna de redes neurais
- Base dos modelos atuais

## 📌 Aplicações:
- Chatbots
- Geração de texto
- Tradução automática
- Assistentes virtuais

# 💻 12. Hardware em IA

## 📌 Prioridade:
1. RAM → armazenamento dos dados
2. CPU/GPU → processamento

## 📌 Observação:
- GPU é mais eficiente para redes neurais
- Quanto maior o modelo, maior o consumo de memória

# 🧠 13. Tipos de Problemas em IA

- Diagnóstico
- Reconhecimento de padrões
- Planejamento
- Otimização

# 🔁 14. Motores de Raciocínio

## 🎯 Função:
Algoritmos que buscam soluções para problemas

## 📌 Tipos:
- Dedução → regra geral → caso específico
- Indução → casos específicos → regra geral

## 📌 Métodos:
- Busca cega (força bruta)
- Busca heurística

# 📌 15. Conceitos Importantes

## 🔹 Heurística:
- Estratégia para acelerar a busca
- Pode ser:
  - Admissível → nunca superestima
  - Inadmissível → pode errar

## 🔹 Gerar e Testar:
1. Gerar novo estado (clone)
2. Testar:
   - ehValido()
   - jaVisitado()
   - ehMeta()

## 🔹 Clone:
- Evita alterar estados originais
- Fundamental em algoritmos de busca

# 🎯 16. Exemplos Clássicos

## 🧩 Sudoku:
- Matriz 9x9
- Restrições:
  - Linha
  - Coluna
  - Bloco 3x3
- Objetivo:
  - Nenhum valor repetido

## 🗼 Torre de Hanói:
- Estado final conhecido
- Objetivo:
  - Encontrar sequência de passos

## ♟️ Xadrez:
- Estado final desconhecido
- Necessita estratégia e heurística

# ⚠️ 17. DICAS PARA PROVA

✔️ IA = Base de Conhecimento + Raciocínio + Aprendizado  

✔️ Busca:
- Cega → custo alto, solução garantida  
- Heurística → mais rápida, pode não ser ótima  

✔️ A*:
- f(n) = g(n) + h(n)

✔️ Modelagem SEMPRE tem:
- Estado
- Regras de transição
- Restrições
- Visitados
- Função objetivo

✔️ Sempre usar clone

✔️ Heurística:
- Ajuda, mas pode errar
