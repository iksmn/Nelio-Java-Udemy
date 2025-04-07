import java.util.Scanner;

public class entrada_dados_002 {
    public static void main (String[] args){

       Scanner sc = new Scanner(System.in);

       String x;
       int y;
       double z;

       x = sc.next();
       y = sc.nextInt();
       z = sc.nextDouble();

       System.out.println("Dados digitados: ");
       System.out.println("Voce digitou: " + x);
       System.out.println("Voce digitou: " + y);
       System.out.println("Voce digitou: " + z);

       sc.close();


    }
}
