import java.util.Scanner;

public class exercicios_003 {
    public static void main (String[] args)
    {
        int A, B, C, D, DIFERENCA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();

        System.out.println("Digite o Valor de D: ");
        D = sc.nextInt();

        DIFERENCA = ((A * B)-(C * D));
        System.out.printf("O valor da diferença entre os produtos de A*B e C*D é: %d.", DIFERENCA);
    }
}
