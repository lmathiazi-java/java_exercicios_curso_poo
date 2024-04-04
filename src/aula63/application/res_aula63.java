package aula63.application;

import java.util.Locale;
import java.util.Scanner;

public class res_aula63 {
    
        public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("entre com as medidas do triangulo X: ");
        double Xa = entrada.nextDouble();
        double Xb = entrada.nextDouble();
        double Xc = entrada.nextDouble();

        System.out.println("entre com as medidas do triangulo Y: ");
        double Ya = entrada.nextDouble();
        double Yb = entrada.nextDouble();
        double Yc = entrada.nextDouble();

        double p = (Xa + Xb + Xc) / 2;
        double X_area = Math.sqrt(p * (p - Xa) * (p - Xb) * (p - Xc));

        p = (Ya + Yb + Yc) / 2;
        double Y_area = Math.sqrt(p * (p - Ya) * (p - Yb) * (p - Yc));

        System.out.printf("a área do tringulo X é de: %.4f\n", X_area);
        System.out.printf("a área do tringulo Y é de: %.4f\n", Y_area);

        if (X_area > Y_area)
            System.out.println("maior área: X");
        else
            System.out.println("maior área: Y");

        entrada.close();

    }
}
