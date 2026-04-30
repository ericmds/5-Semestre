# Linguagens Regulares (Propriedades)
* Material na aula de 16/04/26

# Lema do Bombeamento para Linguagens Regulares
* Supondo n que é a quantidade de estados em um AFD e w a palabra de entrada
  * |w| ≥ n, w = uvz em que:
    * |wv| ≤ n ----------| para isso odo i ≥ 0
    * |vZ ≥ 1 -----------| uvz é palavra de L

## Ex: L = {a^kb^k | k ≥ 1}
n = 3
w = aabb

Para todo i ≥ 0:
i | uvz
-------
0 | aab^0b = aaEb = aabEL? Não, então L não é Linguagem Regular
1 | aab^1b = aabb
2 | aab^2b = aabbb

# Autômato com Pilha
<img width="624" height="630" alt="{6C29EA5D-45B1-49F5-B180-9EF80CF06827}" src="https://github.com/user-attachments/assets/b83a271a-306d-4294-a5e6-f4dd2ac153c9" />
* O Autômato com Pilha (AP) é um formalismo reconhecedor aplicado às Linguagens Livres do Contexto.
* A Pilha é infinita e independente da Fita de entrada. O sentido de crescimento da pilha é de baixo para cima
* O Topo da Pilha é variável e define a posição do último símbolo gravado na pilha
* A Base da Pilha é fixa
* O último símbolo gravado na pilha é o primeiro a ser lido.
* <img width="505" height="213" alt="{6CA65F3F-3E87-4C04-9AAD-ABCC8DE8F926}" src="https://github.com/user-attachments/assets/9670c977-a9db-48c3-a309-9b99a80413ed" />
* 


<img width="433" height="233" alt="{CA94E468-B3A1-4897-8295-4446CCB619F4}" src="https://github.com/user-attachments/assets/80d3e95f-524f-40d9-b100-640c08998dd3" />
