public class CarrinhoDeCompras {
    private EstrategiaDeDesconto estrategiaDeDesconto;

    public CarrinhoDeCompras(EstrategiaDeDesconto estrategiaDeDesconto) {
        this.estrategiaDeDesconto = estrategiaDeDesconto;
    }

    public void setEstrategiaDeDesconto(EstrategiaDeDesconto estrategiaDeDesconto) {
        this.estrategiaDeDesconto = estrategiaDeDesconto;
    }

    public double calcularPrecoComDesconto(double valor) {
        return estrategiaDeDesconto.aplicarDesconto(valor);
    }
}
