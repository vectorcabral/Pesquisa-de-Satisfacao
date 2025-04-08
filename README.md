# Pesquisa-de-Satisfacao


O programa simula uma pesquisa de satisfação de uma empresa fictícia, com o objetivo de coletar e analisar avaliações fornecidas pelos usuários.
1. Declaração de variáveis: O primeiro passo foi declarar as variáveis de entrada (inputs), que representam os dados fornecidos pelos usuários, definindo também seus respectivos tipos (como `String`, `Int`, `Double`, etc.).
2. Laço de repetição: Em seguida, foi criado um laço de repetição para coletar um número `X` de avaliações, representando diferentes opiniões de usuários.
3. Validação das respostas: A cada iteração, o programa verifica o número digitado pelo usuário:
   - Se for 1, exibe a mensagem *"Você avaliou como Excelente!"* e incrementa o contador de avaliações excelentes.
   - Se for 2, exibe *"Você avaliou como Bom!"* e incrementa o contador de avaliações boas.
   - Se for 3, exibe *"Você avaliou como Ruim."* e incrementa o contador de avaliações ruins.
   - Se o número for inválido (qualquer valor diferente de 1, 2 ou 3), o programa exibe uma mensagem de erro e solicita a resposta novamente, repetindo a iteração       com `i--`.
4. Exibição dos resultados: Após a coleta de todas as avaliações válidas, o programa exibe uma mensagem final com o total de votos de cada categoria:  
   - Excelente: `X`  
   - Bom: `Y`  
   - Ruim: `Z`
