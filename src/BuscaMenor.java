public class BuscaMenor {

    public static void main(String[] args) {
        int[] array = {88, 7, 0, -1, 45, 3, 92, -9, 30000001, 12, 23567};

        int menor = array[0];
        for (int a: array) {
            if (menor > a) {
                menor = a;
            }
        }
        System.out.println(menor);

    }
}


