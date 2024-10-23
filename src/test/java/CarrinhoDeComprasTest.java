import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarrinhoDeComprasTest {

    @org.junit.Test
    public void testarDescontoPercentual() {
        EstrategiaDeDesconto descontoPercentual = new DescontoPercentual(10);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(descontoPercentual);

        double valorComDesconto = carrinho.calcularPrecoComDesconto(100.0);
        assertEquals(90.0, valorComDesconto, 0.01);
    }

    @Test
    public void testarDescontoValorFixo() {
        EstrategiaDeDesconto descontoFixo = new DescontoValorFixo(20);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(descontoFixo);

        double valorComDesconto = carrinho.calcularPrecoComDesconto(100.0);
        assertEquals(80.0, valorComDesconto, 0.01);
    }

    @Test
    public void testarMudancaDeEstrategia() {
        EstrategiaDeDesconto descontoPercentual = new DescontoPercentual(10);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(descontoPercentual);

        carrinho.setEstrategiaDeDesconto(new DescontoValorFixo(20));
        double valorComDesconto = carrinho.calcularPrecoComDesconto(100.0);

        assertEquals(80.0, valorComDesconto, 0.01);
    }
}
