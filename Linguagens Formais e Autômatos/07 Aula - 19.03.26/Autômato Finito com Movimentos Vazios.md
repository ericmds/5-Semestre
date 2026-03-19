# Autômato Finito com Movimentos Vazios - AFN
<img width="648" height="485" alt="{113F1D90-237A-4ACD-963B-D94E4C9C83EC}" src="https://github.com/user-attachments/assets/3c87a788-bd0e-4b4f-9c76-69cc5f46d35d" />

* Um movimento vazio é uma transição sem leitura de símbolo algum da fita
* Não aumenta o poder computacional
* Qualquer Autômato Finito com Movimentos Vazios pode ser simulado por um AFN
* Representa a mudança de estado, sem leitura de símbolo da fita

### Exemplo 1
<img width="310" height="145" alt="{160F38B2-37C4-4B40-9CD6-04899CA77895}" src="https://github.com/user-attachments/assets/24f32c89-3e46-4f64-8170-676ca8d9bd13" />

### Exemplo 2
<img width="313" height="145" alt="{3EF6E3A7-9D7A-471D-B7F6-DB1306E9D2FC}" src="https://github.com/user-attachments/assets/ea39d27b-deae-47f0-acf4-b20170a5c206" />
* Fita: a, b, aab, abb, ...
* <img width="423" height="123" alt="{97699354-B7DE-46D5-9C9A-4D9403F75618}" src="https://github.com/user-attachments/assets/8e755346-305c-4587-bf26-07476c12aa2f" />

## Exemplo 3
<img width="541" height="727" alt="{6E6B55A2-9C40-4B28-9D91-F9C4B4804E3D}" src="https://github.com/user-attachments/assets/5f201c81-0959-4b87-90b7-eaacfe9d9611" />

## Exercício 6 - Lista 2
<img width="644" height="217" alt="{BDF25C78-1DAC-4D71-B7FA-44896385A82A}" src="https://github.com/user-attachments/assets/326c8d7c-a1c2-4e16-9267-f5f9354b3294" />
### Resposta: Letra C

# Expressão Regular (E.R.)
* Autômato Finito → Reconhecedor
* Expressão Regular → Denotacional
* É um formalismo denotacional para linguagens regulares
* É considrado um formalimo gerador, pois por meio de uma E.R. é possível gerar as palavras de uma Linguagem Regular (Autômatos)
* É dfinida a partir de conjuntos básics e operações de concatenação e união
* Uma linguagem gerada por expressão regular é representada por:
  * L(r)
  * GERA(r)

 # Definição
 ## Uma Expressão Regular (ER) sobre um alfabeto Σ definida:
 * ∅ é uma ER e denota a Linguagem Vazia
   * L = { }
* ε é uma ER e denota a Linguagem que possui somente a Palavra Vazia
  * L = {ε}
* Qualquer símbolo x ∈ Σ é uma ER e denota a Linguagem contendo {x}
  * a denota L = {a}

##  Se r e s são ER e denotam as linguagens R e S, respectivamente, então:
* (r + s) é ER e denota a linguagem R∪S
  * Exemplo: (a + b) denota L = {a, b}
* (rs) é ER e denota a linguagem RS = {uv | u∈R e v∈S} → Contatenação
  * Exemplo: (ab) denota L = {ab}
* (r*) é ER e denota a linguagem R*
  * Exemplo: (a*) denota L = {an | n ≥ 0}

### Exemplos: Seja Σ = {a, b}
|Letra|Expressão|Linguagem|
|-|-|-|
|A)|aa|L1 = {aa}|
|B)|ba*|L2 = {todas as palavras que iniciam por b e possuem 0 ou mais a's na sequência}|
|C)|(a+b)*|L3 = {todas as palavras sobre {a, b} }|
|D)|(a+b)*aa(a+b)*|L4 = {w possui aa como subpalavra}|
|E)|a*ba*ba*|L5 = {w possui apenas dois b's}|
|F)|(a+b)*(aa+bb)|L6 = {w | w possui aa ou bb como sufixo}|

#### A) L1 = {aa}
<img width="435" height="316" alt="{D06A9FEF-F045-4E9D-85D2-4ABE7D31A069}" src="https://github.com/user-attachments/assets/abae3e9e-93eb-4fb8-99c8-d487d2022d35" />

#### B) L2 = {todas as palavras que iniciam por b e possuem 0 ou mais a's na sequência}
<img width="503" height="334" alt="{5B481B1C-C55B-424D-B50D-4706DE69A8C2}" src="https://github.com/user-attachments/assets/936035d9-cb12-4ded-b0da-e1d2a7ff772b" />

#### C) L3 = {todas as palavras sobre {a, b} }
<img width="576" height="363" alt="{8CD7D071-EE37-4C50-ABDB-D40201C7F6DC}" src="https://github.com/user-attachments/assets/df7aaec0-85f6-440e-9389-66ec451c7894" />

#### D) L4 = {w possui aa como subpalavra}


#### E) L5 = {w possui apenas dois b's}


#### F) L6 = {w | w possui aa ou bb como sufixo}

