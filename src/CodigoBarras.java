public class CodigoBarras { //os 2 últimos números do código são a soma de todos os demais valor.
    public static void main(String[] args) {
        int[] codBarras = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 5, 2, 9, 0, 0};

        int cbmais = 0;

            for (int cb : codBarras) {
                cbmais += cb;
            }
            if (cbmais > 99) {
                cbmais -= 100;
            }
                codBarras[20] = cbmais / 10;
                codBarras[21] = cbmais % 10;

        for (int c : codBarras) {
            System.out.print(c);
        }
        //System.out.println(cbmais);
    }
}

