public class Main {
    public static void main(String[] args) {

        Expendedor expendedor = new Expendedor(3);
        System.out.println("Precios:\n\n Cocacola: $"+Precios.COCA_COLA.getPrecio()+"\n Sprite: $"+Precios.SPRITE.getPrecio()+"\n Fanta: $"+Precios.FANTA.getPrecio()+"\n Snickers: $ "+Precios.SNICKERS.getPrecio()+ "\n Super 8: $"+Precios.SUPER8.getPrecio());


    }
}