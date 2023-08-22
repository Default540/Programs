package aula;

import java.util.Scanner;

public class ExIF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quais são as notas: ");
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        float res = (n1+n2)/2;
        int media = 7;

        if (res>=media) {
            System.out.println("O aluno foi aprovado");    
        }else{
            System.out.println("O aluno foi reprovado");
        }
        
        //////

        System.out.println("Qual seu salario: ");
        float salario = in.nextFloat();
        System.out.println("Qual o valor do emprestimo: ");
        float emprestimo = in.nextFloat();
        System.out.println("Quantas parcelas: ");
        int parcelas = in.nextInt();

        final float porcent = 0.3f;
        float maxParcela = salario*porcent;
        float valorParcela = emprestimo/parcelas;

        if (maxParcela > valorParcela) {
            System.out.println("O emprestimo pode ser consedido");   
        }else{
            System.out.println("O emprestimo não pode ser consedido\nO valor maximo da parcela é "+valorParcela);
        }

        ///////

        System.out.println("Coloque 2 valores: ");
        int x = in.nextInt();
        int y = in.nextInt();

        if (x<y) {
            System.out.printf("X => %d é menor que Y => %d\n",x,y);
        }else {

            int z = y;
            y=x;
            x=z;

            System.out.printf("X => %d é menor que Y => %d\n",x,y);
        }

        in.close();
    }
}
