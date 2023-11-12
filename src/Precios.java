

public enum Precios {

    COCA_COLA("Coca Cola", 1000),
    SPRITE("Sprite", 1000),
    FANTA("Fanta", 1000),
    SNICKERS("Snickers", 350),
    SUPER8("Super 8", 500);

    private final String queEs;
    private final int precio;

    Precios(String queEs, int precio) {
        this.queEs = queEs;
        this.precio = precio;
    }

    public String getQueEs() {
        return this.queEs;
    }

    public int getPrecio() {
        return this.precio;
    }
}
