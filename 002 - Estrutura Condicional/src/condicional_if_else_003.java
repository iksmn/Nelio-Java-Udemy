import java.util.Scanner;

public class condicional_if_else_003 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println ("Quantas horas:");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("Snow");
        }

        else{
            if (hora < 18){
                System.out.println("Sun");
            }

            else {
                System.out.println("Rain");
            }
        }
        sc.close();
    }
}
