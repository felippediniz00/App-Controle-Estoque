import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //1) Crie vetores para armazenar os dados e exiba os dados na tela.
       
        int codigo[] = {110,112,130,114,123,456,100,200};
        String descricao[] = {"botao", "linha", "tesoura", "fita", "revista", "barbante", "agulha", "tecido"};
        int estoque[] = {20,10,3,8,3,10,8,12};
        int estoqueMinimo[] = {15,12,5,6,2,15,6,10};
        double precoUnit[] = {0.30,2.60,13.00,0.80,10.00,8.00,5.20,3.90};

        for (int i = 0; i < codigo.length; i++) {
            System.out.printf("%4d %10s %4d %4d %8.2f\n", codigo[i],descricao[i],estoque[i],estoqueMinimo[i],precoUnit[i]);
        }

        int opcao;
        do {
            System.out.println("\nMENU\n" +
                    "1-Efetuar venda\n" +
                    "2-Verificar estoque mínimo\n" +
                    "3-Sair\n" +
                    "Digite a opção desejada: ");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    efetuarVenda(codigo, descricao, estoque, precoUnit);
                    break;
                case 2:
                    verificarEstoqueMinimo(estoque, estoqueMinimo, descricao);
                    break;
                case 3:
                    encerrarSistema();
                    break;
                default:
                    opcaoInvalida();
                    break;
            }
        }while(opcao != 3);
        scan.close();
    }
    public static void efetuarVenda(int[] codigo, String[] descricao, int[] estoque, double[] precoUnit){
        /*1) Na opção 1, solicite que o usuário digite o código do produto. Se o código informado for válido, solicite que o usuário digite a quantidade desejada. Verifique se há estoque e, se houver, efetue a venda, dando baixa no estoque, e exiba o valor a ser pago pelo cliente. Se o estoque não for suficiente, exiba a mensagem “Estoque suficiente”. Se o código informado for inválido, exiba a mensagem “Código inexistente”.*/

        Scanner scan = new Scanner(System.in);

        int codDigitado, qtdDesejada = 0, qtdEmEstoque = estoque[0];
        double totalValor;

        System.out.println("Digite o código do produto: ");
        codDigitado = scan.nextInt();
        boolean achou = false;
        for (int i = 0; i < descricao.length; i++){
            if (codDigitado == codigo[i]){
                achou = true;
                qtdEmEstoque = estoque[i];
            }
        }
        if(!achou){
            System.out.println("Código Inexistente!");
        }else {
            System.out.println("Digite a quantidade desejada: ");
            qtdDesejada = scan.nextInt();
            if(qtdDesejada <= qtdEmEstoque){
                System.out.println("Há estoque!");
                for(int i = 0; i < descricao.length; i++){
                    if (codDigitado == codigo[i]){
                        estoque[i] -= qtdDesejada;
                        totalValor = qtdDesejada * precoUnit[i];
                        System.out.printf("O valor a ser pago pelo cliente é: %.2f reais\n", totalValor);
                    }
                }
            }
            if (qtdDesejada > qtdEmEstoque){
                System.out.println("Estoque insuficiente!");
                System.out.println("A quantidade em estoque é: " + qtdEmEstoque);
            }
        }
    }
    public static void verificarEstoqueMinimo(int estoque[], int estoqueMinimo[], String descricao[]){
        //4) Na opção 2, exiba as descrições dos produtos com estoque abaixo do estoque mínimo e
        // informe quantos itens devem ser comprados para atingir o estoque mínimo.

        int qtdFaltando;
        String produtoFaltando = descricao[0];

        for (int i = 0; i < estoqueMinimo.length; i++){
            if (estoque[i] < estoqueMinimo[i]){
                qtdFaltando = estoqueMinimo[i] - estoque[i];
                produtoFaltando = descricao[i];
                System.out.println(produtoFaltando);
                System.out.println("Estoque abaixo do minímo!");
                System.out.println("Faltam " + qtdFaltando + " quantidades para atingir o estoque minimo!\n");
            }
        }
    }
    
    public static void encerrarSistema(){
        System.out.println("Encerrando sistema!");
    }
    
    public static void opcaoInvalida(){
        System.out.println("Opção inválida, digite novamente!");
    }
}