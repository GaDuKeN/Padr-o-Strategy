public class DescontoPercentual implements EstrategiaDeDesconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor - (valor * percentual / 100);
    }
}
