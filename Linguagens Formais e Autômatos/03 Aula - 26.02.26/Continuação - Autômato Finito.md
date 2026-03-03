# Correção dos Exercícios
## L₃ = {W ε {0,1}⁺ | W tem prefixo 10}
L₃ = {10, 100, 101, 1000, 1010, ...}

Fita de entrada: 0 0 1 1 

<img width="483" height="269" alt="{D7EE6900-99D1-4876-AA1A-554E6CB0703C}" src="https://github.com/user-attachments/assets/90ab3cd5-d436-4460-bf2c-c024ec4c661e" />


## L₄ = {W ε {a, b}⁺ | ∣w∣ ≥ 2 e tem prefixo b}
L₄ = {ba, bb, baa, bab, bba, bbb, baaa, ...}

Fita de entrada: b, a

<img width="485" height="266" alt="{47F5BE9D-294A-4A22-92DB-38AD2BFCE1AE}" src="https://github.com/user-attachments/assets/81112124-f6ce-4f61-9879-1cc66353ff84" />

---
# Definição
Um Automato Finito é uma 5-upla M = (∑, Q, σ, q₀, F) em que:
* ∑ é o alfabeto
* Q é o conjunto dos estados
* σ (sigma) é a função **programa** ou **função transição** ou **programa definida** E = Q x E → Q
* q₀ é o estado inicial
* F é o conjunto de estados finais

## Exemplos com L₃ e L₄
### L₃ = {W ε {0,1}⁺ | W tem prefixo 10}
```
        ∑           Q       σ  q₀    F
M₃ = ({0, 1}, {q₀, q₁, q₂}, σ, q₀, {q₂} )
```
### L₄ = {W ε {a, b}⁺ | ∣w∣ ≥ 2 e tem prefixo b}
```
        ∑           Q       σ  q₀    F
M₄ = ({a, b, {q₀, q₁, q₂}, σ, q₀, {q₂} )
```

### L₅ = {W ε {a, b, c}⁺ | ∣w∣ ≥ 2 e tem prefixo aacc e ∣w∣ ≥ 5}
<img width="532" height="271" alt="{D2133ED0-A106-494C-9365-7612290484CC}" src="https://github.com/user-attachments/assets/a6d3c139-76e8-405c-9ed8-663faa911100" />


### L₆ = {W ε {0, 1}⁺ | w tem tamanho ímpar}
<img width="294" height="258" alt="{2EB766E9-8991-47CA-969E-16DA88B53CD8}" src="https://github.com/user-attachments/assets/3d08251e-874b-4b65-8422-2b5baefe6547" />


### L₇ = {W ε {a, b}⁺ | ab é subpalavra de W} - AUTÔMATO FINITO DETERMINÍSTICO
<img width="781" height="378" alt="{5450ECB2-8D0B-4E00-8283-28151ABE86D6}" src="https://github.com/user-attachments/assets/d87f644b-fc58-448e-b967-0633b98810b9" />


### L₈ = {W ε {a, b}⁺ | W tem subpalavra aaa}


### L₉ = {W ε {a, b}⁺ | W tem sufixo 10}
<img width="530" height="547" alt="{EA799DD7-9BBB-4360-BE2D-815B0D344999}" src="https://github.com/user-attachments/assets/7206c0f5-7f91-476a-b09b-acb7a81a5023" />
