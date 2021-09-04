package br.com.dio.calculadora;

import java.util.Scanner; // CTRL + shift + O = IMPORTA

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b); // Usando CTRL 2 L
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a,b); // trocar para double para mostrar resto

        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);

    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }


}

   
