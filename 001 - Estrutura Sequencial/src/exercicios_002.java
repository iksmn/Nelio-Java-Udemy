import java.util.Scanner;

public class exercicios_002 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = (pi*raio*raio);

        System.out.printf("O valor da área do círculo é: %.4f\n", area);

        sc.close();
    }
}
