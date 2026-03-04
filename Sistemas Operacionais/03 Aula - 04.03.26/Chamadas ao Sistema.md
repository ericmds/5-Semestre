# Chamadas ao Sistema

* As Chamadas ao Sistema (System Calls) fornecem a interface entre um processo e o sistema operacional
  * Interface de programação para os serviços fornecidos pelo SO
* System Calls
  * Instruções em assembly
  * Podem ser escritas em uma linguagem de mais alto nível, como C ou C++
  * Acessada pelos programas de alto nível por meio da API – Application Program Interface
  * Programa de alto nível → pode gerar outras chamadas
  * In-line
* É necessário o mecanismo de interrupções.
* API disponíveis aos compiladores pelos Sistemas Operacionais
* Exemplo API para manipulação de arquivos na Linguagem C
* Exemplo: Copiar 2 arquivos
  * 1º) Criar o novo arquivo copia.txt (Abrir - criando - em modo de ESCRITA)
  * 2º) Abrir o arquivo original.txt (em mode LEITURA)
  * 3º) Ler 1 linha no arquivo original.txt
  * 4º) Gerar 1 linha no arquivo copixa.txt
  * 5º) Fechar o arquivo original.txt
  * 6º) Fechar o arquivo copia.txt
<img width="435" height="502" alt="{DCF75E08-1C10-4032-9080-9587BB65B7FF}" src="https://github.com/user-attachments/assets/864d8bb3-1fda-47da-a219-4fb1eef0ec7b" />
<img width="612" height="361" alt="{66BF1357-011C-49EA-BAC7-52C8C6E8606D}" src="https://github.com/user-attachments/assets/4f321a5b-5994-4e21-9cc7-8ddf610b44e1" />

* Fonte: https://www.youtube.com/watch?v=dmHaiRxqghU
  
