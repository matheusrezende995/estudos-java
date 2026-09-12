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
            Comparação Simples
        Crie um programa que leia dois números inteiros e exiba se o primeiro é maior, menor ou
        igual ao segundo.


        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número digitado é maior que o segundo.");
        } else if (num1 < num2) {
            System.out.println("O primeiro número digitado é menor que o segundo.");
        } else {
            System.out.println("Os dois números são iguais");
        }
         */

        /*
----------------------------------------------------Exercício 8:--------------------------------------------------------
        Exercício 17: Verificação de Paridade
        Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
        Dica: Você pode utilizar a divisão de resto, com o operador %.


        System.out.println("Digite o número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
         */

        /*
----------------------------------------------------Exercício 9:--------------------------------------------------------
        Desenvolva um programa que leia três números inteiros e exiba o maior deles.

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("O maior número é: " + maior);

         */

        /*
----------------------------------------------------Exercício 10:-------------------------------------------------------
         Crie um programa que leia a idade de uma pessoa e verifique se ela é elegível para votar
(idade igual ou superior a 18 anos)


        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }
        */

        /*
----------------------------------------------------Exercício 10:-------------------------------------------------------
        Escreva um programa que leia um número inteiro e verifique se ele está entre 10 e 20
         (inclusive). Exiba uma mensagem informando se o número está dentro ou fora do intervalo.


        System.out.println("Digite um número entre 10 e 20: ");
        int num = scanner.nextInt();

        if (num >= 10 && num <= 20) {
            System.out.println("O número está dentro do invervalo: " + num);
        } else {
            System.out.println("O número está fora do invervalo: " + num);
        }
        */

        /*
----------------------------------------------------Exercício 11:-------------------------------------------------------
        Desenvolva um programa que leia duas strings do usuário e verifique se elas são iguais.
        Exiba uma mensagem informando o resultado da comparação.


        System.out.println("Digite a primeira string: ");
        String string1 = scanner.next();

        System.out.println("Digite a segunda string: ");
        String string2 = scanner.next();

        if (string1.equals(string2)) {
            System.out.println("As strings são iguais");
        } else {
            System.out.println("As string não são iguais");
        }
        */

        /*
----------------------------------------------------Exercício 12:-------------------------------------------------------
        Escreva um programa que leia a idade de três pessoas e verifique se pelo menos duas
        delas são maiores de idade (18 anos ou mais).


        System.out.println("Digite a primeira idade: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite a segunda idade: ");
        int idade2 = scanner.nextInt();

        System.out.println("Digite a terceira idade: ");
        int idade3 = scanner.nextInt();

        int maioridade = 0;

        if (idade1 >= 18) maioridade++;
        if (idade2 >= 18) maioridade++;
        if (idade3 >= 18) maioridade++;

        if (maioridade >= 2) {
            System.out.println("Pelo menos 2 pessoas são maior de idade");
        } else {
            System.out.println("Menos de 2 pessoas são maiores de idade");
        }

        */

        /*
----------------------------------------------------Exercício 13:-------------------------------------------------------
        Escreva um programa que leia três números inteiros e verifique se pelo menos dois deles
        são positivos.


        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int positivos = 0;

        if (num1 > 0) positivos++;
        if (num2 > 0) positivos++;
        if (num3 > 0) positivos++;

        if (positivos >2) {
            System.out.println("Pelo menos 2 numeros são positivos");
        } else {
            System.out.println("Menos de 2 números são positivos");
        }
        */

        /*
----------------------------------------------------Exercício 14:-------------------------------------------------------

        Enunciado: Desenvolva um programa que leia cinco números inteiros do usuário, um por
        vez, e acumule a soma deles usando o operador de atribuição +=. Exiba o total acumulado
        ao final.
        Dica: Utilize o Scanner para pedir os dados, e você pode utilizar um loop for para repetir a
        solicitação de dados cinco vezes




        int somaAcumulada = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.println("Digite o: " + i + "° número inteiro: ");
            int valorDigitado = scanner.nextInt();
            somaAcumulada += valorDigitado;
        }

        System.out.println("Soma acumulada: " + somaAcumulada);
        */

        /*
----------------------------------------------------Exercício 15:-------------------------------------------------------
        Enunciado: Escreva um programa que leia um número inteiro e verifique se ele é positivo,
        negativo ou zero. Exiba uma mensagem apropriada para cada caso

        System.out.println("Digite um número");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("O numero é 0");
        } else if (num < 0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O número é positivo");
        }
        */
        /*
----------------------------------------------------Exercício 16:-------------------------------------------------------
         */

        scanner.close();
    }



    }

