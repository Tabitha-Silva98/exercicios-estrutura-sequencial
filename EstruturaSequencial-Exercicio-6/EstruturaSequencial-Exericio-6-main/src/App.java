import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
     Scanner sc = new Scanner(System.in);  
     System.out.println("Entre com o raio do circulo:" );
     double raio = sc.nextDouble();
     sc.close();

     double area = Math.PI * Math.pow(raio, 2);

     System.out.println("A area do circulo e " + area);


    }
}
