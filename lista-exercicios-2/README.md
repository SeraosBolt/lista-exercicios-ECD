## Trabalho Estrutura e Classificação de Dados
## Analise Métodos de Ordenação
Foi proposta a elaboração de um sistema que avalia o desempenho dos métodos de ordenação que aprendemos em sala. O sistema funcionará da seguinte maneira:
O programa mostrará um menu perguntando qual método de ordenação o usuário deseja acessar.
Ao iniciar o programa, será solicitado ao usuário que informe o tamanho do array, e essa informação será armazenada em uma variável.
Em seguida, o usuário informará os números do array, um número inteiro por vez, que serão salvos em um array.
Após a inserção dos números, o método irá ordenar o array de acordo com o método escolhido, informando ao usuário o array original e o array ordenado, além de exibir o tempo que foi necessário para realizar a ordenação.

Para o cálculo de tempo, foi utilizado o método que gera um array com 100, 500 e 1000 posições. Além disso, cada método foi executado 10 vezes e uma média dos tempos foi calculada.

Com 1000 posições... 

• Método de ordenação bolha: 2.39451ms

• Método de ordenação seleção: 1.92879ms

• Método de ordenação inserção: 3.47322ms

Com 500 posições...

• Método de ordenação bolha: 1.65205ms

• Método de ordenação seleção: 0.91297ms

• Método de ordenação inserção: 1.24704ms

Com 100 posições...

• Método de ordenação bolha: 1.1862ms

• Método de ordenação seleção: 0.23596ms

• Método de ordenação inserção: 0.47352ms

A partir dos testes realizados, podemos concluir que o método de ordenação por seleção é o mais rápido em todos os tamanhos de arrays. O método de ordenação bolha é mais eficiente para arrays maiores, porém ainda perde para o método de seleção. O método de inserção mostrou-se eficaz apenas para arrays pequenos, mas ainda assim fica atrás do método de seleção.

Aluno:
Matheus Soares 00239488
