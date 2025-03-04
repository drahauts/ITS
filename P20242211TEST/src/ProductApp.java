public class ProductApp {
    public static void main(String[] args) {
    	ProductManager manager = new ProductManager();
    	
    	// add
    	manager.addProducts(new Elettronica("Laptop", 1200.0, "Elettronica"));
    	manager.addProducts(new Abbigliamento("Giacca", 130.0, "Abbigliamento invernale"));
    	manager.addProducts(new Elettronica("AirPods 2", 120.0, "Elettronica"));
    	manager.addProducts(new Abbigliamento("T-Shirt", 30.0, "Abbigliamento estivo"));
    	manager.addProducts(new Elettronica("Aspirapolvere Dyson", 599.0, "Elettronica"));
    	manager.addProducts(new Abbigliamento("New Balance 750", 129.0, "Abbigliamento estivo"));
    	manager.addProducts(new Elettronica("TV Samsung 72°", 720.0, "Elettronica"));
    	manager.addProducts(new Abbigliamento("Dr. Martins", 100.0, "Abbigliamento invernale"));
    	
    	System.out.println("Prodotti non ordinati: ");
    	manager.myProducts();
    	System.out.println("--------------------------------------------------------------");
    	// ordino prodotti per prezzo
    	manager.sortProdByPrice();
    	System.out.println("Prodotti ordinati per prezzo: ");
    	manager.myProducts();
        }
}
