

public class Comprador {

    private int vuelto;

    private String sabor;

    public Comprador(Moneda moneda, Precios PR, Expendedor exp) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {

        Producto comprado = exp.comprarProducto(moneda,PR);

        //intanciar con sabor de bebida:
        if (comprado instanceof Bebida bd) {
            sabor = bd.beber();
        }

        //instanciar el sabor con dulce:
        else if (comprado instanceof Dulce dc) {
            sabor = dc.comer();
        }

        while (true) {
            Moneda aux = exp.getVuelto();
            if (aux == null) break;
            vuelto = vuelto + aux.getValor();
        }
    }
    public String queCompraste() {
        return this.sabor;
    }

    public int cuantoVuelto() {
        return this.vuelto;
    }
}