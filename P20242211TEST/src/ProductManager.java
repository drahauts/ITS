import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductManager implements Ordinabile {
    private List<Prodotto> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProducts(Prodotto product) {
        products.add(product);
    }

        public void myProducts() {
    	for(Prodotto product : products) {
    		System.out.println(product);
    	}
    }

    @Override
    public List<Prodotto> sortByPrice(List<Prodotto> products) {
        Collections.sort(products, Comparator.comparing(Prodotto::getPrice));
        return products;
    }

    public void sortProdByPrice() {
        sortByPrice(products);
    }
}
