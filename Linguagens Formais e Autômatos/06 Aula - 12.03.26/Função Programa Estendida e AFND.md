# Função Programa Estendida, Computação
* É usada para mostrar formalmente a computação de um A.F.
* Seja um A.F.D. M = (∑, Q, ∂, q0, F) a Função Programa Estendida é denotada por:

$\underline{\sigma} : Q \times \Sigma^* \rightarrow Q$


* e é indutivamente definida:
* 
$\underline{\sigma}(q, \varepsilon) = q$

$\underline{\sigma}(q, aw) = \underline{\sigma}(\sigma(q,a), w)$

* Portanto, a sigma sublinha consiste na sucessiva aplicação da sigma a palavra de entrada

# Autômato Finito Não Deterministico (AFND ou AFN)
* Ao processar uma entrada, tem como resultado um CONJUNTO de novos estados
* Por exemplo, q0 ao processar o símbolo "a" pode assumir vários estados
(Foto Slide)
