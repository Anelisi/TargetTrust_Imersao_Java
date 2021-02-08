import java.util.Scanner;

public class Splits {
    public static void main(String[] args) {
        System.out.println("Digite um texto com mais de 17 letras...\nQue te mostrarei inúmeras coisas legais que " +
                "sei " +
                "fazer com ele!");
        String texto = new Scanner(System.in).nextLine();
        String[] array = texto.split(" ");
        String apelido = texto.substring(0,3);
        String sobrenome = texto.substring(17);

        for (String a : array) {
            System.out.println(a);
        }
        System.out.println(apelido);
        System.out.println(sobrenome);
        
        System.out.print(array[0].toUpperCase());
        for (int i = 1; i < array.length; i++) {
            System.out.print(" " + array[i].toLowerCase());
        }
    }
}
