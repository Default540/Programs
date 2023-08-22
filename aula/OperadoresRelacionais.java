package aula;

import java.util.Scanner;

public class OperadoresRelacionais {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Digite 2 valores:");
    int v1 = in.nextInt();
    int v2 = in.nextInt();

    boolean res = v1 < v2;

    System.out.println("v1 < v2 => "+res);
    System.out.println("v1 <= v2 => "+(v1<=v2));
    System.out.println("v1 > v2 => "+(v1>v2));
    System.out.println("v1 >= v2 => "+(v1>=v2));
    System.out.println("v1 != v2 => "+(v1!=v2));
    System.out.println("v1 == v2 => "+(v1==v2));


    //fazer porgrama para dizer o maior

    if (v1 > v2) {
      System.out.println(v1+" é o maior");
    }else{
      System.out.println(v2+" é o maior");
    }
    
    in.close();
  }
}
