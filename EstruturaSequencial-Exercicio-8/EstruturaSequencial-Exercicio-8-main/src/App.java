import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto voce ganha por hora: ");
        double valor = sc.nextDouble();
    
        System.out.println("Digite suas horas trabalhadas por mes: ");
        double horasMes = sc.nextDouble();
        sc.close();
    
        double salarioMes = valor * horasMes;
        
        System.out.println("O total do salario ao mes e de: " + salarioMes);

    }
}
