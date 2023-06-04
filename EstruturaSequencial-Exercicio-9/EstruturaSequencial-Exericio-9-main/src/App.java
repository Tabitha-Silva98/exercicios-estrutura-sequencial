import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);
        int fire, graus;
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fire = sc.nextInt();
        graus = 5 *((fire -32)/ 9);
        sc.close();
   
        System.out.println(fire + "Fahrenheit é: " + graus + "em graus celcius:");
        
    }
}
