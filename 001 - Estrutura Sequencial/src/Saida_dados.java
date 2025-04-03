import java.util.Locale;

public class Saida_dados {
    public static void main(String[] args)
    {
        int y = 32;
        System.out.println(y);

        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;


        System.out.println(x);
        System.out.printf("%.2f%n", x); //printf (f de formatted) (%n é a quebra de linha)
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.println("Resultado = " + x + " metros.");

        System.out.printf("Resultado = %.2f metros.\n", x); // config no printf

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais.\n", nome, idade, renda);// concatenção printf

    }
}