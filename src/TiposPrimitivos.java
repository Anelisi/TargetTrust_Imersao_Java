public class TiposPrimitivos {
    public static void main(String[] args) {
        byte idade = 33;
        String anoAtual = "2021";
        boolean chove = false;
        double pi = Math.PI;
        char inicial = 'A';
        float dolar = 5.35f;
        Long populacaoBrasil = 290000000L;
        Long populacaoMundial = 700000000000L;

        System.out.printf("Idade %d\nAno Atual %s\nEstá chovendo? %b\nValor de PI = %.2f\nSua inicial é: %s\n", idade
                , anoAtual,chove,pi,inicial);

        System.out.printf("Dólar Hoje = R$%.2f\nPopulação Brasileira = %d\nPopulação Mundial = %d", dolar,
                populacaoBrasil,populacaoMundial);

        System.out.println("\n========================");
        System.out.println("Idade  = " + idade);
        System.out.println("Ano Atual = " + anoAtual);
        System.out.println("Está chovendo? " + chove);
        System.out.println("Valor de PI = " + pi);
        System.out.println("Sua inicial é: " + inicial);
        System.out.println("Dorlar Hoje = R$" + dolar);
        System.out.println("População Brasileira = " + populacaoBrasil);
        System.out.println("População Mundial = " + populacaoMundial);

        System.out.println("\n========================");

        int vendas = 1023;
        System.out.println("Quantidade de vendas do dia: " + vendas);

        boolean pago = true;
        System.out.println("Está pago? " + pago);

        char pagamento = 'C';
        System.out.println("Forma de pagamento: " + pagamento);

        char bin = 0;
        String cpf = "123.456.789-00";
        System.out.println("CPF = " + cpf);

        float valorProduto = 18.70f;
        System.out.printf("Remédio %.2f\n", valorProduto);

        String codigoBarras = "0218435431038464131587610365135847364136846336";
        System.out.println("Código de barras \n" + codigoBarras);
    }
}
