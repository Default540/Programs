package L2;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual hora começou: ");
        int hI = in.nextInt();
        System.out.println("Qual hora terminou: ");
        int hF = in.nextInt();

        final int maxH = 24;
        
        int res = 0;

        if (hI >= maxH) {
            hI-=maxH;
        }
        if (hF >= maxH) {
            hF-=maxH;
        }

        if (hF<hI) {
            res = maxH - hI;  
            hI = 0;  
        }

        
        res += hF-hI;
        
        System.out.println("O jogo durou "+res+"h");
        in.close();
    }
}
