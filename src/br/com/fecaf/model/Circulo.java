package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {

    public double raio, area, perimetro;

    // Instancia Biblioteca Scanner
    Scanner scanner = new Scanner(System.in);

    //Função para registrar um círculo e quardar as informações em variáveis

    public boolean cadastrarCirculo () {
        System.out.println("/******************************/");
        System.out.println("/*      Cadastro Circulo      */");
        System.out.println("/******************************/");
        System.out.print("Informe o raio do circulo: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso !");
        System.out.println("/******************************/");
        return true;

    }

    // Função para calcular área
    public void calcularArea () {
        System.out.println("/* Calculando Area */");

        //area = 3.14159 * (raio * raio);

        //area = Math.PI * (raio * raio);

        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area é " + area);

    }

    // Função para calcular perímetro
    public void calcularPerimetro () {
        System.out.println("/* Calculando o Perimetro */");

        perimetro = 2 * Math.PI * raio;
    }



}
