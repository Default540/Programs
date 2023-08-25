package L3;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual sua altura e qual seu sexo (h=1/m=2):");
        float h = in.nextFloat();
        int s = in.nextInt();
        float p;

        if (s == 1) {
            p = (72.7f*h)-58;
        }else{
            p = (62.1f*h)-44.7f;
        }

        System.out.println("Seu peso ideal é: "+p);
        in.close();
    }
}
