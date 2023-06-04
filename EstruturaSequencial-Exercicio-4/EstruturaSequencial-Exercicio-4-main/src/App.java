import java.util.Scanner;
		
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite a nota 1");
		double nota1 = sc.nextDouble();
		
        System.out.println("Digite a nota 2");
		double nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3");
		double nota3 = sc.nextDouble();

        System.out.println("Digite a nota 4");
		double nota4 = sc.nextDouble();

        sc.close();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A media da nota e de: " + media);
       
    }
}
