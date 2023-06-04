import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
    
        Scanner sc  = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        sc.close();

        System.out.print("O numero digitado foi: " + num);
    }
}
