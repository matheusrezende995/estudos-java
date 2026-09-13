package estudandojava.RelembrandoConceitos;
import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*

        Exercício 1 -  O Carrinho de Compras Completo
    Agora vamos juntar tudo o que você praticou até aqui:

    Scanner para entrada de dados.

    while com opcao.equalsIgnoreCase("s") para controlar a repetição.

    Acumulador (double totalGeral = 0;) criado fora do while para ir somando o valor de cada produto cadastrado.

    if/else no final para dar 10% de desconto se o totalGeral for maior ou igual a R$ 200.


        String opcao = "s";
        double totalGeral = 0;

        while (opcao.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do produto");
            String produto = scanner.next();

            System.out.println("Digite o preço unitário");
            Double preco = scanner.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            double totalItem = preco * quantidade;
            totalGeral += totalItem;

            System.out.println("Subtotal do item (" + produto + "): R$ " + totalItem);

            System.out.print("Deseja adicionar mais um produto? (s/n): ");
            opcao = scanner.next();

        }
        System.out.println("--------------------------------------------");
        System.out.println("O total geral é: " + totalGeral);

        if (totalGeral >= 200) {
            double totalComDesconto = totalGeral * 0.90;
            System.out.println("Você ganhou 10% de desconto! O valor final é: R$ " + totalComDesconto);
        } else {
            System.out.println("O valor final é de: R$ " + totalGeral);
        }

         */


        /*
        String [] nomes = new String[3];

        System.out.println("--- CADASTRANDO NOMES ---");


        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome para a posição " + i + ": ");
            nomes[i] = scanner.next();

        }

        System.out.println("--- LISTA DE NOMES CADASTRADOS ---");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
        */

        double[] temperaturas = new double[5];
        double soma = 0;

        System.out.println("Digite a média de 5 temperaturas: ");

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;

        System.out.println("As temperaturas digitadas foram: " );

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura " + (i + 1) + ": " + temperaturas[i] + "°C");
        }

        System.out.println("A média das teperaturas é : " + media + "C°" );







        scanner.close();
    }
}