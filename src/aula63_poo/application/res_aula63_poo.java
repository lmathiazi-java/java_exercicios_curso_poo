package aula63_poo.application;

import java.util.Locale;
import java.util.Scanner;

import aula63_poo.entities.Triangulo;

public class res_aula63_poo {
    
        public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
    
        Triangulo X, Y;
        X = new Triangulo();
        Y = new Triangulo();

        System.out.println("entre com as medidas do triangulo X: ");
        X.a = entrada.nextDouble();
        X.b = entrada.nextDouble();
        X.c = entrada.nextDouble();

        System.out.println("entre com as medidas do triangulo Y: ");
        Y.a = entrada.nextDouble();
        Y.b = entrada.nextDouble();
        Y.c = entrada.nextDouble();

        double X_area = X.area();
        System.out.printf("a área do tringulo X é de: %.4f\n", X_area);

        double Y_area = Y.area();
        System.out.printf("a área do tringulo Y é de: %.4f\n", Y_area);

        if (X_area > Y_area)
            System.out.println("maior área: X");
        else
            System.out.println("maior área: Y");

        entrada.close();
    }
}
