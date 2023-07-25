# Controle de Estoque da Loja

Este é um aplicativo Java para controlar o estoque de uma loja. O aplicativo permite realizar vendas, verificar o estoque mínimo e encerrar o sistema. Os dados do estoque são armazenados em vetores contendo o código do produto, a descrição, a quantidade em estoque, o estoque mínimo e o preço unitário de venda.

## Dados do Estoque

O aplicativo utiliza os seguintes vetores para armazenar os dados do estoque:

- `codigo`: vetor de inteiros contendo os códigos dos produtos.
- `descricao`: vetor de strings contendo as descrições dos produtos.
- `estoque`: vetor de inteiros contendo a quantidade em estoque de cada produto.
- `estoqueMinimo`: vetor de inteiros contendo a quantidade mínima em estoque de cada produto.
- `precoUnit`: vetor de números de ponto flutuante contendo o preço unitário de venda de cada produto.

## Exibindo os Dados do Estoque

Ao iniciar o aplicativo, os dados do estoque serão exibidos na tela.

## Menu de Opções

O aplicativo possui um menu de opções que pode ser acessado pelo usuário. As opções disponíveis são:

1. Efetuar venda: Permite ao usuário realizar uma venda. O usuário deve informar o código do produto e a quantidade desejada. O aplicativo verifica se há estoque suficiente e, se sim, efetua a venda, dando baixa no estoque e exibindo o valor a ser pago pelo cliente. Caso contrário, exibe a mensagem "Estoque insuficiente" ou "Código inexistente" se o código informado for inválido.

2. Verificar estoque mínimo: Exibe as descrições dos produtos com estoque abaixo do estoque mínimo e informa quantos itens devem ser comprados para atingir o estoque mínimo.

3. Sair: Encerra o sistema.

## Como Executar o Aplicativo

1. Certifique-se de ter o Java JDK instalado em seu computador.
2. Clone este repositório ou faça o download dos arquivos.
3. Abra o terminal ou prompt de comando na pasta do projeto.
4. Compile o código usando o comando: `javac App.java`
5. Execute o aplicativo com o comando: `java App`

## Observações

- Este aplicativo foi desenvolvido como uma solução para uma prova e pode conter limitações ou simplificações.
- Os dados do estoque são armazenados em memória e não são persistentes.
- O aplicativo não possui uma interface gráfica, todas as interações são feitas através do terminal ou prompt de comando.

## Autor

Nome: Felippe Diniz  
E-mail: felippemu@hotmail.com

---
Este projeto é parte de um trabalho escolar/prova e não representa um aplicativo comercial completo. Tem como finalidade apenas demonstrar habilidades de programação em Java.
