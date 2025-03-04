public class Abbigliamento extends Prodotto {

    public Abbigliamento(String name, Double price, String categoria) {
        super(name, price, categoria);
        this.priceDiscount  = calculateDiscount(); 
    }

    @Override
    public Double calculateDiscount() {
        if (getCategoria().equals("Abbigliamento invernale")) {
            return getPrice() * 0.85; 
        } else {
            return getPrice(); 
        }
    }

    @Override
    public String toString() {
        return "Abbigliamento [toString()=" + super.toString() + "]";
    }
}
