package estudandojava.variaveis;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("-------------------------------------------");
        System.out.println("O total geral é: " + totalGeral);

        if (totalGeral >= 200) {
            double totalComDesconto = totalGeral * 0.90;
            System.out.println("Você ganhou 10% de desconto! O valor final é: R$ " + totalComDesconto);
        } else {
            System.out.println("O valor final é de: R$ " + totalGeral);
        }






        scanner.close();
    }
}