package com.letscode.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Entre com o a cotação do dolar: ");
        float cotacao = numberScanner.nextFloat();
        System.out.print("Entre com o a quantia em reais: ");
        float quantiaEmReais = numberScanner.nextFloat();

        System.out.printf("R$%.2f são %.2f em dolares %n", quantiaEmReais,(float)(cotacao * quantiaEmReais) );


    }
}
