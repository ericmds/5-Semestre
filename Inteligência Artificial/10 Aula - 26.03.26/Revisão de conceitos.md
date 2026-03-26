# Problemas que IA resolve
* Problemas de diagnóstico
  * Reconhecer padrões
* Problemas em que não se sabe como chegar no estado final -> "empacotamento"

# Técnicas de IA geram o constroem SISTEMAS DE COMPORTAMENTO INTELIGÊNTE
* Base de conhecimento
* Motores de raciocínio -> DUDUÇÃO E INDUÇÃOZ
  * Algoritmos de busca
    * Cega ou força bruta
      * Profundidade -> pilha
      * Largura ou amplitude -> fila
  * Informados ou heurísticos
    * CUSTO
      * real g(n) -> quanto ele custa
      * estimado ou heurístico h(n) -> admissível ou inadimissível
    *  Métodos
      * subida de encosta -> baseado no profundidade e foca no custo real
      * Guloso -> baseado no amplitudo, porque ele abre o mapa, abre a arvore e foca no custo estimado
      * A* -> baseado no amplitudo e some custo real (acumulado) com custo estimado -> com isso pode corrigir a heuristica que foi moldada
        * a heurística é ESTÁTICA
# Métodos de busca
* Busca o que?
  * Soluções para problemas
    * Gerar ou atingir estados desejados
      * Existe problemas que não conhecemos o estado desejado. Ex: Xeque-mate
      * Precisamos do passo-a-passo para solucionar isso 
      * Existe problemas que conhecemos o estado final. Ex: Torre de ranoi
    * Gerar ou produzir o passo-a-passo até o estado desejado
