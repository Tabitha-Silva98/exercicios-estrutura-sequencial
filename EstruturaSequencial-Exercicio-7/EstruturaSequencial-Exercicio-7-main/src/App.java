import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
      Scanner sc = new Scanner (System.in); 

      System.out.println("Digite o lado de um quadrado");
      double lado = sc.nextDouble();
      sc.close();

      double area = lado * lado;

      double dobroArea = area * 2;

      System.out.println("O dobro da area e de: " + dobroArea);

    }
}
