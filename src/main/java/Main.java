public class Main {
    public static void main(String[] args) {
        double valorOriginal = 100.0;

        // Usando desconto percentual
        EstrategiaDeDesconto descontoPercentual = new DescontoPercentual(10); // 10% de desconto
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(descontoPercentual);
        System.out.println("Preço com 10% de desconto: " + carrinho.calcularPrecoComDesconto(valorOriginal));

        // Alterando para desconto fixo
        EstrategiaDeDesconto descontoFixo = new DescontoValorFixo(20); // Desconto de 20 reais
        carrinho.setEstrategiaDeDesconto(descontoFixo);
        System.out.println("Preço com desconto fixo de 20 reais: " + carrinho.calcularPrecoComDesconto(valorOriginal));
    }
}
