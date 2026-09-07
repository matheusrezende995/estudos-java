package miniprojetosjava.minicalculadorasimples;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração
         * 1 - Pedir dois números para o usuário (double)
         * 2 - Apresentar uma tabela/texto para escolher a operação
         * 3 - Resgatar a operação que o usuário selecionou
         * 4 - Realizar o calculo
         * 5 - Exibir o resultado
         * 6 - Se a operação escolhida for inválida, exibir mensagem de erro
         */

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a opção que deseja realizar com os números digitados: ");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Dividir");
        System.out.println("4- multiplicar");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A soma é: " + soma(num1, num2));
                break;
            case 2:
                System.out.println("A subtração é: " + subtracao(num1, num2));
                break;
            case 3:
                System.out.println("A divisão é: " + divisao(num1, num2));
                break;
            case 4:
                System.out.println("A multiplicação é: " + multiplicacao(num1, num2));
                break;
            default:
                System.out.println("Opção inválida!");
        }








        scanner.close();
    }

    public static double soma (double num1 , double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public static double multiplicacao (double num1 , double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public static double divisao (double num1 , double num2) {
        double resultado = num1 / num2;
        return resultado;
    }

    public static double subtracao (double num1 , double num2) {
        double resultado = num1 - num2;
        return resultado;
    }


}
