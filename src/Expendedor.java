

public class Expendedor {

    private final Deposito<Moneda> monVu;

    //Bebidas

    private final Deposito<Producto> cocaCola;
    private final Deposito<Producto> sprite;
    private final Deposito<Producto> fanta;

    //Comidas
    private final Deposito<Producto> snickers;
    private final Deposito<Producto> super8;

    public Expendedor(int numeroProductos) {
        this.cocaCola = new Deposito<>();
        this.fanta = new Deposito<>();
        this.sprite = new Deposito<>();
        this.snickers = new Deposito<>();
        this.super8 = new Deposito<>();
        this.monVu = new Deposito<>();

        for (int i = 0; i < numeroProductos; i++) {
            this.cocaCola.add(new CocaCola(i));
            this.fanta.add(new Fanta(i));
            this.sprite.add(new Sprite(i));
            this.snickers.add(new Snickers(i));
            this.super8.add(new Super8(i));
        }
    }

    public Producto comprarProducto(Moneda moneda, Precios tipo)
            throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        if (moneda == null) {
            throw new PagoIncorrectoException("Error en el pago: Moneda null");
        }
        if (moneda.getValor() < tipo.getPrecio()) {
            this.monVu.add(moneda);
            throw new PagoInsuficienteException("Error en el pago: Dinero insuficiente");
        }


        //switch (tipo){
        //    case SNICKERS ->
        //        break;
         //   case FANTA ->
         //       break;
         //   case COCA_COLA ->
         //       break;
         //   case FANTA ->
        //        break;
        //    case SUPER8 ->
        //        break;
        //    default ->
        //        null;
        //}

        Deposito<Producto> aux = tipo == Precios.COCA_COLA ? this.cocaCola
                : tipo == Precios.SPRITE ? this.sprite
                : tipo == Precios.FANTA ? this.fanta
                : tipo == Precios.SNICKERS ? this.snickers
                : tipo == Precios.SUPER8 ? this.super8
                : null;

        Producto producto = aux.get();
        if (producto == null) {
            this.monVu.add(moneda);
            throw new NoHayProductoException("Error en el Producto: No queda mas productos");
        }

        if (aux == null) {
            this.monVu.add(moneda);
            throw new NoHayProductoException("Error en el Producto");
        }

        int vuelto = moneda.getValor() - tipo.getPrecio();
        while (vuelto != 0) {
            this.monVu.add(new Moneda100());
            vuelto = vuelto+100;
        }

        return producto;
    }

    public Moneda getVuelto() {
        return this.monVu.get();
    }
}
