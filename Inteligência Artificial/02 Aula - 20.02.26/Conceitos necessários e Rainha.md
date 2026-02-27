# Conceitos obrigatório

#### 1. Que tipo de problema a IA resolve?
* Problemas que é necessário a presença de um "especialista", muitas vezes por conta da quantidade de **restrições**
  * Os tratamentos de restrições devem, sempre que possível, tentar tratar os erros e depois passar para o método
* Problemas em que não se sabe o estado final ou problemas em que se precisa saber o passo-a-passo da solução

#### 2. O que é Inteligência Artificial
* Área da Computação com metodologias, técnicas e algoritmos para resolver aqueles tipos de problemas

#### 3. Quais as principais subáreas da Inteligência Artificial
* Métodos de busca: - toda busca é engine/motor
  * **Cegos ou força bruta:** amplitude e profundidade
  * **Heurísticos:** Guloso, Subida de Encosta, A*, Algoritmos Genéticos
* Redes Neurais
* Sistemas Multiagentes
* Representação de Conhecimento
* Processo de Língua Natual

#### 4. O que é um sistema de comportamento inteligente?
* Um sistema composto por:
  * Base de Conhecimento (fatos, regras, crenças e plano);
  * Raciocínio Automatizado (dedução e indução);
  * Aprendizado de Máquina (treinamento por repetição ou amostras)

#### 5. Que tipo de problema RNA resolve?
* Problemas de reconhecimento de padrões ou em que a presença do especialista é fundamental

#### 6. Quais as características que um problema apresenta quando ele tem alta complexidade?
* Restrições
* Desconhecimento do estado final

#### 7. No processo de modelagem da solução de problemas na área de IA, o que se deve modelar?
* Estados: inicial(is) e final(is) --→ é uma possível solução, é um instante do processo de solução
  * Atributos
* Regras de transição
  * Métodos
* Lista de visitados
* Função meta ou objetivo

---

# Jogo da rainha
* Um tabuleiro com N x N de Xadrez precisa receber N rainhas. O objetivo é colocar as N rainhas no tabuleiro, uma a uma, de forma que nenhuma rainha elimine outra rainha (regras do xadrez)

## Passos de modelagem
1. Estados do problema ---→ (inicial, final e intermediários)
    * Objeto de uma classe com atributos diferentes em cada momento da solução
        * Matriz N x N de inteiros, onde 0 indica que não há rainha e 1 indica que há rainha naquela posição
        * Variável contabilizando o total de rainhas que estão no tabuleiro (int)
          ```
          Estado inicial
            Matriz inicializada com 0
            Por exemplo, assumindo que o N é 4
    
            Martiz
            0  0  0  0
            0  0  0  0
            0  0  0  0
            0  0  0  0
          
              qtdRainhas = 0
    
          Estado final (objetivo/meta)
            Por exemplo, qtdRainhas = 4
          ```
2. Regras de transição == métodos == Operações
   * Colocar uma rainha em um slot vazio ou célula == 0

3. Restrições ou método ehValido()
   * Procurar se o estado é inválido

4. Visitados
   * O tradicional = lista
   * O arrojado = árvore
   * **Ideal = HASH**

5. Função meta ou Objetivo
   * ?ehValido?
   * **?jaVisitei?**
   * ?ehMeta? --→ chegou ao lugar desejado

```java
public class Rainha {
  static List<Rainha> visitados = new LinkedList<>();

  int matriz[][];
  int qtdRainhas;

  public Rainha(int tamanhoTabuleiro) {
    this.matriz = int(tamanhoTabuleiro, tamanhoTabuleiro);
    this.qtdRainhas = 0;
  
    for(int i = 0; i < this.matriz.size(); i++) {
      matriz[i][j] = 0;
    }
  }

  public Rainha(int proximaRainha) {
    // Metodo para percorrer os slots/celular para encontrar um slot vago e então depositar uma rainha (linha, coluna)
  }

  public boolean ehMeta(int tamanhoTabuleiro) {
    return this.qtdRainha == tamanhoTabuleiro;
  }

  public boolean ehValido(Rainha novo) {
    // Metodo que avalie a matriz do novo, verificando se há mais de uma rainha: na coluna, diagonal principal e na diagonal secundaria
  }
```
