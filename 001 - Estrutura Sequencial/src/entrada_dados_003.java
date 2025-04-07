import java.util.Scanner;

public class entrada_dados_003 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x=sc.nextInt();
        sc.nextLine(); //consome a quebra de linha (enter) do nextInt
        s1 = sc.nextLine(); //nextline lê o texto escrito até encontrar um 'enter'
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
