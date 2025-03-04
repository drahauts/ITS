
public class Elettronica extends Prodotto{
	
	
	

	public Elettronica(String name, Double price, String categoria) {
        super(name, price, categoria);
        this.priceDiscount  = calculateDiscount(); 
    }

	@Override
	  public Double calculateDiscount() {
        if (getPrice() > 500.0) {
            return getPrice() * 0.9; 
        } else {
            return getPrice(); 
        }
    }

	@Override
	public String toString() {
		return "Elettronica [toString()=" + super.toString() + "]";
	}
}
