package aula;

import java.util.Scanner;

public class ifElse {
  public static void main(String[] args) {
      
    final Scanner in = new Scanner(System.in);
    System.out.println("Qual sua idade:");
    int idade = in.nextInt();
    String res;

    if (idade <= 12) {
      res = "infantil";
    }else if(idade <=17){
      res = "adolecente";
    }else if (idade <= 40) {
      res = "adulto i";
    }else if (idade <= 64) {
      res = "adulto ii";
    }else{
      res = "experiente";
    }

    System.out.println(res);
    in.close();
  }
}
