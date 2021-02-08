public class InformacoesSistema {

    public static void main(String[] args) {
        System.out.println("Processadores disponíveis");
        System.out.println(Runtime.getRuntime().availableProcessors()); // Para saber quantos processadores há na
        // máquina
        System.out.printf("Memória máxima JVM (HEAP): \n %d MB", Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.printf("Memória máxima da máquina: \n %d MB", Runtime.getRuntime().totalMemory()/1024/1024);

    }
}
