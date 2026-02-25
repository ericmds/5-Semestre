# Estudo Dirigido (aula anterior)

### 1. Sistema de Computação Moderno
* <img width="725" height="672" alt="{FE76592C-01B5-4526-BED0-D3D58F8BB24A}" src="https://github.com/user-attachments/assets/51b9d086-2885-40c7-86c5-88748838779a" />



### 2. Inicialização
1. Exercício da BIOS - Teste de ...
2. Carregamento do BOOTLOADER
3. Primeiro processo do SO é iniciado: INIT
4. SO espera por 1 evento

### 3. Tratamento de interrupção (erros, eventos)
<img width="610" height="535" alt="{87716F10-0BEB-4886-B6D2-3288A003DCC0}" src="https://github.com/user-attachments/assets/9ffc81dc-6a9c-4bea-a996-8ecbf83ba9fe" />


1. Pausa do processamento
2. Nº IRQ → Tratador de interrupções (SO)
3. Chaveamento/troca de contexto
   * Salvar o contexo da escução
   * Carrega ou restaura o contexo da próxima execução
4. Buscar na TABELA ou VETOR DE INTERRUPÇÕES o endereço da rotina para tratar a IRQ.
   * | IRQ | Rotina |
     | -----------|--------- |
     |...|...|
     |...|...|
     
6. Carregar a rotina e tratar a interrupção

### 4. I/O síncrona e I/O assíncrona

### 5. DMA = Acesso Direto à Memória

### 6. RAM
#### Ciclo de execução de uma instrução
1. Busca 1 instrução na RAM
2. Decodificar a instrução
3. Buscar os operandos na RAM
4. Executar a instrução
<img width="850" height="786" alt="{B7118629-B28A-489D-8A9E-D4C7DC5B9A8D}" src="https://github.com/user-attachments/assets/b1cccefb-e62a-43ce-9891-8a186769e20f" />

### 7.
<img width="858" height="573" alt="{ED85F27E-EF60-4214-87D4-4CE491E3AB7C}" src="https://github.com/user-attachments/assets/ea4ee1bf-8c68-4e9b-bc86-04f22b90911d" />

### 8. Dados recentemente usados são armazenados na **CACHE** (compatibilizar a velocidade da CPU e RAM)
* Coerência e consistência de cache
