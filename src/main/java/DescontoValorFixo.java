public class DescontoValorFixo implements EstrategiaDeDesconto {
    private double valorDesconto;

    public DescontoValorFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor - valorDesconto;
    }
}
