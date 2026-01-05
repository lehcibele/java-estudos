import java.util.Locale;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Scanner tipo para entrada de dados
        Scanner sc = new Scanner(System.in);
        
        // Entradas para string
        String x = sc.next();

        // Entradas para inteiros
        int y = sc.nextInt();

        // Entradas para double
        double z = sc.nextDouble();

        // Ler um caractere
        char letra = sc.next().charAt(0);

        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou: " + y);
        System.out.printf("Você digitou: %.2f%n", z);
        System.out.println("Você digitou: " + letra);

        // Encerra o Scanner
        sc.close();
        
    }
}
