# Introdução

### Unidade 1: Fundamentos das linguagens formais e autômatos
* Compreender fundamentos das linguagens formais e autômatos, necessários ao reconhecimento de linguagens, de forma assertiva

### Unidade 2: Linguagem, gramática e expressões regulares, autômatos finitos
* Aplicar os formalismos da classe das linguagens regulares na análise léxica, de forma precisa

### Unidade 3: Linguagens livres do contexto
* Aplicar os formalismos da classe das linguagens livres do contexto na análise sintática, de forma precisa

### Unidade 4: Linguagens enumeráveis recursivamente, linguagens sensíveis ao contexto e introdução aos compiladores
* Aplicar os formalismos das diferentes classes de linguagens, no desenvolvimento da etapa de análise nos tradutores de linguagens de programação, de forma construtiva.
Abertura da disciplina

## Hierarquia de Classes de Linguagem
* Chomsky foi a pessoa que fez a "gramática" das Linguagens
* ***Imagem***

## Terminologia
* **Léxico**
  * Relativo à dicionário
* **Sintático**
  * Gramática, a forma da linguagem
  * Trata das propriedades da linguagem: verificação gramatical de programas
  * Formato
  * Manipula símbolos sem verificar o significado
  * Exemplo: Sintaxe do for: for(  ;  ;  ) {
* **Semântico**
  * Aborda o significado ou valor
  * Significado do comando dentro do contexto que ele foi implementado

## Teoria das Linguagens Formais
* 1936 - Allan Turing (Pai da Computação)
  * Máquina de Turing
  * Tudo que a máquina de turing conseguir processar, quer dizer que um computador sequencial conseguirá fazer
* Década de 50
  * Desenvolvimento de teorias relacionadas com linguagens naturais: importância para o estudo das linguagens artificiais
  * Chomsky: Gramáticas Formais
* Principais aplicações:
  * Análise léxica e sintática → **Tradutores** de linguagens de programação
    * Compiladores
    * Interpretadores
    * Montador (assembler)
  * Protocolos de comunicação (modelos)
  * Modelos de sistemas biológicos
  * Procura em corpo de texto, ocorrências de palavras, frases…
  * Desenho de hardware (circuitos digitais)

## Formalismos Usados
* **Formalismo Operacional** ou **Reconhecedor**
  * Autômato = Máquina abstrata
* **Formalismo Axiomático** ou **Gerador**
  * Gramática = regras associadas ao comportamento da linguagem
* **Formalismo Denotacional**
  * Expressão Regular

# Conceitos básicos
## Definição 1: Alfabeto
* **∑** → Alfabeto
* ∑₁ = {a, b, c, ..., x, y, z
* ∑₂ = {0, 1}
* ∑₃ = {a, b, c}

## Definição 2: Palavra
* **W** → palavra
* W₁ = 0001
* W₂ = 0100
* **ε** → palabra vazia
* $$ε^*_2 = {0, 1, 00, 01, 10, 11, 000, ..., ε}$$
* $$ε^+_2 = {0, 1, 00, 01, 10, 11, 000, ...}$$
* $$ε^*_4 = {ε, x, xx, xxx, xxxx, ...}$$

## Definição 3: Tamanho
* |  | → TAMANHO
* |W₁| = 4
* |W₂| = 3
* |ε| = 0

## Definição 4: Sufixo
* Prefixo de uma palavra é qualquer sequência inicial de símbolos da palavra
  * a, ae, aeb
* Sufixo de uma palavra é qualquer sequência final de símbolos da palavra
  * b, eb, aeb
* Subpalavra de uma palavra é qualquer sequência de símbolos contígua da palavra
  * prefixos, sufixos, e

## Definição 5: Linguagem formal
* Uma linguagem formal é um conjunto de palavras sobre um alfabeto
* ∑ = {0, 1}
* $$L1 = {W∈Z^{_+}| ∣W∣ = 2}$$ ---→ L1 = {00, 01, 10, 11}

## Definição 6: Concatenação
* W₁W₂ = 00110
* W₁ε = 001ε = 001
* εε = ε
* W₂W₃ = 1001

## Definição 7: Concatenação Sucessiva
* A concatenação sucessiva de uma palavra (com ela mesma), $$w^n$$, é definida como segue:

