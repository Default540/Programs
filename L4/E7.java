package L4;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta                             
que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O                             
algoritmo deve também contar quantas vezes o usuário tentou digitar a senha                       
correta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa                   
informação na tela.
 */
public class E7 {
    public static void main(String[] args) {
        final int senha = 12345;
        final Scanner in = new Scanner(System.in);

        int senhaIn = in.nextInt();
        
        int count = 0;
        while (senha != senhaIn) {
            senhaIn = in.nextInt();
            count++;
        }
        System.out.println(count);
        in.close();
    }
}
