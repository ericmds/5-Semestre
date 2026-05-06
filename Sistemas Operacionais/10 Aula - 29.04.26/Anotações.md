## Condição de Corrida
* cont -> variavel
* acc -> processador

## Seção Crítica
* é uma parte de codigo de um processo ou thread onde acontece a manipulação de dados que são compartilhados com outros processos ou threads e deve executar de forma atômica com as interrupções desabilitadas
* para evitar a Condição de Corrida, deve-se proteger a Seção Crítica do código
* quando vários threads possuem seção críticas, enquanto um estiver executando, nenhum outo pode executar, ou seja, o acesso à seção crítica é mutualmente exclusivo

## Requisitos de uma solução à Seção Crítica

## Mecanismos de Sincronização
* 

---

# Jantar dos Filósofos
**Grupo:** Eric Silva, G. Frazzon, Luiza Karlec, Vanessa Cezar

---

## Introdução — O Problema

### O que é

Cinco filósofos sentam-se à mesa redonda para comer espaguete.
Cada filósofo tem um prato à sua frente, mas há apenas **cinco
garfos** no total — um entre cada par de vizinhos.

Para comer, um filósofo precisa de **dois garfos**: o da esquerda
e o da direita. Quando não está comendo, ele está pensando.

O desafio: como garantir que todos consigam comer, sem que o
sistema entre em colapso?

---

## Seção Crítica

### Definição

A **seção crítica** é o trecho de código em que um processo acessa
um ou mais recursos compartilhados. A regra fundamental é:
**dois processos não podem estar em sua seção crítica ao mesmo
tempo** — isso geraria uma condição de corrida.

### Qual é a seção crítica neste problema?

A seção crítica é a **operação de comer**, pois ela exige a posse
exclusiva dos dois garfos adjacentes. Fora desta seção, nenhum
filósofo deve estar segurando qualquer garfo.

### Condições de Coffman — quando ocorre deadlock?

Para que um deadlock aconteça, as quatro condições abaixo devem
ocorrer **simultaneamente**:

| Condição | Descrição no problema |
|---|---|
| **Exclusão mútua** | Nenhum garfo pode ser usado por dois filósofos ao mesmo tempo |
| **Retenção de recursos** | O filósofo segura um garfo enquanto espera pelo segundo |
| **Não-preempção** | Nenhum filósofo pode tomar o garfo de outro à força |
| **Espera circular** | F0 espera o garfo de F1, F1 espera o de F2… F4 espera o de F0 |

> Uma solução eficaz deve **negar pelo menos uma** dessas condições.

---

## Tentativas Ingênuas (e por que falham)

### Tentativa 1 — Pegar e aguardar (causa Deadlock)

O filósofo tenta pegar o garfo da esquerda. Se não conseguir,
aguarda e tenta novamente. Ao conseguir, mantém o garfo e repete
o processo para o da direita.

**Problema:** se todos os filósofos pegarem o garfo da esquerda
simultaneamente, nenhum conseguirá o da direita. O sistema entra
em **espera infinita** — deadlock total.

---

### Tentativa 2 — Devolver e esperar tempo fixo (causa Starvation)

O filósofo tenta pegar os dois garfos. Se não conseguir o segundo,
devolve o primeiro e aguarda um **tempo fixo** antes de tentar
novamente.

**Problema:** se todos os filósofos operarem no mesmo ritmo,
entrarão em um ciclo sincronizado de pegar e devolver. Nenhum
consegue comer — **starvation** coletivo.

---

### Tentativa 3 — Devolver e esperar tempo aleatório (ainda falha)

Igual à tentativa 2, mas o tempo de espera é **aleatório**, para
reduzir a chance de sincronismo.

**Problema:** o tempo aleatório diminui a probabilidade de
starvation, mas **não elimina** o risco. Um filósofo azarado pode,
estatisticamente, sempre tentar nos momentos de ocupação e nunca
conseguir comer.

---

## Solução dos Semáforos — Principais Características

Esta solução **elimina deadlock e starvation** ao garantir que um
filósofo só pega os garfos quando ambos estão disponíveis.

**Mecanismos utilizados:**

- **Mutex** — garante exclusão mútua no acesso a cada garfo.
  Cada garfo é representado como um `mutex` individual.
- **`lock()`** — tenta adquirir os dois locks ao mesmo tempo.
  Se conseguir apenas um, libera imediatamente os dois.
- **`lock_guard`** — garante que os garfos sejam liberados
  automaticamente ao final da operação `comer()`.
- **Escalonador do SO** — quando um filósofo termina de comer
  e libera os mutexes, as threads em espera entram em fila
  gerenciada pelo sistema operacional.

---

## Solução dos Semáforos — Fluxo do `comer()`

```cpp
void comer(int filosofo) {
    int esq = filosofo;
    int dir = (filosofo + 1) % 5;

    // Tenta adquirir os dois garfos simultaneamente
    // Se conseguir só um, libera ambos e aguarda
    lock(garfos[esq], garfos[dir]);

    // ── INÍCIO DA SEÇÃO CRÍTICA ──────────────────
    lock_guard<mutex> garfo_esq(garfos[esq], adopt_lock);
    lock_guard<mutex> garfo_dir(garfos[dir], adopt_lock);

    // Filósofo come (acesso exclusivo aos dois garfos)

    // ── FIM DA SEÇÃO CRÍTICA ─────────────────────
    // lock_guard libera os mutexes automaticamente ao sair do escopo
}
```

**Por que isso funciona:**
- `lock()` quebra a condição de **retenção de recursos** — ou o
  filósofo pega os dois garfos de uma vez, ou não fica com nenhum.
- Sem retenção, a espera circular não se forma → **sem deadlock**.
- A fila do SO garante atendimento justo → **sem starvation**.

---

## Análise dos Resultados

O gráfico abaixo mostra o número de vezes que cada filósofo
comeu e pensou durante a simulação com a solução de semáforos.

*(inserir gráfico aqui)*

**Interpretação:**

- Todos os 5 filósofos realizaram entre **~2700 e ~2800 operações**
  de comer — uma distribuição notavelmente equilibrada.
- A linha de média confirma que nenhum filósofo foi prejudicado
  sistematicamente, provando a **ausência de starvation**.
- Os resultados validam que a solução de semáforos garante
  **equidade e progresso** para todos os processos.

---

## Referencial Bibliográfico

SILBERSCHATZ, Abraham; GALVIN, Peter B.; GAGNE, Greg.
**Fundamentos de Sistemas Operacionais**. 9. ed.
Rio de Janeiro: LTC, 2015. Cap. 6 — Sincronização de Processos.

PANTUZA, Gustavo. O Jantar dos filósofos — Problema de
sincronização em Sistemas Operacionais. *Blog de Ciência da
Computação*, 2018. Disponível em:
https://blog.pantuza.com/artigos/o-jantar-dos-filosofos-problema-de-sincronizacao-em-sistemas-operacionais.
Acesso em: 3 mai. 2026.
