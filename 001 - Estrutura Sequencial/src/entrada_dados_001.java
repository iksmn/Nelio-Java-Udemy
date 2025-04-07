import java.util.Scanner;

public class entrada_dados_001 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double z;
        z = sc.nextDouble();
        System.out.printf("Você digitou: %.2f\n", z);

        char w;
        w = sc.next().charAt(0); //leitura de caractere
        System.out.println("Você digitou: " + w);

        sc.close();
    }
}
