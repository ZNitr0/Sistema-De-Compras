import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> Compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.Compras = new ArrayList< >();
    }

    public boolean Lancacompra(Compra compra) {
        if (compra.getValor() > compra.getValor()) {
            this.saldo -= compra.getValor();
            return true;
        }
        this.Compras.add(compra);
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return Compras;
    }
}
