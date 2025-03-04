public abstract class Prodotto {
    String name;
    Double price;
    String categoria;
    Double priceDiscount ; 

    public Prodotto(String name, Double price, String categoria) {
        this.name = name;
        this.price = price;
        this.categoria = categoria;
        this.priceDiscount = null; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
        this.priceDiscount  = calculateDiscount();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPriceDiscount() {
        return priceDiscount ;
    }

    public abstract Double calculateDiscount();

    @Override
    public String toString() {
        return "Prodotto [name=" + name + ", price=" + price + ", priceWithDiscount=" + priceDiscount  + ", categoria=" + categoria + "]";
    }
}
