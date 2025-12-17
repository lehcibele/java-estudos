import java.util.Locale;

public class Varaveis {
    public static void main(String[] args) {
        String nome= "Lele";
        int y = 32;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US); // Define o locale para os EUA para usar o ponto como separador decimal
        System.out.printf("%.4f%n", x);

        // Concatenando strings e variáveis
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos%n", nome, y);
    }
}
