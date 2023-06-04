import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com a medida em metros: ");
    double metros = sc.nextDouble();
    sc.close();

    double centimetros = metros * 100;

    System.out.println("A medida em centimetros e de " + centimetros);

    }
}
