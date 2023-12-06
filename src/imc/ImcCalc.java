package imc;

import java.util.Scanner;

public class ImcCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = obterNumeroPositivo(scanner, "Informe o peso em quilogramas: ");
        double altura = obterNumeroPositivo(scanner, "Informe a altura em metros (Separe com virgula): ");

        double imc = calcularIMC(peso, altura);

        String interpretacao = interpretarIMC(imc);
        System.out.printf("Seu IMC é: %.1f\n", imc);
        System.out.println("Interpretação do IMC: " + interpretacao);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }

        return peso / (altura * altura);
    }

    public static String interpretarIMC(Double imc) {
    	if (imc == null) {
            return null;
        }

        String interpretacao = "";

        if (imc < 18.5) {
            interpretacao = "Abaixo do peso.";
        } else if (imc < 25) {
            interpretacao = "Peso normal.";
        } else if (imc < 30) {
            interpretacao = "Sobrepeso.";
        } else if (imc < 35) {
            interpretacao = "Obesidade grau I.";
        } else if (imc < 40) {
            interpretacao = "Obesidade grau II.";
        } else {
            interpretacao = "Obesidade grau III.";
        }

        return interpretacao;
    }


    public static double obterNumeroPositivo(Scanner scanner, String mensagem) {
        double numero;
        do {
            System.out.print(mensagem);
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next(); // Limpar a entrada inválida
            }
            numero = scanner.nextDouble();
            if (numero <= 0) {
                System.out.println("Por favor, insira um número positivo.");
            }
        } while (numero <= 0);

        return numero;
    }
}
