package estudandojava.Exercicios;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
----------------------------------------------------Exercício 1:--------------------------------------------------------
        Variáveis e Tipos de Dados
        Crie um programa que declare e inicialize variáveis de todos os tipos primitivos em Java (int,
        double, char, boolean, etc.). Exiba o valor de cada variável no console.


        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite 'M' para sexo masculino ou 'F' para feminino: ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Você é estudante? (digite true ou false): ");
        boolean estudante = scanner.nextBoolean();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu sexo é: " + sexo);
        System.out.println("É estudante? - " + (estudante ? "Sim" : "Não"));
        */


        /*
----------------------------------------------------Exercício 2:--------------------------------------------------------
        Conversão de Tipos
        Escreva um programa que converta um valor double em int e outro valor int em double.
        Exiba os resultados das conversões e explique a diferença entre conversão explícita eimplícita.


        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.println("Double para Int: " + valorInt);


        int valorInt1 = 5;
        double valorDouble2 = valorInt1;
        System.out.println("Int para Double: " + valorDouble2);
         */

        /*
----------------------------------------------------Exercício 3:--------------------------------------------------------
        Escreva um programa que leia um número inteiro e um número decimal do teclado e, em
        seguida, exiba a soma desses números no console.


        System.out.println("Digite um número inteiro: ");
        int numint = scanner.nextInt();

        System.out.println("Digite um número decimal: ");
        double numdec = scanner.nextDouble();

        double soma = numint + numdec;

        System.out.println("A soma dos números é: " + soma);
        */

        /*
----------------------------------------------------Exercício 4:--------------------------------------------------------
        Calculadora simples
        Crie um programa que leia dois números inteiros do usuário e exiba a soma, subtração,
        multiplicação, divisão e o módulo desses números no console.


        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        */

        /*
----------------------------------------------------Exercício 5:--------------------------------------------------------
        Conversor de temperatura
        Crie um programa que converta uma temperatura em graus Celsius para Fahrenheit. A
        fórmula de conversão é: F = (C * 9/5) + 32. Exiba o resultado no console.


        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
         */

        /*
----------------------------------------------------Exercício 6:--------------------------------------------------------
        Math.pow
        Escreva um programa que leia dois números inteiros do usuário e exiba o resultado da
        potenciação do primeiro número elevado ao segundo número


        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = Math.pow(base, expoente);

        System.out.println("O resultado de " + base + " elevado a " +
        expoente + " é: " + resultado);

         */


        /*
----------------------------------------------------Exercício 7:--------------------------------------------------------

         */







        scanner.close();
    }
}
