import java.util.Locale;

public class Saida_dados {
    public static void main(String[] args)
    {
        int y = 32;
        System.out.println(y);

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x); //printf (f de formatted) (%n é a quebra de linha)
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

    }
}