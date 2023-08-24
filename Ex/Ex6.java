package Ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // p/a^2

        final Scanner in = new Scanner(System.in);
        System.out.println("Qual seu genero (h=1/m=2), peso e altura:");

        int g = in.nextInt();
        int peso = in.nextInt();
        float altura = in.nextFloat();

        float kgm2 = peso/(altura*altura);
        String res = "";

        if (g == 1) {
        
            if (kgm2 < 18) {
                res = "Abaixo do peso";
            }else if (kgm2<=25) {
                res = "Pessoas normais";
            }else if (kgm2 <= 30) {
                res = "Sobrepeso";
            }else if (kgm2 <= 40) {
                res = "pessoa com obesidade moderada";
            }else if (kgm2 > 40) {
                res = "Pessoa com obesidade grave";
            }


        }else{
         
            if (kgm2 < 18) {
                res = "Abaixo do peso";
            }else if (kgm2<=24) {
                res = "Pessoas normais";
            }else if (kgm2 <= 30) {
                res = "Sobrepeso";
            }else if (kgm2 <= 40) {
                res = "pessoa com obesidade moderada";
            }else if (kgm2 > 40) {
                res = "Pessoa com obesidade grave";
            }

        }
        
        System.out.println("Você faz parte da categoria: "+res);
        
    }
}
