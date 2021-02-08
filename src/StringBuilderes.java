import java.util.Scanner;

public class StringBuilderes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder builder = new StringBuilder();

        String texto = "tchau!";
        System.out.println("Escreva como foi seu dia, caso queira finalizar, diga tchau! ");

        do {
            texto = sc.nextLine();

            builder.append(texto)
            .append("\n");

        }while (!texto.equalsIgnoreCase("tchau!"));

        System.out.println(builder.toString());
    }
}
