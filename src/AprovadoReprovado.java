import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a nota do aluno : ");
        int nota = new Scanner(System.in).nextInt();

        if (nota > 3) {
            System.out.println("APROVADO");
        } else System.out.println("REPROVADO");

        switch (nota) {
            case 0:
            case 1:
                System.out.println("Péssimo");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Excelente!");
                break;
            default:
                System.out.println("Valor incorreto!");
        }


        String nome = "...";
        int senha = 0;
        boolean securit = false;

        do {
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            sc.nextLine();
            securit = nome.equals("Anelisi") && senha == 123;

        }while (!securit);

      int i = 150;
        do {
            System.out.println(i);
            i++;
        } while (i <= 300);

        while (i <=300) {
            System.out.println(i);
            i++;
        }

        for (int c = 150; c <= 300; c++) {
            System.out.println(c);
        }

        for (int z = 0; z < 10; z++) {
            int c = z + z;

            System.out.println(c + " + " + z + " = " + c);
        }

        for (int y = 0; y < 10; y++) {

                if (y % 3 == 0) {
                    System.out.println(y);
                }
        }

     System.out.print("Digite um número: ");
        int num = new Scanner(System.in).nextInt();
        int fat = 1;
        for (int y = 1; y <= num; ++y) {
            fat *= i;
            System.out.println(fat);
        }
        if(num == 0) {
            System.out.println(1);
        }
    }
}
